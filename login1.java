package project2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class login1 implements mainpage{
		
		
		public void display(dto rf1) {
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
			
			dto a=new dto();
		a.setGmail(gmail);
		a.setPwd(password);
		
		logintype lt = new afterlogin();
	dao.login(a,lt);
		
			
}
}

class afterlogin implements logintype{
	
	
	@Override
		public void afterlogin(project2.dto o2)  {
			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
				Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc5", "root", "root");
		
		
		 Statement stmt;
		 ResultSet rs;
		 
		 stmt = con.createStatement();          
		 System.out.println("You Succesfully Login with "+o2.getGmail()+" account");
		 rs = stmt.executeQuery("SELECT logintimes FROM login where gmail='"+o2.getGmail()+"'");   
		
		 int logintimes = 0;
		 if(rs.next()){
		 logintimes =rs.getInt(1);
		 }
			logintimes++;
			o2.setlogintimes(logintimes);
			logintimes =o2.getlogintimes();
			  rs.close();
			
 PreparedStatement ps=con.prepareStatement("UPDATE login SET logintimes = ? WHERE Gmail =?");
 ps.setString(2, o2.getGmail());
 ps.setInt(1, logintimes);		
 
 ps.executeUpdate();
 
         System.out.println("you Login for "+logintimes+" time's");
       
         
        post(o2);
         
                     // Close the ResultSet                 4 
stmt.close();                     // Close the Statement                 5
	con.close();
			
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}
		
		private int uo=0;
			public void post(project2.dto o2) {
				try {
					Class.forName("com.mysql.cj.jdbc.Driver");
					Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc5", "root", "root");
			
			
			 Statement stmt;
			 ResultSet rs;
			 
			 stmt = con.createStatement(); 
	
			if(uo!=1) {
			 System.out.println("press1 If your want to post");
			}else {
				
				System.out.println("Press1 For New Post");
			}
			
			if(uo!=2) {
	         System.out.println("press2 If your see your posts");
			}
else {
				
				System.out.println("Press1 For refresh Posts");
			}
			if(uo!=3) {
	         System.out.println("press3 If your want to check your profile");
			}else
			{
				System.out.println("press3 for refresh profile");
			}
	         Scanner sc =new Scanner(System.in);
	        
	        uo=sc.nextInt();
	        if(uo==1) {
	         String ps;
	         do {
	        	 System.out.println("please share somthing With your friends empty post will be not updated");
	        	ps=sc.next(); 
	         }
	         while(ps==null);
	         o2.setpost(ps);
	         PreparedStatement p=con.prepareStatement("insert into post values(?)");
	        
	        
	        	 
	        	p.setString(1, ps);
	        	
	    	     System.out.println("succesfully uploaded your post");
	    	     
	    	     int n=0;
	    	     n=p.executeUpdate();
	    	   
		         p.close();
	    	     post(o2);
	    	     
	    	     
	         }
	        
	         
	 		
	         

	         if(uo==3) {
				  rs = stmt.executeQuery("select * from login where Gmail='"+ o2.getGmail() +"'");   
				  System.out.println(o2.getGmail());
		        	 while (rs.next()) {    
		        		     		 
		        		
		      System.out.println("name");
		      System.out.println(rs.getString(1));
		      System.out.println("MblNo");
		      System.out.println(rs.getString(2));
		      System.out.println("pwd");
		      System.out.println(rs.getString(3));
		      System.out.println("gmail");
		      System.out.println(rs.getString(4));
		      System.out.println("age");
		      System.out.println(rs.getString(5));
		      System.out.println("gender");
		      System.out.println(rs.getString(6));
		      System.out.println("adress");
		      System.out.println(rs.getString(7));
		      System.out.println("altmb");
		      System.out.println(rs.getString(8));
		      System.out.println("logintimes");
		      System.out.println(rs.getString(8));

		         	
		         	
		        	 }
		         	
		         	post(o2);
		          }

					stmt.close();                     // Close the Statement                 5
					con.close();
					} 
				
				
				 
				
				
				
				catch (ClassNotFoundException | SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			@Override
			public void display() {
				// TODO Auto-generated method stub
				
			}
			
		
		}

