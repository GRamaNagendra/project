package project2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class forgottenpassword {
public void fgp(){
	try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc5", "root", "root");

 Statement stmt;
 ResultSet rs;
 String dbgmail=null;
 long dbmbl=0;
 int dbage=0;
 boolean b=true;
 String dbpwd=null;
 System.out.println("To Get Forgot Password You have answer the below questions");
 Scanner sc=new Scanner(System.in);
 System.out.println("Please Enter your gmail id");
 String gmail=sc.next();
 System.out.println("Please Enter your Mobile Number");
 Long mbl=sc.nextLong();
System.out.println("Please Enter your age");
int age=sc.nextInt();

 stmt = con.createStatement();            
 rs = stmt.executeQuery("select gmail,mbl,age,Password FROM login");                    
  
 while (rs.next()){ 
	 dbgmail=rs.getString(1);
	 dbmbl=rs.getLong(2);
	 dbage=rs.getInt(3);
	 dbpwd=rs.getString(4);
	 if(dbgmail.equals(gmail)&& dbmbl==mbl &&dbage==(age))
	 {
		 System.out.println("YOur Password is" +dbpwd);
		 b=false;
		 
		 System.out.println("No you can login");
		login1 rf1=new login1();
		rf1.display(null);
	 }

 }
 
 if(b) {
	 System.out.println("sorry we are not able to find your account");
	 System.out.println("to retry please enter 1");
	 System.out.println("to go back press 2");
	 int n=sc.nextInt();
	 
	 if(n==1) {
	fgp();
	 }
	 if(n==2)
	 {
		 mainclass.main(null);
	 }
 }
rs.close();	
  
 
 
	stmt.close();                     // Close the Statement                 5
	con.close();
			

}catch (ClassNotFoundException | SQLException e) {
	
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
}

}

