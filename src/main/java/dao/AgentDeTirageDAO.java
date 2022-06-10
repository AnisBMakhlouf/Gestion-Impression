package dao;
import java.sql.ResultSet;

import java.sql.SQLException;
import models.AgentDeTirage;

import util.JDBCUtil;
public class AgentDeTirageDAO {
	

	public static AgentDeTirage FindByLoginPwd(String log,String pwd) throws SQLException {
		AgentDeTirage u = null;
		String query ="Select * from agentdetirage where login = '"+log+"' and motdepasse ='"+pwd+"'";
		ResultSet rs;
		try {
			rs = JDBCUtil.getStatement().executeQuery(query);
			if(rs.next()) {
				u=new AgentDeTirage(rs.getString(1), query, log, pwd);
			}
} catch (SQLException e) {
// TODO Auto-generated catch block
	e.printStackTrace();
}
		return u;}
}
