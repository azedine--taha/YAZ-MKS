package app.services.equipementService;

import java.util.List;

import javax.transaction.Transactional;


import app.entity.equipementEntity;

public interface IEquipementService {
	
	public void validateEquipement(equipementEntity equipementEntity) ;

	public List<equipementEntity> getListEquipement() ;
	

	public equipementEntity getEquipementByID(int id) ;

	public void deleteEquipement(equipementEntity equipementEntity) ;


	public equipementEntity createEquipement() ;

}
