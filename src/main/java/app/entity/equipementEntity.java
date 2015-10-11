package app.entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class equipementEntity {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int idEquipement;
	private String code;
	private String libelle;
	
	 @ManyToOne
	 @JoinColumn(name="famille_id")
	 familleEquipementEntity familleEquipementEntity;

	public int getIdEquipement() {
		return idEquipement;
	}
	public void setIdEquipement(int idEquipement) {
		this.idEquipement = idEquipement;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getLibelle() {
		return libelle;
	}
	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}
	
	@Override
	public String toString() {
		return this.code +"(" + this.libelle + ")";
	}
	public familleEquipementEntity getFamilleEquipementEntity() {
		return familleEquipementEntity;
	}
	public void setFamilleEquipementEntity(familleEquipementEntity familleEquipementEntity) {
		this.familleEquipementEntity = familleEquipementEntity;
	}
}
