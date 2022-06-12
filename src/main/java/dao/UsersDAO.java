package dao;
import models.Utilisateur;
import java.sql.ResultSet;

import java.sql.SQLException;
import java.util.List;

import models.Administrateur;

import util.JDBCUtil;
public class UsersDAO {
	

	public static List<Utilisateur> GetAll() throws SQLException {
		List <Utilisateur> u = null;
		String query ="Select * from utilisateur";
		ResultSet rs;
		try {
			rs = JDBCUtil.getStatement().executeQuery(query);
			if(rs.next()) {
				u.add(new Utilisateur(rs.getString("login"),rs.getString("password")));
			}
} catch (SQLException e) {
// TODO Auto-generated catch block
	e.printStackTrace();
}
		return u;}
}