package app.services.familleEquipementService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import app.controllers.familleEquipement.FamilleEquipementDTO;
import app.entity.familleEquipementEntity;
import app.repositories.FamilleEquipementRepository;

@Service
public class FamilleEquipementService implements IFamilleEquipementService {

	@Autowired
	FamilleEquipementRepository familleEquipementRepository;
	
	@Override
	public void validateEquipement(familleEquipementEntity familleEquipementEntity) {
		this.familleEquipementRepository.save(familleEquipementEntity);
	}

	@Override
	public List<familleEquipementEntity> getListFamilleEquipement() {
		return familleEquipementRepository.findAll();
	}

	@Override
	public familleEquipementEntity getFamilleEquipementByID(int id) {
		return familleEquipementRepository.findOne(id);
	}

	@Override
	public void deleteEquipement(familleEquipementEntity familleEquipementEntity) {
		this.familleEquipementRepository.delete(familleEquipementEntity);
	}

	@Override
	public familleEquipementEntity createFamilleEquipement() {
		familleEquipementEntity familleEquipementEntity =new familleEquipementEntity();
		return familleEquipementEntity;
	}
	public familleEquipementEntity getFamilleEquipementByCode(String code) {
		return familleEquipementRepository.findByCode(code);
	}

}
