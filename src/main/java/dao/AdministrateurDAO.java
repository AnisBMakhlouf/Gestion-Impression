package dao;
import java.sql.ResultSet;

import java.sql.SQLException;
import models.Administrateur;

import util.JDBCUtil;
public class AdministrateurDAO {
	

	public static Administrateur FindByLoginPwd(String log,String pwd) throws SQLException {
		Administrateur u = null;
		String query ="Select * from administrateur where login = '"+log+"' and password ='"+pwd+"'";
		ResultSet rs;
		try {
			rs = JDBCUtil.getStatement().executeQuery(query);
			if(rs.next()) {
				u=new Administrateur(log, pwd, 0);
			}
} catch (SQLException e) {
// TODO Auto-generated catch block
	e.printStackTrace();
}
		return u;}
}