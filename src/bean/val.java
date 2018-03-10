package bean;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class val {
     public String name(int id) {
    	 String s="pavan";
    	 if(id>=5)
    		 return "Manikanta";
    	 return s;
     }
     public String getsql() {
    	 try{  
    		 Class.forName("com.mysql.jdbc.Driver");  

    		 Connection con=DriverManager.getConnection(  
    		 "jdbc:mysql://localhost:3306/employees?useSSL=false","mani","mani123");  
    		  
    		 Statement stmt=con.createStatement();  
    		 //ResultSet rs1=stmt.executeQuery("use employees");
    		 ResultSet rs=stmt.executeQuery("select id,name,password  from user905 where id=2");
    		 String s[]=new String[3];
    		 if(rs.next()) {
    		 s[0]=""+rs.getInt(1);
    		 s[1]=rs.getString(2);
    		 s[2]=rs.getString(3);}

    		 
    		 con.close(); 
    		 return s[1];
    		 }catch(Exception e){ System.out.println(e);} 
    	 return "No";
    		 }  
     }

