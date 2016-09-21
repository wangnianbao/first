package cn.com;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Calendar;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class wnb
 */
//@WebServlet("/wnb")
public class wnb extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public wnb() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out=response.getWriter();
		/*Calendar cd =Calendar.getInstance();
		PrintWriter out=response.getWriter();
		if(cd.getTime().getHours()<12)
		{
			out.write(" good morning");
		}else 
		{
			out.write("good afternoon");
		}
		out.write(cd.getTime().getDate());
		ServletContext context = this.getServletContext();
		  String value = (String) context.getAttribute("data");  //获取域中的data属性
		  System.out.println(value);*/
	String temp=request.getParameter("temp");
	ServletConfig scf=this.getServletConfig();
	ServletContext sc=scf.getServletContext();
	sc.setAttribute("temp1", temp);
	out.write("temperature="+temp);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
