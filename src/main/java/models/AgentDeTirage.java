package models;

import java.util.ArrayList;
import java.util.List;

public class AgentDeTirage extends Utilisateur {



	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int idAgentDeTirage;
	private String nom;
	private String prenom;
	private List<DemandeDeTirage> demandesDeTirage;

	public AgentDeTirage() {
		super();
	}

	public AgentDeTirage(String login,String motDePasse,String nom,String prenom) {
		super(login, motDePasse);
		this.nom = nom;
		this.prenom = prenom;
	}

	public AgentDeTirage(String login,String motDePasse,int idAgentDeTirage,String nom,String prenom) {
		super(login, motDePasse);
		this.idAgentDeTirage = idAgentDeTirage;
		this.nom = nom;
		this.prenom = prenom;
	}

	public int getIdAgentDeTirage() {
		return idAgentDeTirage;
	}

	public void setIdAgentDeTirage(int idAgentDeTirage) {
		this.idAgentDeTirage = idAgentDeTirage;
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

	public List<DemandeDeTirage> getDemandesDeTirage() {
		List<DemandeDeTirage> liste = new ArrayList<>();
		for (DemandeDeTirage demandeDeTirage : this.demandesDeTirage) {
			liste.add(demandeDeTirage);
		}
		return liste;
	}

	public void setDemandeDeTirage(Iterable<DemandeDeTirage> demandesDeTirage) {
		if (this.demandesDeTirage != null) {
			this.demandesDeTirage.clear();
			for (DemandeDeTirage demandeDeTirage : demandesDeTirage) {
				this.demandesDeTirage.add(demandeDeTirage);
			}
		}
	}

	public void addDemandeDeTirage(DemandeDeTirage demandeDeTirage) {
		if(!this.getDemandesDeTirage().contains(demandeDeTirage)) {
			this.getDemandesDeTirage().add(demandeDeTirage);
		}
	}

	@Override
	public String toString() {
		return "AgentDeTirage [idAgentDeTirage=" + idAgentDeTirage + ", nom=" + nom + ", prenom=" + prenom + "]";
	}

}
