package javaJDBC;

import java.sql.*;

public class JdbcExample {

		   
		   static final String JDBC_DRIVER = "org.mariadb.jdbc.Driver";  
		   static final String DB_URL = "jdbc:mariadb://localhost/example";

		   
		   static final String USER = "root";
		   static final String PASS = "ajeng123";
		   
		   public static void main(String[] args) {
		   Connection conn = null;
		   Statement stmt = null;
		   try{
		      
		      Class.forName("org.mariadb.jdbc.Driver");

		      
		      System.out.println("Connecting to database...");
		      conn = DriverManager.getConnection(DB_URL,USER,PASS);

		      
		      System.out.println("Creating statement...");
		      stmt = conn.createStatement();
		      String sql;
		      sql = "SELECT ID, AGE, FIRST_NAME, LAST_NAME FROM biodata";
		      ResultSet rs = stmt.executeQuery(sql);

		      
		      while(rs.next()){
		         
		         int id  = rs.getInt("ID");
		         int age = rs.getInt("AGE");
		         String first = rs.getString("FIRST_NAME");
		         String last = rs.getString("LAST_NAME");

		         
		         System.out.print("ID NUM: " + id);
		         System.out.print(", AGE: " + age);
		         System.out.print(", FIRST_NAME: " + first);
		         System.out.println(", LAST_NAME: " + last);
		      }
		      
		      rs.close();
		      stmt.close();
		      conn.close();
		   }catch(SQLException se){
		      
		      se.printStackTrace();
		   }catch(Exception e){
		      
		      e.printStackTrace();
		   }finally{
		      
		      try{
		         if(stmt!=null)
		            stmt.close();
		      }catch(SQLException se2){
		      }
		      try{
		         if(conn!=null)
		            conn.close();
		      }catch(SQLException se){
		         se.printStackTrace();
		      }
		   }
		   System.out.println("Goodbye!");
		}
		
	}

