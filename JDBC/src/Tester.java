
import java.sql.*;
import java.util.Scanner;

public class Tester {

	public static void main(String[] args) throws Exception {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter id,make and cost=");
		int lid=sc.nextInt();
		String make=sc.next();
		double cost=sc.nextDouble();
		
		Connection conn=DriverManager.getConnection("jdbc:mysql://localhost/test","root","root");
		PreparedStatement pstmt=conn.prepareStatement("insert into Computer values(?,?,?)");
		pstmt.setInt(1, lid);
		pstmt.setString(2, make);
		pstmt.setDouble(3, cost);
		
		//Statement st=conn.createStatement("insert into Computer values(101,'abc',90000)");
		boolean status=pstmt.execute();
		if(!status) {
			//System.out.println(rset.getInt(1)+" "+rset.getString(2)+" "+rset.getDouble(3));
			System.out.println("Rows inserted..");
		}
		conn.close();

	}

}
