package dao;
import java.sql.ResultSet;

import java.sql.SQLException;
import models.Groupe;

import util.JDBCUtil;
public class GroupDAO {
	

	public static Groupe FindByLoginPwd(String log,String pwd) throws SQLException {
		Groupe u = null;
		String query ="Select * from group where login = '"+log+"' and motdepasse ='"+pwd+"'";
		ResultSet rs;
		try {
			rs = JDBCUtil.getStatement().executeQuery(query);
			if(rs.next()) {
				u=new Groupe();
			}
} catch (SQLException e) {
// TODO Auto-generated catch block
	e.printStackTrace();
}
		return u;}
}
