package dao;
import java.sql.ResultSet;

import java.sql.SQLException;
import java.util.List;

import models.Document;

import util.JDBCUtil;
public class DocumentDAO {
	

	public static Document FindByLoginPwd(String log,String pwd) throws SQLException {
		Document u = null;
		String query ="Select * from document where login = '"+log+"' and motdepasse ='"+pwd+"'";
		ResultSet rs;
		try {
			rs = JDBCUtil.getStatement().executeQuery(query);
			if(rs.next()) {
				u=new Document();
			}
} catch (SQLException e) {
// TODO Auto-generated catch block
	e.printStackTrace();
}
		return u;}

	public List<Document> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	public Document findById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	public void save(Document document) {
		// TODO Auto-generated method stub
		
	}

	public void deleteById(int id) {
		// TODO Auto-generated method stub
		
	}
}
