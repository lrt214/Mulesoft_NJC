
import java.sql.Connection;  
import java.sql.DriverManager;  
import java.sql.PreparedStatement;  
import java.sql.SQLException;  
   
public class Insert {  
   
    private Connection connect() {  
        // SQLite connection string  
        String url = "jdbc:sqlite:C://sqlite/Fav_movie.db";  
        Connection conn = null;  
        try {  
            conn = DriverManager.getConnection(url);  
        } catch (SQLException e) {  
            System.out.println(e.getMessage());  
        }  
        return conn;  
    }  
   
  
    public void insert(String name, String string, String string2, String string3, int year) {  
        String sql = "INSERT INTO  Movie(Name , Actor , Actress, Director,  YearOfRelease) VALUES(?,?,?,?,?)";  
   
        try{  
            Connection conn = this.connect();  
            PreparedStatement pstmt = conn.prepareStatement(sql);  
            pstmt.setString(1, name); 
            pstmt.setString(2, string); 
            pstmt.setString(3, string2); 
            pstmt.setString(4, string3); 
            pstmt.setDouble(5, year);  
            pstmt.executeUpdate();  
        } catch (SQLException e) {  
            System.out.println(e.getMessage());  
        }  
    }  
   
    public static void main(String[] args) {  
   
        Insert app = new Insert();  
        // insert three new rows  
        app.insert(" Men in Black   " , " Will Smith","Vincent D’Onofrio","Barry Sonnenfeld",1997); 
        app.insert(" The Shawshank Redemption " , " Tim Robbins","Renee Blaine ","Frank Darabont",1994); 
        app.insert("The Godfather" , "Marlon Brando","Diane Keaton","Francis Ford Coppola",1972); 
        app.insert("The Godfather 2" , "Al Pacino","Diane Keaton","Francis Ford Coppola",1974); 
        
          
    }  
   
}  
