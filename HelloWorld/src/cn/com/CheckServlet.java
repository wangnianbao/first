package cn.com;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class CheckServlet
 */
@WebServlet("/CheckServlet")
public class CheckServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CheckServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	doPost(request, response);
	}
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//request.setCharacterEncoding("UTF-8");
	String user=request.getParameter("user");
	String pwd =request.getParameter("password");
	if(user.equals("admin")&&pwd.equals("admin")){
		//response.setContentType("text/html","ISO-8859-1");
		RequestDispatcher rd=this.getServletConfig()
				.getServletContext().
				getRequestDispatcher("/index.jsp");
	rd.forward(request, response);
	}else
	{
		RequestDispatcher rd=this.getServletConfig()
				.getServletContext().
				getRequestDispatcher("/login.html");
	rd.forward(request, response);
	}
	
			}

}
