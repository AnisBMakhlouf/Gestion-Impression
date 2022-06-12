package dao;
import java.sql.ResultSet;

import java.sql.SQLException;
import models.Utilisateur;

import util.JDBCUtil;
public class AgentDeTirageDAO {
	

	public static Utilisateur FindByLoginPwd(String log,String pwd) throws SQLException {
		Utilisateur u = null;
		String query ="Select * from utilisateur where login = '"+log+"' and password ='"+pwd+"' and Role = 'AgentDeTirage'";
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
	
	public static Utilisateur AddAgentDeTirage(String fullname,String email, String password) throws SQLException {
		Utilisateur u = null;
		String query ="INSERT INTO `utilisateur`( `FullName`, `Role`, `login`, `password`) VALUES ('"+fullname+"','AgentDeTirage','"+email+"','"+password+"')";
		try {
			JDBCUtil.getStatement().executeQuery(query);
			
		} catch (SQLException e) {
		// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return u;
	}
	
	public static Utilisateur UpdateAgentDeTirage(int ID,String fullname,String email, String password) throws SQLException {
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
	
	public static Utilisateur DeleteAgentDeTirage(int ID) throws SQLException {
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