package app.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import app.entity.equipementEntity;

public interface EquipementRepository extends JpaRepository<equipementEntity, Integer> {

}
