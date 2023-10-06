import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Insert_image_into_database {
public static void main(String[] args) throws SQLException {
	Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/cruduu","root","root");
	PreparedStatement ps=con.prepareStatement("create table images(id integer,image blob)");
	boolean y=ps.execute();
	System.out.println(y);
}
}
