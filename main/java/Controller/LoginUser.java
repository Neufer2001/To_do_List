package Controller;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import DAO.UserDao;
import DTO.User;
@WebServlet("/loginuser")
public class LoginUser extends HttpServlet
{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException 
	{
		String email=req.getParameter("loginemail");
		String password=req.getParameter("loginpassword");
		
		UserDao dao=new UserDao();
		try {
			User u=dao.findByEmail(email);
			if(u!=null)
			{
				if(u.getUserpassword().equals(password))
				{
					req.getSession().setAttribute("user", u);
					req.getRequestDispatcher("home.jsp").include(req, resp);
				//resp.getWriter().print(" login verified");
				}
				else
				{
				//	req.getRequestDispatcher("login.jsp").include(req, resp);
				//	resp.getWriter().print(" login not verified");
				}
			}
			else
			{
			//	req.getRequestDispatcher("login.jsp").include(req, resp);
				//resp.getWriter().print(" login not verified");
			}
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
