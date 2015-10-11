package app.controllers.equipement;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.transaction.Transactional;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import app.controllers.familleEquipement.FamilleEquipementDTO;
import app.controllers.familleEquipement.GererFamilleEquipementAssemebler;
import app.entity.equipementEntity;
import app.entity.familleEquipementEntity;
import app.repositories.FamilleEquipementRepository;
import app.services.familleEquipementService.FamilleEquipementService;
import app.services.familleEquipementService.GererFamilleEquipementService;
import app.services.familleEquipementService.IFamilleEquipementService;

@Component
@Scope
public  class GererEquipementAssembler {
	
	
    
    @Autowired
    private static  IFamilleEquipementService IFamilleEquipementService;

	

	public  static equipementEntity getEntity(EquipementDTO equipementDTO){
		equipementEntity equipementEntity=new equipementEntity();
		equipementEntity.setCode(equipementDTO.getCode());
		equipementEntity.setLibelle(equipementDTO.getLibelle());
		equipementEntity.setIdEquipement(equipementDTO.getIdEquipement());
//		 familleEquipementEntity  f=new familleEquipementEntity();
//         f= familleEquipementService.findByCode(equipementDTO.getCode());
//         equipementEntity.setFamilleEquipementEntity(f);
		
		return equipementEntity;
	}
	
	public  static EquipementDTO createEquipementDTO(equipementEntity equipementEntity){
		EquipementDTO equipementDTO=new EquipementDTO();
		equipementDTO.setCode(equipementEntity.getCode());
		equipementDTO.setLibelle(equipementEntity.getLibelle());
		equipementDTO.setIdEquipement(equipementEntity.getIdEquipement());
		if(equipementEntity.getFamilleEquipementEntity()!=null) {
		    equipementDTO.setIdFamille(equipementEntity.getFamilleEquipementEntity().getCode());
		}
		List<familleEquipementEntity> listFamilleEquipementEntity=new ArrayList<familleEquipementEntity>();
        if(listFamilleEquipementEntity!=null){
              listFamilleEquipementEntity=IFamilleEquipementService.getListFamilleEquipement();
              List<FamilleEquipementDTO> listFamilleEquipementDTO=GererFamilleEquipementAssemebler.createListeFamilleEquipementDTO(listFamilleEquipementEntity);
              equipementDTO.setListFamille(listFamilleEquipementDTO);
          }
		return equipementDTO;
	}
}
