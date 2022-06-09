package dao;
import java.sql.ResultSet;

import java.sql.SQLException;
import models.Enseignant;

import util.JDBCUtil;
public class EnseignantDao {
	

	public static Enseignant FindByLoginPwd(String log,String pwd) throws SQLException {
		Enseignant u = null;
		String query ="Select * from enseignant where login = '"+log+"' and motdepasse ='"+pwd+"'";
		ResultSet rs;
		try {
			rs = JDBCUtil.getStatement().executeQuery(query);
			//if(rs.next()) {
				//u=new Enseignant(rs.getString(1), query, log, pwd, null);
			//}
} catch (SQLException e) {
// TODO Auto-generated catch block
	e.printStackTrace();
}
		return u;}
}
