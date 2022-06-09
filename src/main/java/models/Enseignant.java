package models;

public class Enseignant extends Utilisateur {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int idEnseignant;
	private String nom;
	private String prenom;
	private String departement;

	public Enseignant() {
		super();
	}

	public Enseignant(String login,String motDePasse,String nom,String prenom,String departement) {
		super(login, motDePasse);
		this.nom = nom;
		this.prenom = prenom;
		this.departement = departement;
	}

	public Enseignant(String login,String motDePasse, int idEnseignant,String nom,String prenom,String departement) {
		super(login, motDePasse);
		this.idEnseignant = idEnseignant;
		this.nom = nom;
		this.prenom = prenom;
		this.departement = departement;
	}

	public int getIdEnseignant() {
		return idEnseignant;
	}

	public void setIdEnseignant(int idEnseignant) {
		this.idEnseignant = idEnseignant;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getDepartement() {
		return departement;
	}

	public void setDepartement(String departement) {
		this.departement = departement;
	}


	@Override
	public String toString() {
		return "Enseignant [idEnseignant=" + idEnseignant + ", nom=" + nom + ", prenom=" + prenom + ", departement="
				+ departement + "]";
	}

}