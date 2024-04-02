package Controller;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import DAO.UserDao;
import DTO.User;
@WebServlet("/saveuser")
@MultipartConfig(maxFileSize = 5*1024*1024)
public class Saveuser extends HttpServlet
{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException 
	{
		int id=Integer.parseInt(req.getParameter("userid"));
		String name=req.getParameter("username");
		String email=req.getParameter("useremail");
		long contact=Long.parseLong(req.getParameter("usercontact"));
		String password=req.getParameter("cfpassword");
		
		byte[] imagebyte=req.getPart("userimg").getInputStream().readAllBytes();
		
		User u=new User();
		u.setUserid(id);
		u.setUsername(name);
		u.setUseremail(email);
		u.setUsercontact(contact);
		u.setUserpassword(password);
		u.setUserimage(imagebyte);
		
		UserDao dao=new  UserDao();
		try {
			int res=dao.saveUser(u);
			
			if(res>0)
			{
				resp.sendRedirect("login.jsp");
			}
			else
			{
			resp.sendRedirect("signup.jsp");	
			}
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
