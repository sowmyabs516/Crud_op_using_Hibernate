import java.io.File;
import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class Insert_images {
public static void main(String[] args) throws Exception {
	Class.forName("com.mysql.cj.jdbc.Driver");
	Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/cruduu","root","root");
	PreparedStatement ps=con.prepareStatement("insert into images values(?,?)");
	Scanner sc=new Scanner(System.in);
	
	System.out.println("enter id");
	ps.setInt(1, sc.nextInt());
	System.out.println("enter image path");
	FileInputStream fis=new FileInputStream("‪‪");
	ps.setBinaryStream(2, fis,fis.available());
	int y=ps.executeUpdate();
	System.out.println("Data Inserted");
	System.out.println(y);
}
}
