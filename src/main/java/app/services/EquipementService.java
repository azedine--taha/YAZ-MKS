package app.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import app.entity.equipementEntity;
import app.repositories.EquipementRepository;

@Service
public class EquipementService {
	
	@Autowired
	EquipementRepository equipementRepository;
	
	public void validateEquipement(equipementEntity equipementEntity) {
		this.equipementRepository.save(equipementEntity);
	}

	public List<equipementEntity> getListEquipement() {
		// TODO Auto-generated method stub
		return equipementRepository.findAll();
	}

	public equipementEntity getEquipementByID(int id) {
		return equipementRepository.findOne(id);
	}

	public void deleteEquipement(equipementEntity equipementEntity) {
		this.equipementRepository.delete(equipementEntity);
	}

}
