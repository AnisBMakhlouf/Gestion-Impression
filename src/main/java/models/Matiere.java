package models;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Matiere implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -996028911375933528L;

	
	private int idMatiere;
	
	private String designation;
	
	private int nombreDesEtudiants;
	
	private List<Document> documents;

	public Matiere() {
	}

	public Matiere(
			 String designation,
			 int nombreDesEtudiants) {
		this.designation = designation;
		this.nombreDesEtudiants = nombreDesEtudiants;
	}

	public Matiere(int idMatiere,
			 String designation,
			 int nombreDesEtudiants) {
		this.idMatiere = idMatiere;
		this.designation = designation;
		this.nombreDesEtudiants = nombreDesEtudiants;
	}

	public int getIdMatiere() {
		return idMatiere;
	}

	public void setIdMatiere(int idMatiere) {
		this.idMatiere = idMatiere;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public int getNombreDesEtudiants() {
		return nombreDesEtudiants;
	}

	public void setNombreDesEtudiants(int nombreDesEtudiants) {
		this.nombreDesEtudiants = nombreDesEtudiants;
	}

	public List<Document> getDocuments() {
		List<Document> liste = new ArrayList<>();
		for (Document document : this.documents) {
			liste.add(document);
		}
		return liste;
	}

	public void setDocuments(Iterable<Document> documents) {
		if (this.documents != null) {
			this.documents.clear();
			for (Document document : documents) {
				this.documents.add(document);
			}
		}
	}

	public void addDocument(Document document) {
		this.documents.add(document);
		if (document.getMatiere() != this) {
			document.setMatiere(this);
		}
	}

	@Override
	public String toString() {
		return "Matiere [idMatiere=" + idMatiere + ", designation=" + designation + ", nombreDesEtudiants="
				+ nombreDesEtudiants + "]";
	}

}