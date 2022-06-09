package models;

import java.io.Serializable;
public class Groupe implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -2078420557856796945L;

	protected static final String ERREUR = "Contrainte de longeur non respectée : ";
	protected static final String ERREUR1 = "Ce champ doit être alphaNumérique";
	protected static final String PATTERN1 = "^[A-Za-z0-9]+$";

	
	private int idGroupe;
	
	private int nombreEtudiants;
	
	private String designation;

	public Groupe() {
	}

	public Groupe( int nombreEtudiants,  String designation) {
		this.nombreEtudiants = nombreEtudiants;
		this.designation = designation;
	}

	public Groupe(int idGroupe,  int nombreEtudiants,  String designation) {
		this.idGroupe = idGroupe;
		this.nombreEtudiants = nombreEtudiants;
		this.designation = designation;
	}

	public int getIdGroupe() {
		return idGroupe;
	}

	public void setIdGroupe(int idGroupe) {
		this.idGroupe = idGroupe;
	}

	public int getNombreEtudiants() {
		return nombreEtudiants;
	}

	public void setNombreEtudiants(int nombreEtudiants) {
		this.nombreEtudiants = nombreEtudiants;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	@Override
	public String toString() {
		return "Groupe [idGroupe=" + idGroupe + ", nombreEtudiants=" + nombreEtudiants + ", designation=" + designation
				+ "]";
	}

}
