package app.services.familleEquipementService;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import app.entity.familleEquipementEntity;

public interface IFamilleEquipementService {
	
	public void validateEquipement(familleEquipementEntity familleEquipementEntity) ;

	public List<familleEquipementEntity> getListFamilleEquipement() ;
	

	public familleEquipementEntity getFamilleEquipementByID(int id) ;

	public void deleteEquipement(familleEquipementEntity familleEquipementEntity) ;

    public familleEquipementEntity getFamilleEquipementByCode(String code);
	public familleEquipementEntity createFamilleEquipement() ;

}
