import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.GregorianCalendar;


public class DB_ACESS_JDBC {

	public static void main(String args[]){
			try {
				Class.forName("com.mysql.jdbc.Driver").newInstance();
			} catch (InstantiationException | IllegalAccessException
					| ClassNotFoundException e1) {
				e1.printStackTrace();
			}
			String localhost = "127.0.0.1";
			String dataBaseName = "JDBCEINFACH";
			int portnumber = 3306;
			String mySqlUrl = "jdbc:mysql://" + localhost + ":" + portnumber + "/" + dataBaseName;
			try{
				Connection c = DriverManager.getConnection(mySqlUrl,"root","");
			
				Statement s = c.createStatement();
				
				ResultSet lehrer = s.executeQuery("SELECT * FROM l_lehrer");
				System.out.println("Lehrerschaft:");
				printLehrer(lehrer);
				
				s = c.createStatement();
				s.executeUpdate("INSERT INTO `l_lehrer`(`l_nummer`, `l_vorname`, `l_nachname`) VALUES (9,'Grieﬂmayer','Thomas')");
				ResultSet recentlyUpdated1 = s.executeQuery("SELECT * FROM l_lehrer WHERE l_nummer=9");
				System.out.println("Insert:");
				printLehrer(recentlyUpdated1);
				
				s.executeUpdate("UPDATE JDBCEINFACH.l_lehrer SET l_vorname = 'Markus' WHERE l_nummer = 9");
				ResultSet recentlyUpdated2 = s.executeQuery("SELECT * FROM l_lehrer WHERE l_nummer=9");
				System.out.println("Update:");
				printLehrer(recentlyUpdated2);
				
				s.executeUpdate("DELETE FROM JDBCEINFACH.l_lehrer WHERE l_nummer=9");
				ResultSet recentlyUpdated3 = s.executeQuery("SELECT * FROM l_lehrer WHERE l_nummer=9"); //Wenn kein Datensatz angezeigt wird ist das DELETE erfolgreich.
				System.out.println("Delete:");
				printLehrer(recentlyUpdated3);
				c.close();
			} 
			catch (SQLException e){
				e.printStackTrace();
			}
			
			
	
	}
	
	public static void printLehrer(ResultSet set) {
		try {
			while (set.next()) {
				System.out.println("Name: "
						+ set.getString("l_vorname")
						+ ' '
						+ set.getString("l_nachname"));}
						
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
