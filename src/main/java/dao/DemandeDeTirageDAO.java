package dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import models.DemandeDeTirage;
import util.JDBCUtil;

public class DemandeDeTirageDAO {

	public List<DemandeDeTirage> getAll() {
		DemandeDeTirage[] tabdemande;

		List<DemandeDeTirage> demandes = new ArrayList<DemandeDeTirage>();
		try {
			String query = " select * from demandesimpression";
			System.out.println(query);
			ResultSet rs = JDBCUtil.getStatement().executeQuery(query);
			
			while (rs.next()) {
				DemandeDeTirage d = new DemandeDeTirage();
				d.setId(rs.getInt("id"));
				d.setClasse(rs.getString("classe"));
				d.setMatiere(rs.getString("matiere"));
				
				d.setNbcopie(rs.getInt("nbcopie"));
				d.setFichier(rs.getString("fichier"));

				d.setUtilisateur_id(rs.getInt("utilisateur_id"));

	
				demandes.add(d);
			}
		} catch (Exception e) {
			System.out.println("erreur getAll demande()  !! ");
		}
		return demandes;

	}
	
	
	public static void save(DemandeDeTirage u) throws SQLException {
		String query = " insert into demandetirage (id,matiere,classe,nbcopie,fichier,utilisateur_id) value (0,'" + u.getMatiere() + "','"
				+ u.getClasse() + "','" + u.getNbcopie() + "','"+ u.getFichier() + "','"+ u.getUtilisateur_id() + "')";
		JDBCUtil.getStatement().executeUpdate(query);
	}
	
	public void supprimer(String id){
		try{
			
		}catch(Exception e){
			e.printStackTrace();
			System.out.println("erreur delete utilisateur");
		}
	}
	
}
