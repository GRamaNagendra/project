package project2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

import crud.dto;

public class dao {

	public static void insert(project2.dto o2)
	{
	try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc5", "root", "root");
		String gmdb;
		 
		PreparedStatement p=con.prepareStatement("insert into login values(?,?,?,?,?,?,?,?,?)");
//	
String name =o2.getName();
	
 long MblNo=o2.getMblNo();
 String pwd=o2.getPwd();
 String gmail=o2.getGmail();
 int age=o2.getAge();
 String gender=o2.getGender();
 String adress=o2.getAdress();
 long altmb=o2.getAltmb();
 int logintimes=o2.getlogintimes();

	    	     
	     p.setString(1, name);
	     p.setLong(2, MblNo);
	     p.setString(3, pwd);
         p.setString(4, gmail);
	     p.setInt(5, age);
	     p.setString(6, gender);
	     p.setString(7, adress);
	     p.setLong(8, altmb);
	     p.setLong(9, logintimes);
     
	    p.executeUpdate();
	   
		con.close();
		  System.out.println("Congrats Your account is created");
		  System.out.println("Please Select New opiton");
mainclass.main(null);
			} catch (ClassNotFoundException | SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}
	
	
	public static void login(project2.dto o2, project2.logintype o3)
	{
		
		System.out.println("coming here");
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc5", "root", "root");
	
	
	 Statement stmt;
	 ResultSet rs;
	 
	 stmt = con.createStatement();            
	 rs = stmt.executeQuery("select gmail,Password FROM login");                    
      
	 while (rs.next()){   
		 
	String gmdb =rs.getString(1); // Retrieve only the first column value
	String pwd = rs.getString(2);

	if( gmdb.equals(o2.getGmail())) {
		
		
		if(pwd.equals(o2.getPwd())) {
			
		
			o2.ss++;
			
			
			
		}
		else {
		
		o2.fs++;
		
		
			
			
	}
	}
	else {
	
		o2.wm++;
		
	}
	 }
	if(o2.ss>=1) {
		System.out.println("Succesfully Signin");
		
		o3.afterlogin(o2);
	}
	else if(o2.fs>=1) {
		if(o2.fs<=3) {
		System.out.println("Sorry Your Password is Wrong");
		System.out.println("you using "+ o2.fs +" chance out of 3 chances To change password");
		System.out.println("Press 1 To type your password again");
		System.out.println("Forgot Password:To get your password");
		System.out.println("Press 3 for Go back");
		Scanner sc=new Scanner(System.in);
		int n = sc.nextInt();
		
		if(n==1){
			System.out.println("Please enter your password again");
			String np=sc.next();
			o2.setPwd(np);
			dao.login(o2,o3);
		}
		if(n==2)
		{
			forgottenpassword fp= new forgottenpassword();
			fp.fgp();
		}
	if(n==3)
		{
			mainclass.main(null);
		}
		if(n>=4)
		{
			System.out.println("please enter you enter vaild input");
			
		}
		
		
		}
		
		
	else
		
	{
		System.out.println("your chances are over ");
	}
		}
		
		else if(o2.wm>1){
			System.out.println("sorry your Mail is not in our Database");
			
			System.out.println("To create Account press1");
			System.out.println("To Login Account press2");
			
			Scanner sc = new Scanner(System.in);
			int n = sc.nextInt();
			switch (n) {
			case 1: {
				
				signin1 rf1 =new signin1();
				rf1.display(new project2.dto());
			}
				
			
			case 2:{
				login1 rf2 = new login1();
				rf2.display(new project2.dto());
			}
			
		}
	
	 }
	 rs.close();                       // Close the ResultSet                 4 
	 stmt.close();                     // Close the Statement                 5
		con.close();
	
			} catch (ClassNotFoundException | SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	
	
	

}
}