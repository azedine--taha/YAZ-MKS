package app.services.equipementService;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import app.controllers.equipement.EquipementDTO;
import app.controllers.equipement.GererEquipementAssembler;
import app.controllers.familleEquipement.FamilleEquipementDTO;
import app.controllers.familleEquipement.GererFamilleEquipementAssemebler;
import app.entity.equipementEntity;
import app.entity.familleEquipementEntity;
import app.repositories.EquipementRepository;
import app.repositories.FamilleEquipementRepository;
import app.services.familleEquipementService.FamilleEquipementService;
import app.services.familleEquipementService.IFamilleEquipementService;

@Service
public class GererEquipementService {
	
	@Autowired
	IEquipementService equipementService;
	@Autowired
	IFamilleEquipementService familleEquipementService;
	
	public EquipementDTO validateEquipement(EquipementDTO equipementDTO) {
		equipementEntity equipementEntity= GererEquipementAssembler.getEntity(equipementDTO);
		  familleEquipementEntity  f=new familleEquipementEntity();
          f= familleEquipementService.getFamilleEquipementByCode((equipementDTO.getIdFamille()));
          equipementEntity.setFamilleEquipementEntity(f);
		this.equipementService.validateEquipement(equipementEntity);
		return GererEquipementAssembler.createEquipementDTO(equipementEntity);
	}

	public List<equipementEntity> getListEquipement() {
		return equipementService.getListEquipement();
	}

	public EquipementDTO getEquipementByID(int id) {
		equipementEntity equipementEntity= equipementService.getEquipementByID(id);
		return GererEquipementAssembler.createEquipementDTO(equipementEntity);
	}

	public void deleteEquipement(EquipementDTO equipementDTO) {
		equipementEntity equipementEntity= GererEquipementAssembler.getEntity(equipementDTO);
		this.equipementService.deleteEquipement(equipementEntity);
	}

	public EquipementDTO createEquipement() {
		EquipementDTO equipementDTO =new EquipementDTO();
		List<familleEquipementEntity> listFamilleEquipementEntity=new ArrayList<familleEquipementEntity>();
		if(listFamilleEquipementEntity!=null){
			listFamilleEquipementEntity=	familleEquipementService.getListFamilleEquipement();
			List<FamilleEquipementDTO> listFamilleEquipementDTO=GererFamilleEquipementAssemebler.createListeFamilleEquipementDTO(listFamilleEquipementEntity);
			equipementDTO.setListFamille(listFamilleEquipementDTO);
		}
		return equipementDTO;
	}

}
