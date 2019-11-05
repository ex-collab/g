package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Users;
import service.UsersDao;

/**
 * Servlet implementation class UserRegister
 */
public class UserRegister extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UserRegister() {
        super();
        // TODO Auto-generated constructor stub
    }


	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		String eid = request.getParameter("eid");
		String fname = request.getParameter("fname");
		String lname = request.getParameter("lname");
		String doj = request.getParameter("doj");
		String dept = request.getParameter("dept");
		
		Users users = new Users(eid, fname, lname, doj, dept);
		boolean flag = new UsersDao().registerUser(users);
		if(flag)
		{
			RequestDispatcher rd = request.getRequestDispatcher("index.html");
			request.setAttribute("msg", "user is successfully added");
			rd.forward(request,response);
		}
		else
		{
			RequestDispatcher rd = request.getRequestDispatcher("index.html");
			request.setAttribute("msg", "Sorry! user is not added");
			rd.forward(request,response);
		}
		
	}

}

