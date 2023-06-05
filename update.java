package project2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;



class update implements mainpage{


	public void display(dto ob) {
		
	System.out.println("To Update Your Account Please Login First");
	String gmail;
	Scanner sc =new Scanner(System.in);
	
	  
	boolean b=true;
	do
	{  
		System.out.println("Please Enter Your complete Gmail id");
		gmail=sc.next();
		
		String gend1="@gmail.com";
		   String gend2="@email.com";
		   String gend3="@outlook.com";
		   String gend4="@yahoo.com";
		
		   try {
		   if(gmail.substring(4).contains(gend1)||gmail.substring(4).contains(gend2)||gmail.substring(4).contains(gend3)||gmail.substring(4).contains(gend4))
		   {
		      b=false;
		    }
	       else
	       {
		      System.out.println("Please Enter valid mail with @gmail.com");	
	       }
		   }catch (Exception e) {
			// TODO: handle exception
			  
			   System.out.println("Please press Valid Inputs");
		}
	
	}
	while(b);
      
	System.out.println("please Enter Your Password");
	String password=sc.next();
	
	project2.dto a=new project2.dto();
a.setGmail(gmail);
a.setPwd(password);

logintype lt = new update1();
dao.login(a,lt);

	}


}
class update1 implements logintype {

	
	

	@Override
	public void display() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void afterlogin(project2.dto o2) {
		// TODO Auto-generated method stub
	System.out.println("To Update Your Account Please Enter1");
	System.out.println("To Delete Your Account Please Enter2");
	

//	String name =o2.getName();
//	
//	long MblNo;
//	String pwd;
//	String gmail;
//	int age;
//	String gender;
//	String adress;
//
//	long altmb;
//	
//	
	Scanner sc = new Scanner(System.in);
	int n=sc.nextInt();
	

	
	if(n==1) {
		System.out.println("coming here");
		updater(o2);
	}
	if(n==2) {
		delete1(o2);
	}
	}
				
//			switch (n2) {
//			case 1: name=null;
//			case 2: MblNo=0;
//			case 3: pwd=null;
//			case 4: age=0;
//			case 5:gender=null;
//			case 6:adress=null;
//			case 7: altmb=0;
//			signin1 rf1= new signin1();
//		rf1.display(o2);}
//		
//			
//			
		
	
	
	public void updater(project2.dto o2)
	{
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc5", "root", "root");
			
			 Statement stmt;
			 ResultSet rs;
			 
			 stmt = con.createStatement(); 
			 rs = stmt.executeQuery("select * from login where Gmail='"+ o2.getGmail() +"'");   
			  System.out.println(o2.getGmail());
			  
			  
			  String name=null;
				long MblNo=0;
				String pwd=null;
				String gmail=null;
				int age=0;
				String gender=null;
				String adress=null;
			     int altmb=0;
			 
			 
			
	        	 while (rs.next()) {    
	        		     		 
	        		  name =rs.getString(1);
	    			 MblNo=rs.getLong(2);
	    			  pwd=rs.getString(3);
	    			gmail=rs.getString(4);
	    			age=rs.getInt(5);
	    			 gender=rs.getString(6);
	    			 adress=rs.getString(7);
	    			 altmb=rs.getInt(8);
	    			 
	    
	         	
	        	 }
	        	 
	        	  System.out.println("Your Details in our Data Base");
	    	      System.out.print("name:"+name);
	    	      
	    	      System.out.print("MblNo:"+MblNo);
	    	  
	    	      System.out.println("pwd:"+pwd);
	    	     
	    	      System.out.println("gmail:"+gmail);
	    	    if(age!=0) {
	    	      System.out.println("age:"+age);
	    	    }
	    	    else {
	    	    	System.out.println("Your age data is not in our database");
	    	    }
	    	    if(gender!=null) {
	    	      System.out.println("gender:"+gender);
		  }
	    else {
	    	System.out.println("Your gender data is not in our database");
	    }
	    	    if(adress!=null) {
	    	      System.out.println("adress:"+adress);
	  }
    else {
    	System.out.println("Your address data is not in our database");
    }
	    	    if(altmb!=0) {
	    	      System.out.println("altmb:"+altmb);
}
else {
	System.out.println("Your Alternate MObile Number data is not in our database");
}
	    	    o2.setName(name);
				o2.setMblNo(MblNo);
				o2.setPwd(pwd);
				o2.setGmail(gmail);
				o2.setAge(age);
				o2.setGender(gender);
				o2.setAdress(adress);
				o2.setAltmb(altmb);
                o2.setuLogin(true);
                
//                
//	    	    System.out.println("To Update Name press1 "); 
//	    	    System.out.println("To Update Mobile Number press2 "); 
//	    	    System.out.println("To Update password press3 "); 
//	    	    System.out.println("To Update Gmail press4 "); 
//	    	    System.out.println("To Update gender press5 "); 
//	    	    System.out.println("To Update age press6 "); 
//	    	    System.out.println("To Update address press7 "); 
//	    	    System.out.println("To Update Alternate Mobile Number press 8"); 
//	    Scanner sc = new Scanner(System.in);
//	    	    int n2=sc.nextInt();
//				switch (n2) {
//				case 1: name=null;
//				case 2: MblNo=0;
//				case 3: pwd=null;
//				case 4: age=0;
//				case 5:gender=null;
//				case 6:adress=null;
//				case 7: altmb=0;
				signin1 rf1= new signin1();
				
				
			rf1.display(o2);
			
	         
	          rs.close();

			con.close()	;
			stmt.close();
		
		
		 } catch (ClassNotFoundException | SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}
	
	public void update1(dto o2){
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc5", "root", "root");
			
			 Statement stmt;
			 ResultSet rs;
			 
			 stmt = con.createStatement(); 
			 
			 String name =o2.getName();
				
			 long MblNo=o2.getMblNo();
			 String pwd=o2.getPwd();
			 String gmail=o2.getGmail();
			 int age=o2.getAge();
			 String gender=o2.getGender();
			 String adress=o2.getAdress();
			 long altmb=o2.getAltmb();
			 int logintimes=o2.getlogintimes();

			 
			 PreparedStatement p=con.prepareStatement("update login set Name=?,mbl=?,Password=?,Gmail=?,age=?,gender=?,address=?,altmblno=? where Gmail=?");
				
				
			 p.setString(1, name);
		     p.setLong(2, MblNo);
		     p.setString(3, pwd);
	         p.setString(4, gmail);
		     p.setInt(5, age);
		     p.setString(6, gender);
		     p.setString(7, adress);
		     p.setLong(8, altmb);		  
		     p.setString(9, gmail);
			int n=p.executeUpdate();
			System.out.println("Your Data is Succesfully Updated");
			
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
public void delete1(dto o2){
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc5", "root", "root");
			
			 Statement stmt;
			 ResultSet rs;
			 
			 stmt = con.createStatement(); 
			 
			 String name =o2.getName();
				
			 long MblNo=o2.getMblNo();
			 String pwd=o2.getPwd();
			 String gmail=o2.getGmail();
			 int age=o2.getAge();
			 String gender=o2.getGender();
			 String adress=o2.getAdress();
			 long altmb=o2.getAltmb();
			 int logintimes=o2.getlogintimes();

			 
			 PreparedStatement p=con.prepareStatement("delete from login where Gmail=?");
				
				
			
		     p.setString(1, gmail);
			int n=p.executeUpdate();
			
			System.out.println("Your data is succesfully deleted");
			
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	
	
	}
	
	

	


