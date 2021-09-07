
	import java.sql.Connection;  
	import java.sql.DriverManager;  
	import java.sql.SQLException;  
	import java.sql.Statement;  
	   
	public class Movies_fav {  
	   
	    public static void createNewTable() {  
	        // SQLite connection string  
	        String url = "jdbc:sqlite:C://sqlite/Fav_movie.db";  
	          
	        // SQL statement for creating a new table  
	        String sql = "CREATE TABLE IF NOT EXISTS Movie(\n"  
	                + " Name VHARCHAR(40),\n"  
	                + " Actor VHARCHAR(40),\n"
	                + " Actress VHARCHAR(40) ,\n" 
	                + " Director VHARCHAR(40),\n"
	                + " YearOfRelease INT \n"
	                +");";
	          
	        try{  
	            Connection conn = DriverManager.getConnection(url);  
	            Statement stmt = conn.createStatement();  
	            stmt.execute(sql);  
	        } catch (SQLException e) {  
	            System.out.println(e.getMessage());  
	        }  
	    }  
	   
	    /** 
	     * @param args the command line arguments 
	     */  
	    public static void main(String[] args) {  
	        createNewTable();  
	    }  
	   
	}  
