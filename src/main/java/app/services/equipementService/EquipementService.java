package app.services.equipementService;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import app.entity.equipementEntity;
import app.repositories.EquipementRepository;
import app.repositories.FamilleEquipementRepository;

@Service
public class EquipementService implements IEquipementService {

    @Autowired
    EquipementRepository equipementRepository;

    @Autowired
    FamilleEquipementRepository familleEquipementRepository;

    @Override
    public void validateEquipement(equipementEntity equipementEntity) {
        this.equipementRepository.save(equipementEntity);
    }

    @Override
    public List<equipementEntity> getListEquipement() {
        return equipementRepository.findAll();
    }

    @Override
    public equipementEntity getEquipementByID(int id) {
        return equipementRepository.findOne(id);
    }

    @Override
    public void deleteEquipement(equipementEntity equipementEntity) {
        this.equipementRepository.delete(equipementEntity);
    }

    @Override
    public equipementEntity createEquipement() {
        equipementEntity equipementEntity = new equipementEntity();
        return equipementEntity;
    }

}
