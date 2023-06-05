package project2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashSet;

import javax.management.loading.PrivateClassLoader;

import crud.student;

public class dto {

	private String name;
	private long MblNo;
    private String pwd;
    private String gmail;
    private int age;
    private String gender;
    private String adress;
    private long altmb;
    private int logintimes;
    private String post;
    private boolean ulogin;
    
    //for login validation
    int ss=0;
    int fs=0;
    int wm=0;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		
	
		this.name = name;
	}
	public long getMblNo() {
		return MblNo;
	}
	public void setMblNo(long mblNo) {
		MblNo = mblNo;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	public String getGmail() {
		return gmail;
	}
	public void setGmail(String gmail) {
		this.gmail = gmail;
	}
	public int getAge() {
		return age;
	}
	public int setAge(int age) {
		this.age = age;
		return age;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getAdress() {
		return adress;
	}
	public void setAdress(String adress) {
		this.adress = adress;
	}
	
	public long getAltmb() {
		return altmb;
	}
	public void setAltmb(long altmb) {
		this.altmb = altmb;
	}
    
    
    public void setlogintimes(int logintimes)
    {
    	this.logintimes=logintimes;
    }
    
    public int getlogintimes() {
		return logintimes;
	}
    
    public void setpost(String post)
    {
    	this.post=post;
    }
    
    public String getpost() {
		return post;
	}
    
    
	public boolean getuLogin() {
		return ulogin;
	}
	public void setuLogin(boolean ulogin) {
		this.ulogin = ulogin;
	}
    
    
	
}
