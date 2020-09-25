package javaJDBC;

import java.sql.*;

public class JdbcExample {

		   // JDBC driver name and database URL
		   static final String JDBC_DRIVER = "org.mariadb.jdbc.Driver";  
		   static final String DB_URL = "jdbc:mariadb://localhost/example";

		   //  Database credentials
		   static final String USER = "root";
		   static final String PASS = "ajeng123";
		   
		   public static void main(String[] args) {
		   Connection conn = null;
		   Statement stmt = null;
		   try{
		      //STEP 2: Register JDBC driver
		      Class.forName("org.mariadb.jdbc.Driver");

		      //STEP 3: Open a connection
		      System.out.println("Connecting to database...");
		      conn = DriverManager.getConnection(DB_URL,USER,PASS);

		      //STEP 4: Execute a query
		      System.out.println("Creating statement...");
		      stmt = conn.createStatement();
		      String sql;
		      sql = "SELECT ID, AGE, FIRST_NAME, LAST_NAME FROM biodata";
		      ResultSet rs = stmt.executeQuery(sql);

		      //STEP 5: Extract data from result set
		      while(rs.next()){
		         //Retrieve by column name
		         int id  = rs.getInt("ID");
		         int age = rs.getInt("AGE");
		         String first = rs.getString("FIRST_NAME");
		         String last = rs.getString("LAST_NAME");

		         //Display values
		         System.out.print("ID: " + id);
		         System.out.print(", AGE: " + age);
		         System.out.print(", FIRST_NAME: " + first);
		         System.out.println(", LAST_NAME: " + last);
		      }
		      //STEP 6: Clean-up environment
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
		//end FirstExample
	}

