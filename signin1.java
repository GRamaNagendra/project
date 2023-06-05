package project2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashSet;
import java.util.InputMismatchException;
import java.util.Scanner;



public class signin1 implements mainpage{
	
	
static int ft;
String name;
long MblNo;
String pwd;
String gmail;
int age;
String gender;
String adress;
long altmb;
boolean ulogin;
dto o1 =new dto();
	public void display(dto ob1) {
	

		try {
	
	 
		Scanner sc =new Scanner(System.in);
		  ulogin = ob1.getuLogin();
		 if(ulogin==true)
		 {
	  
		 name =ob1.getName();
		 MblNo=ob1.getMblNo();
		pwd=ob1.getPwd();
		 gmail=ob1.getGmail();
		age=ob1.getAge();
		  gender=ob1.getGender();
		  adress=ob1.getAdress();
		  altmb=ob1.getAltmb();
	    
		}
	    
	    
	    if(ulogin==false)
	    {
		if(name==null) {
		System.out.println("For Enter Your Name* press1");
		}
		if(MblNo==0) {
		System.out.println("For Enter Your Mobile Number* press2");
		}
		if(pwd==null) {
		System.out.println("For Enter Your Password* press3");
		}
		if(gmail==null) {
		System.out.println("For Enter your Gmail* press4");
		}
		if(age==0) {
		System.out.println("For Enter your Age press5");
		}
		if(gender==null) {
		System.out.println("For Enter your Gender press6");
		}
		if(adress==null) {
		System.out.println("For Enter your Address press7");
		}
		
		if(altmb==0) {
		System.out.println("For Enter your Alternate Mobile NO press8");
		}
	    }
	    
	    
	    if(ulogin==true)
	    {
		if(name==null) {
		System.out.println("ssFor Enter Your Name* press1");
		}else {
			System.out.println("For Update Your Name press1");
		}
		if(MblNo==0) {
		System.out.println("ssFor Enter Your Mobile Number* press2");
		}
		else {
		System.out.println("For Update Your Mobile Number press2");
		}
		if(pwd==null) {
		System.out.println("For Enter Your Password* press3");
		}
		else {
			System.out.println("For Update Your Password press3");
			}
		if(gmail==null) {
		System.out.println("For Enter your Gmail* press4");
		}
		else {
			System.out.println("For Update Your gmail press4");
			}
		if(age==0) {
		System.out.println("For Enter your Age press5");
		}
		else {
			System.out.println("For Update Your age press5");
			}
		if(gender==null) {
		System.out.println("For Enter your Gender press6");
		}
		else {
			System.out.println("For Update Your gender press6");
			}
		if(adress==null) {
		System.out.println("For Enter your Address press7");
		}
		else {
			System.out.println("For Update Your Address press7");
			}
		
		if(altmb==0) {
		System.out.println("For Enter your Alternate Mobile NO press8");
		}
		else {
			System.out.println("For Update Your Alternate Mobile Number press8");
			}
	    }
	    if(ulogin==false) {
		System.out.println("To Create Account Please Enter 9");
	    }else {
	    	System.out.println("To Update Account please Enter 9");
	    }
		System.out.println("To GoBack");
		int n;
			 n = sc.nextInt();	
		
		if(ulogin==false)
		{
		if(!(name==null && n==1 || MblNo==0 && n==2 ||  pwd==null && n==3 || 
				gmail==null && n==4 ||  age==0  && n==5 || gender==null  && n==6 ||
				adress==null && n==7 || altmb==0 && n==8||n==9||n==10 ))
		{
			
			System.out.println("You are already entered the details");
			System.out.println("To Change the details press1");
			System.out.println("To add new details press2");
			int n3 =sc.nextInt();
				if(n3==1)	{
					switch(n)
					{
					case 1:String name;
					case 2:long MblNo;
					case 3:String pwd;
					case 4:String gmail;
					case 5:int age;
					case 6:String gender;
					case 7:String adress;
					case 8:long altmb;
					}
			
		}
				if(n3==2) {
					display(ob1);
					
				}
				if(n3>2)
				{
					System.out.println("Sorry you entered wrong input");
				}
				
				
		}
		}
	if(n==1) {
			 boolean b=true;
			do {
				System.out.println("Please Enter your name");
				System.out.println("Requirments :More then 3 Characters,Numbers are not allowed");
				  name = sc.next();
				  o1.setName(name);
				
				int c=0;
				 if(o1.getName().length()>=3)
				 {
					 
					 for (int i=0; i<o1.getName().length(); i++) {
						 char ch =o1.getName().charAt(i);
						 
						 if(ch>='0'&&ch<='9') {
							 
							c++;
							
			
						 }
					 }
					 if (c>=1)
					 {
						 System.out.println("You Entered Number so Requirments are not Matched");
							
						 
					 }else {
					 
					 o1.setName(name);
					 ob1.setName(name);
					 System.out.println("YOu Succesfully entered the Name");
					b=false;
					System.out.println();
					 System.out.println("Please Select New Opition To Add More Information");
						display(ob1);
					 }
				 }
				 else {
					 for (int i=0; i<o1.getName().length(); i++) {
						 char ch =o1.getName().charAt(i);
						 if(ch<=9) {
							c++;
			
						 }
					 }
					 if (!(c>=1))
					 {
						 System.out.println("You Entered Number and less than 3 so Requirments are not Matched");
						
						
						  
					 }
					 
					 
					 
				 }
				
			}
			 while(b);
			 
		}
		if(n==2){
			
			 
			 
			 boolean b=true;
				do {
					 System.out.println("Please Enter your Mobile Number");
					 System.out.println(" Requirments are Total 10 Numbers are required,and start with 9,8,6");
					 MblNo =sc.nextLong();
					
					 int c=0;

					 int length = String.valueOf(MblNo).length();
					 System.out.println(length);
					String str = String.valueOf(MblNo);
					char ch=str.charAt(0);
					int fn =ch-'0';
					
					
					
					 if((length==10)&& (fn==9)||(fn==8)||(fn==6)){
						 o1.setMblNo(MblNo);
						 ob1.setMblNo(MblNo);
						 System.out.println("success Your Number is added");
						 b=false;
						 System.out.println();
						 System.out.println("Please Select New Opition To Add More Information");
						display(ob1);
						 
					 }
					 else {
						 System.out.println("You Entered Number are not Matched with Requirments");
						
						
					 }
				}
				
				 while(b);
			   
		}
		if(n==3){
			  
			
			 
			 boolean b=true;
				do {
					 System.out.println("Please Enter your Password");
					 System.out.println(" Requirments are minimum One Special Character, number,uppercase,lowercase and minimum 6 letters");
					 pwd =sc.next();
					 
					 boolean uc=false;
					 boolean lc=false;
					 boolean nb=false;
					 boolean sp=false;
					 
					 for(int i=0; i<pwd.length();i++)
					 {
						 char ch1 =pwd.charAt(i);
						 
						 if( ch1>='a'&& ch1<='z')
						 {
							 lc=true;
						 }
						 
						 else if( ch1>='A'&& ch1<='Z')
						 {
							uc=true; 
							
						 }
						 else if(ch1>='0'&&ch1<='9')
						 {
							nb=true;
						
						 }
						 else {
							 sp=true;
						 }
						 
						
						
					 }
					 
					 
					 if(pwd.length()>=6&&uc==true&&lc==true&&nb==true&&sp==true)
						{
						 o1.setPwd(pwd);
						 ob1.setPwd(pwd);
							System.out.println("Succesfully you Created Your Password");
							 b=false;
							 System.out.println();
							 System.out.println("Please Select New Opition To Add More Information");
							display(ob1);
						}
						else {
							System.out.println("password is not matched");
							
						}
					 
					 
			 
			    
		}
				while(b);
		}
		if(n==4){
			   
			boolean b=true;
			
			  do {
				  System.out.println("Please Enter your Gmail");
					 System.out.println(" Requirments are No accounts are created on this mail and it contain complete id like  abcd@gmail.com and before@ there must be 3 characters");
					
		   String gend1="@gmail.com";
		   String gend2="@email.com";
		   String gend3="@outlook.com";
		   String gend4="@yahoo.com";
		   gmail=sc.next();
		 
		   
		 try {
			
		
		   if(gmail.substring(4).contains(gend1)||gmail.substring(4).contains(gend2)||gmail.substring(4).contains(gend3)||gmail.substring(4).contains(gend4))
		   {
			   
			   String gmdb ;
			   
			   if(gend1!=null)
				 {
					 gmdb=gend1;
				 }
				  if(gend2!=null)
				 {
					 gmdb=gend2;
				 } 
				  if(gend3!=null)
				 {
					 gmdb=gend3;
				 }
				  if(gend4!=null)
				 {
					 gmdb=gend4;
				 }
				 Statement stmt;
				 ResultSet rs;
				 HashSet<String> l1=new HashSet<>();
				 try {
						Class.forName("com.mysql.cj.jdbc.Driver");
						Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc5", "root", "root");
				 
				 stmt = con.createStatement();            
				 rs = stmt.executeQuery("select gmail FROM login");                    
				
				
				while (rs.next()) {
					
					gmdb =rs.getString(1);
					l1.add(gmdb);
				}
				
				rs.close();
				stmt.close();                     // Close the Statement                 5
				con.close();
				 } catch (ClassNotFoundException | SQLException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
			   
			   
			   
			   
			   int b1=l1.size();
			   l1.add(gmail);
			  int b2=l1.size();
			   
			   if(b1<b2) {
			   o1.setGmail(gmail);
			   ob1.setGmail(gmail);
			   System.out.println("gmail is succesfully created");
			   
			   b=false;
				 System.out.println();
				 System.out.println("Please Select New Opition To Add More Information");
				display(ob1);
		   }
			   else {
				   System.out.println("Already Account is Created on this gmail please create new one");
			   }
		   }
		   else {
			   System.out.println("gmail is not matched to our Requirments");
			   
		   }
		   
		 } catch (StringIndexOutOfBoundsException e) {
				// TODO: handle exception
			}
			  }
			  while(b);
		     
		}
		
		if(n==5){
			boolean b=true;
			
			  do {
			System.out.println("please Enter your Age");
			 age=sc.nextInt();
			o1.setAge(age);
			ob1.setAge(age);
			 b=false;
			 System.out.println();
			 System.out.println("Please Select New Opition To Add More Information");
			display(ob1);
		}
			  while(b);
		}
		
		if(n==6){
			
			boolean b=true;
			
			  do {
			System.out.println("please Enter your Gender");
			System.out.println("If you are Male press M ,Female press F,If NOt Intrested to mention please enter N only in capital letters");
			 gender = sc.next();
			 
			
			if(gender.length()==1) {
				char genderf=gender.charAt(0);
				if(genderf=='M'||genderf=='F'||genderf=='N')
				{
					 o1.setGender(gender);
					 ob1.setGender(gender);
					 System.out.println("Your Gender is Succesfully added");
					  b=false;
					System.out.println();
					 System.out.println("Please Select New Opition To Add More Information");
					display(ob1);
					
				}
				else {
					System.out.println("You Entered Diffrent Character it Does'Not Matched with the Requirments");
				}
			}
			else
			{
				System.out.println("YOu Enter More than One Character It Does'Not Matched with the Requirments");
			}
			
			  }
		     
			  while(b);
			     
		}
		if(n==7)
		{
			boolean b=true;
			
			 
			 do {
				 System.out.println("Please Enter Your Address Minimum 10 chars");
				 adress  =sc.next();
				 if (adress.length()>=10)
				 {
						o1.setAdress(adress);
						ob1.setAdress(adress);
						 System.out.println("Your Adress is Succesfully added");
						  b=false;
						System.out.println();
						 System.out.println("Please Select New Opition To Add More Information");
						display(ob1);
						
				 }
				 else{
					 System.out.println("Your Adress is not matched with our Requirments");
				 }
			 }
			 while(b);
  
		    
		}
		
		
			    
		    
		
		
		
		if(n==8){
			
			 
			 
			 boolean b=true;
				do {
					 System.out.println("Please Enter your Alternate Mobile Number");
					 System.out.println(" Requirments are Total 10 Numbers are required,and start with 9,8,6");
					 altmb =sc.nextLong();
					
					 int c=0;

					 int length = String.valueOf(altmb).length();
					 System.out.println(length);
					String str = String.valueOf(altmb);
					char ch=str.charAt(0);
					int fn =ch-'0';
					
					System.out.println(fn);
					
					 if((length==10)&& (fn==9)||(fn==8)||(fn==6)){
						
						 o1.setAltmb(altmb);
						 ob1.setAltmb(altmb);
						 System.out.println("success Your Number is added");
						 b=false;
						 System.out.println();
						 System.out.println("Please Select New Opition To Add More Information");
						display(ob1);
						 
					 }
					 else {
						 System.out.println("You Entered Number are not Matched with Requirments");
						
					 }
				}
				
				 while(b);
			   
		}
		
	if(n==9)
		{
		
		if(ulogin==false) {
			if(o1.getName()!=null && o1.getMblNo()!=0 && o1.getGmail()!=null &&o1.getPwd()!=null)	
			{
dao.insert(o1);


	}else {
		System.out.println("Manadatory Fields are not filled");
		display(ob1);
	}
		}
		else {
			
			update1 u1 =new update1();
			u1.update1(ob1);
		}
}
	
	if(n==10) {
	System.out.println("If you go back your details will not be saved");
	System.out.println("Press 1 confirm to go back");
	System.out.println("Press 2 no to go back");
	int n1=sc.nextInt();
	if(n1==1) {
		mainclass.main(null);
	}
	else if(n1==2){
		mainclass.main(null);
	}
	else {
		System.out.println("please Give Valid Input");
	}
	}
	
	if(n>12) {
		System.out.println("Please Enter the Valid Number");
	}
	
		
	
}
	 catch (InputMismatchException e) {
		// TODO: handle exception
		 System.out.println("This Enter Keys are not acceptable please click according to the requirments");
	display(ob1);
	 }	
	}
}
	
	

			    
		
		
		
		
	
	

		
