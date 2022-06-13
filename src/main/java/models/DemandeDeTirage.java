package models;

import java.io.Serializable;
import java.util.Date;

public class DemandeDeTirage implements Serializable {

	int id;
	String matiere, classe, fichier, enseignant, date,status;
	int nbcopie, utilisateur_id;

	public DemandeDeTirage(int id, String matiere, String classe, String fichier,String enseignant,String date,String status, int nbcopie, int utilisateur_id) {
		super();
		this.id = id;
		this.matiere = matiere;
		this.classe = classe;
		this.fichier = fichier;
		this.nbcopie = nbcopie;
		this.enseignant = enseignant;
		this.date = date;
		this.status = status;
		this.utilisateur_id = utilisateur_id;
	}

	public DemandeDeTirage() {
		super();
	}

	public String getMatiere() {
		return matiere;
	}

	public void setMatiere(String matiere) {
		this.matiere = matiere;
	}

	public String getClasse() {
		return classe;
	}

	public void setClasse(String classe) {
		this.classe = classe;
	}
	
	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	
	public String getEnseignant() {
		return enseignant;
	}

	public void setEnseignant(String enseignant) {
		this.enseignant = enseignant;
	}

	public String getFichier() {
		return fichier;
	}

	public void setFichier(String fichier) {
		this.fichier = fichier;
	}

	public int getNbcopie() {
		return nbcopie;
	}

	public void setNbcopie(int nbcopie) {
		this.nbcopie = nbcopie;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getUtilisateur_id() {
		return utilisateur_id;
	}

	public void setUtilisateur_id(int utilisateur_id) {
		this.utilisateur_id = utilisateur_id;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

}
