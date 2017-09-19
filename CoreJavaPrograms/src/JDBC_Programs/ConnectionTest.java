package JDBC_Programs;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class ConnectionTest {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		Class.forName("com.mysql.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/MonthlyExpenses","root","root");
		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery("select * from login_details");
		while(rs.next()){
			System.out.println(rs.getString(1)+"........." +rs.getString(2));
		}
		
	}

}
