package models;

import java.io.Serializable;

public class Document implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -4702350339874814312L;

	private static final String ERREUR = "Contrainte de longeur non respectée : ";
	private int idDocument;
	private String nom;
	private Matiere matiere;

	public Document() {
	}

	public Document(
			 String nom,
			Matiere matiere) {
		this.nom = nom;
		this.matiere = matiere;
	}

	public Document(int idDocument,
			 String nom,
			Matiere matiere) {
		this.idDocument = idDocument;
		this.nom = nom;
		this.matiere = matiere;
	}

	public int getIdDocument() {
		return idDocument;
	}

	public void setIdDocument(int idDocument) {
		this.idDocument = idDocument;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public Matiere getMatiere() {
		return matiere;
	}

	public void setMatiere(Matiere matiere) {
		this.matiere = matiere;
		if (!matiere.getDocuments().contains(this)) {
			matiere.getDocuments().add(this);
		}
	}

	@Override
	public String toString() {
		return "Document [idDocument=" + idDocument + ", nom=" + nom + ", matiere=" + matiere + "]";
	}

}
