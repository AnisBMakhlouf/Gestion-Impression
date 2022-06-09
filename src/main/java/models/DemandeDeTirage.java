package models;

import java.io.Serializable;
import java.util.Date;

public class DemandeDeTirage implements Serializable {


	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int idDemandeDeTirage;
	private AgentDeTirage agentDeTirage;
	private Date dateArrivee;

	public DemandeDeTirage() {
	}

	public DemandeDeTirage(AgentDeTirage agentDeTirage, Date dateArrivee) {
		this.agentDeTirage = agentDeTirage;
		this.dateArrivee = (Date) dateArrivee.clone();
	}

	public DemandeDeTirage(int idDemandeDeTirage, AgentDeTirage agentDeTirage,Date dateArrivee) {
		super();
		this.idDemandeDeTirage = idDemandeDeTirage;
		this.agentDeTirage = agentDeTirage;
		this.dateArrivee = (Date) dateArrivee.clone();
	}

	public int getIdDemandeDeTirage() {
		return idDemandeDeTirage;
	}

	public void setIdDemandeDeTirage(int idDemandeDeTirage) {
		this.idDemandeDeTirage = idDemandeDeTirage;
	}

	public AgentDeTirage getAgentDeTirage() {
		return agentDeTirage;
	}

	public void setAgentDeTirage(AgentDeTirage agentDeTirage) {
		this.agentDeTirage = agentDeTirage;
	}

	public Date getDateArrivee() {
		return (Date) dateArrivee.clone();
	}

	public void setDateArrivee(Date dateArrivee) {
		this.dateArrivee = (Date) dateArrivee.clone();
	}

	@Override
	public String toString() {
		return "DemandeDeTirage [idDemandeDeTirage=" + idDemandeDeTirage + ", agentDeTirage=" + agentDeTirage
				+ ", dateArrivee=" + dateArrivee + "]";
	}

}
