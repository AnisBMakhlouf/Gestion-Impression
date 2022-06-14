package models;

import java.io.Serializable;


public class Utilisateur implements Serializable {


	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int Id;
	private String nomComplet;
	private String login;
	private String motDePasse;
	private String role;

	public Utilisateur() {
		super();
	}

	public Utilisateur(String login,String motDePasse) {
		super();
		this.Id = Id;
		this.nomComplet = nomComplet;
		this.login = login;
		this.motDePasse = motDePasse;
		this.role = role;
	}
	public int getId() {
		return Id;
	}
	public String getNomComplet() {
		return nomComplet;
	}
	public String getLogin() {
		return login;
	}

	public void setId(int Id) {
		this.Id = Id;
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
	public void setNomComplet(String nomComplet) {
		this.nomComplet = nomComplet;
	}

	@Override
	public String toString() {
		return "Utilisateur [login=" + login + ", motDePasse=" + motDePasse + "]";
	}

}
