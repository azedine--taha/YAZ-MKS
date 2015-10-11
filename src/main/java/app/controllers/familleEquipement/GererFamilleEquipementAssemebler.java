package app.controllers.familleEquipement;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import app.controllers.equipement.EquipementDTO;
import app.entity.familleEquipementEntity;
import app.services.equipementService.EquipementService;
import app.services.equipementService.GererEquipementService;
import app.services.equipementService.IEquipementService;

@Component
@Scope
public class GererFamilleEquipementAssemebler {
	
	@Autowired
	IEquipementService IequipementService;

	public static  familleEquipementEntity getEntity(FamilleEquipementDTO familleEquipementDTO){
		familleEquipementEntity familleEquipementEntity=new familleEquipementEntity();
		familleEquipementEntity.setCode(familleEquipementDTO.getCode());
		familleEquipementEntity.setLibelle(familleEquipementDTO.getLibelle());
		familleEquipementEntity.setIdFamille(familleEquipementDTO.getIdFamille());
		return familleEquipementEntity;
	}
	
	public static  FamilleEquipementDTO createFamilleEquipementDTO(familleEquipementEntity familleEquipementEntity){
		FamilleEquipementDTO familleEquipementDTO=new FamilleEquipementDTO();
		familleEquipementDTO.setCode(familleEquipementEntity.getCode());
		familleEquipementDTO.setLibelle(familleEquipementEntity.getLibelle());
		familleEquipementDTO.setIdFamille(familleEquipementEntity.getIdFamille());
		return familleEquipementDTO;
	}
	
	public static  List<FamilleEquipementDTO> createListeFamilleEquipementDTO(List<familleEquipementEntity> listFamilleEquipementEntity){
		List<FamilleEquipementDTO> listFamilleEquipementDTO=new ArrayList<FamilleEquipementDTO>();
		for(familleEquipementEntity familleEquipementEntity:listFamilleEquipementEntity){
			listFamilleEquipementDTO.add(createFamilleEquipementDTO(familleEquipementEntity));
		}
		return listFamilleEquipementDTO;
		
	}

}
