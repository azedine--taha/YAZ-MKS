package app.repositories;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import app.entity.equipementEntity;

public interface EquipementRepository extends JpaRepository<equipementEntity, Integer> {

}
