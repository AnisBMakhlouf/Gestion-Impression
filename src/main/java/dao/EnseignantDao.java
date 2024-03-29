package dao;
import java.sql.ResultSet;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import models.DemandeDeTirage;
import models.Utilisateur;

import util.JDBCUtil;
public class EnseignantDao {
	
	public static Utilisateur FindByLoginPwd(String log,String pwd) throws SQLException {
		Utilisateur u = null;
		String query ="Select * from utilisateur where login = '"+log+"' and password ='"+pwd+"' and Role ='Enseignant'";
		ResultSet rs;
		try {
		rs = JDBCUtil.getStatement().executeQuery(query);
		if(rs.next()) {
		u=new Utilisateur(log, pwd);
		}
		} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
		}
		return u;
		}
	public static List<Utilisateur> GetAllEns() throws SQLException {
		List<Utilisateur> ListUtilisateur = new ArrayList<Utilisateur>();
		
		try {
		
			String query ="SELECT * FROM `utilisateur` WHERE `Role` = 'Enseignant'";
			ResultSet rs = JDBCUtil.getStatement().executeQuery(query);
		
			while (rs.next()) {
				Utilisateur u = new Utilisateur();
				u.setId(rs.getInt("id"));
				u.setNomComplet(rs.getString("FullName"));
				u.setLogin(rs.getString("login"));
				
				u.setMotDePasse(rs.getString("password"));
				ListUtilisateur.add(u);	
				
				
			}
		} catch (SQLException e) {
		// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return ListUtilisateur;
	}
	
	public static Utilisateur AddEnseignant(String fullname,String email, String password) throws SQLException {
		Utilisateur u = null;
		String query ="INSERT INTO `utilisateur`( `FullName`, `Role`, `login`, `password`) VALUES ('"+fullname+"','Enseigant','"+email+"','"+password+"')";
		try {
			JDBCUtil.getStatement().executeQuery(query);
			
		} catch (SQLException e) {
		// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return u;
	}
	
	public static Utilisateur UpdateEnseignant(int ID,String fullname,String email, String password) throws SQLException {
		Utilisateur u = null;
		String query ="UPDATE `utilisateur` SET `FullName`='"+fullname+"',`login`='"+email+"',`password`='"+password+"' WHERE ID = '"+ID+"'";
		try {
			JDBCUtil.getStatement().executeQuery(query);
			
		} catch (SQLException e) {
		// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return u;
	}
	
	public static Utilisateur DeleteEnseignant(int ID) throws SQLException {
		Utilisateur u = null;
		String query ="DELETE FROM `utilisateur` WHERE ID = '"+ID+"'";
		try {
			JDBCUtil.getStatement().executeQuery(query);
			
		} catch (SQLException e) {
		// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return u;
	}
}