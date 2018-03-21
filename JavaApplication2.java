/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.*;
import java.util.Scanner;
/**
 *
 * @author akeen.bese15seecs
 */
public class JavaApplication2 {

    /**
     * @param args the command line arguments
     */
    //STEP 1. Import required packages



   // JDBC driver name and database URL
   static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";  
   static final String DB_URL = "jdbc:mysql://localhost/university";

   //  Database credentials
   static final String USER = "root";
   static final String PASS = "seecs@123";
   
   public static void main(String[] args) {
       Scanner u=new Scanner(System.in);
   Connection conn = null;
   Statement stmt = null;
   Statement stmt1 = null;
   try{
      //STEP 2: Register JDBC driver
      Class.forName("com.mysql.jdbc.Driver");

      //STEP 3: Open a connection
      System.out.println("Connecting to database...");
      conn = DriverManager.getConnection(DB_URL,USER,PASS);

      //STEP 4: Execute a query
      System.out.println("Creating statement...");
      stmt = conn.createStatement();
      stmt1 = conn.createStatement();
      String sql;
      sql = "SELECT * FROM student";
      ResultSet rs = stmt.executeQuery(sql);

      //STEP 5: Extract data from result set
      while(rs.next()){
         //Retrieve by column name
         
         int ID = rs.getInt("ID");
        String registration = rs.getString("registration");
        String classs = rs.getString("class");
        String section = rs.getString("section");
        String contact = rs.getString("contact");
        String address = rs.getString("address");
         //Display values
         
         System.out.println("ID: " + ID);
         System.out.println("registration: " + registration);
         System.out.println("class: " + classs);
         System.out.println("section: " + section);
         System.out.println("contact: " + contact);
         System.out.println("address: " + address);
         
      }
      System.out.println("Delete row");
      System.out.println("enter what to delete");
      int j=u.nextInt();
      int id;
      String registration,classs,section,contact,address;
      System.out.println("give value to delete");
      String r=u.next();
      if(j==0){
      id=Integer.parseInt(r);
      sql = "Delete from student where ID="+id+";";
      }if(j==1){
      registration=r;
      sql = "Delete from student where registration="+registration+";";
      }
      if(j==2){System.out.println(r);
      classs=r;
      sql = "Delete from student where class='"+classs+"';";
      }
      if(j==3){
      section=r;
      sql = "Delete from student where section='"+section+"';";
      }
      if(j==4){
      contact=r;
      sql = "Delete from student where contact='"+contact+"';";
      }
      if(j==5){
      address=r;
      sql = "Delete from student where address='"+address+"';";
      }
      
       PreparedStatement st = conn.prepareStatement(sql); 
       st.executeUpdate(); 
      System.out.println("Search row");
       System.out.println("enter what to search");
      int k=u.nextInt();
      int id1;
      String registration1,classs1,section1,contact1,address1;
      Scanner u1=new Scanner(System.in);
      System.out.println("enter value to search");
      String r1=u1.next();
      if(k==0){
      id1=Integer.parseInt(r1);
      System.out.println(id1);
      sql = "Select * from student where ID="+id1+";";
      }if(k==1){
      registration1=r1;
      System.out.println(registration1);
      sql = "Select * from student where registration="+registration1+";";
      }
      if(k==2){
      classs1=r1;
      sql = "Select * from student where class='"+classs1+"';";
      }
      if(k==3){
      section1=r1;
      sql = "Select * from student where section='"+section1+"';";
      }
      if(k==4){
      contact1=r1;
      sql = "Select * from student where contact='"+contact1+"';";
      }
      if(k==5){
      address1=r1;
      sql ="Select * from student where address='"+address1+"';";
      }
       ResultSet rs1 = stmt1.executeQuery(sql);

      //STEP 5: Extract data from result set
      while(rs1.next()){
         //Retrieve by column name
         
         int ID1 = rs1.getInt("ID");
        String registrationn1 = rs1.getString("registration");
        String classss1 = rs1.getString("class");
        String sectionn1 = rs1.getString("section");
        String contactt1 = rs1.getString("contact");
        String addresss1 = rs1.getString("address");
         //Display values
         
         System.out.println("ID: " + ID1);
         System.out.println("registration: " + registrationn1);
         System.out.println("class: " + classss1);
         System.out.println("section: " + sectionn1);
         System.out.println("contact: " + contactt1);
         System.out.println("address: " + addresss1);
         
      }
      rs.close();
      stmt.close();
      conn.close();
   }catch(SQLException se){
      //Handle errors for JDBC
      se.printStackTrace();
   }catch(Exception e){
      //Handle errors for Class.forName
      e.printStackTrace();
   }finally{
      //finally block used to close resources
      try{
         if(stmt!=null)
            stmt.close();
      }catch(SQLException se2){
      }// nothing we can do
      try{
         if(conn!=null)
            conn.close();
      }catch(SQLException se){
         se.printStackTrace();
      }//end finally try
   }//end try
   System.out.println("Goodbye!");
}//end main
}
    

