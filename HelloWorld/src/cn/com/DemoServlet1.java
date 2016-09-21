package cn.com;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
/**
 * Servlet implementation class DemoServlet1
 */
//@WebServlet("/DemoServlet1")
public class DemoServlet1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DemoServlet1() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		/*ServletConfig cfg = this.getServletConfig();
		System.out.println(cfg.getServletContext().getRealPath("/"));
		String fn = cfg.getInitParameter("Username");
		DemoServlet.class.getResourceAsStream(fn);
		PrintWriter out = response.getWriter();
		out.write("hello,goog morning");*/
		/* ServletContext context = this.getServletContext();
		context.setAttribute("name", "wnb_wangnianbao");
		ServletContext get_context = this.getServletContext();
		  String value = (String) get_context.getAttribute("name");  //获取域中的data属性
		  System.out.println(value);*/
		ServletContext ct=this.getServletContext();
		PrintWriter out = response.getWriter();
		 String value = (String) ct.getAttribute("temp1");  //获取域中的data属性
		  out.println(value);	  
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
