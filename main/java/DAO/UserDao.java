package DAO;

import java.sql.Blob;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.sql.rowset.serial.SerialBlob;

import com.mysql.cj.protocol.Resultset;

import DTO.User;

public class UserDao 
{
	public static Connection getConnection() throws ClassNotFoundException, SQLException
	{
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/remainme","root","root");
		return con;
	}
	public static int saveUser(User u) throws ClassNotFoundException, SQLException
	{
		Connection con=getConnection();
		PreparedStatement pst=con.prepareStatement("insert into user values(?,?,?,?,?,?)");
		pst.setInt(1,u.getUserid());
		pst.setString(2,u.getUsername());
		pst.setString(3, u.getUseremail());
		pst.setLong(4,u.getUsercontact());
		pst.setString(6, u.getUserpassword());
		
		pst.setBlob(5,new SerialBlob(u.getUserimage()));
		int res=pst.executeUpdate();
		return res;	
		
	}
	public User findByEmail(String email) throws ClassNotFoundException, SQLException
	{
		Connection con=getConnection();
		PreparedStatement pst=con.prepareStatement("select * from user where useremail = ?");
		pst.setString(1, email);
		ResultSet rs=pst.executeQuery();
		
		User u=new User();	
		if(rs.next()) {
			
		u.setUserid(rs.getInt(1));
		u.setUsername(rs.getString(2));
		u.setUseremail(rs.getString(3));
		u.setUsercontact(rs.getLong(4));
		u.setUserpassword(rs.getString(6));
		
		Blob image=rs.getBlob(5);
		byte[] imagebyte=image.getBytes(1,(int)image.length());
		
		u.setUserimage(imagebyte);
		return u;
		}
		else
		{
			return null;
		}
		
	}
	

}
