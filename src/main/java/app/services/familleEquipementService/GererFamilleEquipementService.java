package app.services.familleEquipementService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import app.controllers.familleEquipement.FamilleEquipementDTO;
import app.controllers.familleEquipement.GererFamilleEquipementAssemebler;
import app.entity.familleEquipementEntity;
import app.repositories.FamilleEquipementRepository;

@Service
public class GererFamilleEquipementService {
	

	@Autowired
    IFamilleEquipementService familleEquipementService;
	
	public void validateFamilleEquipement(FamilleEquipementDTO familleEquipementDTO) {
		familleEquipementEntity familleEquipementEntity= GererFamilleEquipementAssemebler.getInstance().getEntity(familleEquipementDTO);
		this.familleEquipementService.validateEquipement(familleEquipementEntity);
	}

	public List<familleEquipementEntity> getListFamilleEquipement() {
		return familleEquipementService.getListFamilleEquipement();
	}

	public FamilleEquipementDTO getFamilleEquipementByID(int id) {
		familleEquipementEntity familleEquipementEntity= familleEquipementService.getFamilleEquipementByID(id);
		return GererFamilleEquipementAssemebler.getInstance().createFamilleEquipementDTO(familleEquipementEntity);
	}

	public void deleteEquipement(FamilleEquipementDTO familleEquipementDTO) {
		familleEquipementEntity familleEquipementEntity= GererFamilleEquipementAssemebler.getInstance().getEntity(familleEquipementDTO);
		this.familleEquipementService.deleteEquipement(familleEquipementEntity);
	}

	public FamilleEquipementDTO createFamilleEquipement() {
		FamilleEquipementDTO familleEquipementDTO =new FamilleEquipementDTO();
		return familleEquipementDTO;
	}

}
