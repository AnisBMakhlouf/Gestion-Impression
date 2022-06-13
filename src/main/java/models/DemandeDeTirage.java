package models;

import java.io.Serializable;
import java.util.Date;

public class DemandeDeTirage implements Serializable {

	int id;
	String matiere, classe, fichier;
	int nbcopie, utilisateur_id;
	Date date;

	public DemandeDeTirage(int id, String matiere, String classe, String fichier, int nbcopie, int utilisateur_id) {
		super();
		this.id = id;
		this.matiere = matiere;
		this.classe = classe;
		this.fichier = fichier;
		this.nbcopie = nbcopie;
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

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

}
