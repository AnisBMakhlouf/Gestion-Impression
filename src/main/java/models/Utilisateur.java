package models;

import java.io.Serializable;


public class Utilisateur implements Serializable {


	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String login;
	private String motDePasse;

	public Utilisateur() {
		super();
	}

	public Utilisateur(String login,String motDePasse) {
		super();
		this.login = login;
		this.motDePasse = motDePasse;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getMotDePasse() {
		return motDePasse;
	}

	public void setMotDePasse(String motDePasse) {
		this.motDePasse = motDePasse;
	}

	@Override
	public String toString() {
		return "Utilisateur [login=" + login + ", motDePasse=" + motDePasse + "]";
	}

}
