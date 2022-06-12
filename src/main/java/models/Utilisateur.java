package models;

import java.io.Serializable;


public class Utilisateur implements Serializable {


	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String login;
	private String motDePasse;
	private String role;

	public Utilisateur() {
		super();
	}

	public Utilisateur(String login,String motDePasse) {
		super();
		this.login = login;
		this.motDePasse = motDePasse;
		this.role = role;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}
	
	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
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
