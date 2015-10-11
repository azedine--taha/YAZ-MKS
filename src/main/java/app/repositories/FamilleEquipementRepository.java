package app.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import app.entity.familleEquipementEntity;

public interface FamilleEquipementRepository extends JpaRepository<familleEquipementEntity, Integer> {
		
	 familleEquipementEntity findByCode(String code);
}
