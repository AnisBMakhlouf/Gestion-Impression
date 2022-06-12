package dao;
import java.sql.ResultSet;

import java.sql.SQLException;
import models.Administrateur;

import util.JDBCUtil;
public class AdministrateurDAO {
	

	public static Administrateur FindByLoginPwd(String log,String pwd) throws SQLException {
		Administrateur u = null;
		String query ="Select * from utilisateur where login = '"+log+"' and password ='"+pwd+"' and Role ='Admin'";
		ResultSet rs;
		try {
			rs = JDBCUtil.getStatement().executeQuery(query);
			if(rs.next()) {
				u=new Administrateur();
				u.setIdAdministrateur(rs.getInt("ID"));
				u.setLogin(rs.getString("login"));
				u.setRole(rs.getString("Role"));
			}
		} catch (SQLException e) {
		// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return u;
	}
	
	public static Administrateur AddAdmin(String fullname,String email, String password) throws SQLException {
		Administrateur u = null;
		String query ="INSERT INTO `utilisateur`( `FullName`, `Role`, `login`, `password`) VALUES ('"+fullname+"','Admin','"+email+"','"+password+"')";
		try {
			JDBCUtil.getStatement().executeQuery(query);
			
		} catch (SQLException e) {
		// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return u;
	}
	
	public static Administrateur UpdateAdmin(int ID,String fullname,String email, String password) throws SQLException {
		Administrateur u = null;
		String query ="UPDATE `utilisateur` SET `FullName`='"+fullname+"',`login`='"+email+"',`password`='"+password+"' WHERE ID = '"+ID+"'";
		try {
			JDBCUtil.getStatement().executeQuery(query);
			
		} catch (SQLException e) {
		// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return u;
	}
	
	public static Administrateur DeleteAdmin(int ID) throws SQLException {
		Administrateur u = null;
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