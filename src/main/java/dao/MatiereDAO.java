package dao;
import java.sql.ResultSet;

import java.sql.SQLException;
import models.Matiere;

import util.JDBCUtil;
public class MatiereDAO {
	

	public static Matiere FindByLoginPwd(String log,String pwd) throws SQLException {
		Matiere u = null;
		String query ="Select * from enseignant where login = '"+log+"' and motdepasse ='"+pwd+"'";
		ResultSet rs;
		try {
			rs = JDBCUtil.getStatement().executeQuery(query);
			if(rs.next()) {
				u=new Matiere();
			}
} catch (SQLException e) {
// TODO Auto-generated catch block
	e.printStackTrace();
}
		return u;}
}
