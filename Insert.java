
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Insert {
   static final String DB_URL = "jdbc:sqlite:C://sqlite/Fav_movie.db";
   

   public static void main(String[] args) {
      // Open a connection
      try(Connection conn = DriverManager.getConnection(DB_URL);
         Statement stmt = conn.createStatement();
      ) {		      
         // Execute a query
         System.out.println("Inserting records into the table...");          
         String sql = "INSERT INTO Movie VALUES ('Men in Black' , 'Will Smith','Vincent D’Onofrio','Barry Sonnenfeld', 1997)";
         stmt.executeUpdate(sql);
         String sql1 = "INSERT INTO Movie VALUES ('The Shawshank Redemption' , 'Tim Robbins','Renee Blaine','Frank Darabont', 1994)";
         stmt.executeUpdate(sql1);
         String sql2 = "INSERT INTO Movie VALUES (\"The Godfather\" , \"Marlon Brando\",\"Diane Keaton\",\"Francis Ford Coppola\",1972)";
         stmt.executeUpdate(sql2);
         String sql3 = "INSERT INTO Movie VALUES (\"The Godfather 2\" , \"Al Pacino\",\"Diane Keaton\",\"Francis Ford Coppola\",1974)";
         stmt.executeUpdate(sql3);
         
         System.out.println("Inserted records into the table...");   	  
      } catch (SQLException e) {
         e.printStackTrace();
      } 
   }
}
