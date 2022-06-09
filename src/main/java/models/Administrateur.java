package models;

public class Administrateur extends Utilisateur {


	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int idAdministrateur;

	public Administrateur() {
		super();
	}

	public Administrateur(String login,String motDePasse,
			int idAdministrateur) {
		super(login, motDePasse);
		this.idAdministrateur = idAdministrateur;
	}

	public int getIdAdministrateur() {
		return idAdministrateur;
	}

	public void setIdAdministrateur(int idAdministrateur) {
		this.idAdministrateur = idAdministrateur;
	}

	@Override
	public String toString() {
		return "Administrateur [idAdministrateur=" + idAdministrateur + ", " + super.toString() + "]";
	}

}
