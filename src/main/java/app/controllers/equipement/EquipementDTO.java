package app.controllers.equipement;

import java.util.ArrayList;
import java.util.List;

import app.controllers.familleEquipement.FamilleEquipementDTO;
import app.entity.familleEquipementEntity;

public class EquipementDTO {
	private int idEquipement;
	private String code;
	private String libelle;
	private String idFamille;
	private List<FamilleEquipementDTO> listFamille=new ArrayList<FamilleEquipementDTO>();
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
	public String getIdFamille() {
		return idFamille;
	}
	public void setIdFamille(String idFamille) {
		this.idFamille = idFamille;
	}
	public List<FamilleEquipementDTO> getListFamille() {
		return listFamille;
	}
	public void setListFamille(List<FamilleEquipementDTO> listFamille) {
		this.listFamille = listFamille;
	}
	
        @Override
        public String toString() {
            return this.code +"(" + this.libelle +")";
        }
}
