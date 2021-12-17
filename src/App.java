import java.util.List;
import java.sql.*;
import java.util.Iterator;

import com.intersystems.jdbc.IRISConnection;
import com.intersystems.binding.Id;

import com.intersystems.binding.IRISQuery;

import Sample.*;

public class App {

	// Data are populated by using https://github.com/intersystems/Samples-Data
	public static void main(String[] args) {
	      String url="jdbc:IRIS://localhost:1972/SAMPLES";
	      String username="_SYSTEM";
	      String pwd="SYS";
	      
	      try {
	    	  Class.forName ("com.intersystems.jdbc.IRISDriver");
	          IRISConnection  irisconnection = (IRISConnection)DriverManager.getConnection(url,username,pwd);
	    	  
	    	  Employee employee = null;

	    	  employee = (Employee)(Employee._open(irisconnection, new Id(197)));
	    	  System.out.println(employee.getName());
	    	  System.out.println(employee.getDOB());
	    	  employee.setSalary(12345);
	    	  employee._save();
	    	  
	    	  employee._close();
	    	  employee = null;

        	  // Fetch data via class query
	    	  ResultSet rs = null;
	    	  IRISQuery query = Person.query_ByName(irisconnection);
	          rs=query.execute("A");
	          while (rs.next()){
	        	  System.out.println("Name: "+rs.getString(2));
		      }	    	  

	          String sql = "SELECT ID,Name,Age FROM Sample.Person WHERE AGE<? AND ID>100";
	          PreparedStatement pstmt = irisconnection.prepareStatement(sql);
	          pstmt.setInt(1, 30);
	          rs = pstmt.executeQuery();
	          while (rs.next()) {
	        	  // Fetch data via JDBC interface
    	          System.out.println("ID: " + rs.getInt(1) + " Name: " + rs.getString(2) + " Age: " + rs.getInt(3));

    	          // If you want to open it as an object.
    	          employee = (Employee)(Employee._open(irisconnection, new Id(rs.getInt(1))));
    	          System.out.println("ID: " + rs.getInt(1) + " Name: " + employee.getName() + " Salary: " + employee.getSalary());
    	          List listOfFavoriteColors = (List)(employee.getFavoriteColors());
    	          Iterator iter = listOfFavoriteColors.iterator();
 	              System.out.print("  Favorite colors: ");
    	          while(iter.hasNext()){
    	             String color = (String) (iter.next());
    	             System.out.print("  [" + color+"]");
    	          }
 	              System.out.println("");
    	          
    	          employee._close();
    	       }
	    	  
	      }
	      catch(Exception e) {
	    	  e.printStackTrace();
	      }
	}

}
