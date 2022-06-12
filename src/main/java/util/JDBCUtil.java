package util;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
public class JDBCUtil {
public static Statement getStatement() {
Statement stmt = null;
try {
	Class.forName("com.mysql.cj.jdbc.Driver");
	Connection ctx = DriverManager.getConnection("jdbc:mysql://localhost:3306/gestionimpression","root","");
	stmt = ctx.createStatement();
} catch (ClassNotFoundException | SQLException e) {
// TODO Auto-generated catch block
e.printStackTrace();
}
return stmt;
}
}