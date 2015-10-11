package app.controllers.familleEquipement;

public class FamilleEquipementDTO {
	private int idFamille;
	private String code;
	private String libelle;
	public int getIdFamille() {
		return idFamille;
	}
	public void setIdFamille(int idFamille) {
		this.idFamille = idFamille;
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
		return this.code;
	}

}
