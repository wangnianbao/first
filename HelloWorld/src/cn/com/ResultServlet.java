package cn.com;


public class ResultServlet {
	/*@RequestMapping(value="resultServlet/validateCode",method=RequestMethod.POST)
    public void doPost(HttpServletRequest request, HttpServletResponse response)         
            throws ServletException, IOException {         
        response.setContentType("text/html;charset=utf-8");         
        String validateC = (String) request.getSession().getAttribute("validateCode");         
        String veryCode = request.getParameter("c");         
        PrintWriter out = response.getWriter();         
        if(veryCode==null||"".equals(veryCode)){         
            out.println("验证码为空");         
        }else{         
            if(validateC.equals(veryCode)){         
                out.println("验证码正确");         
            }else{         
                out.println("验证码错误");         
            }         
        }         
        out.flush();         
        out.close();*/         
  //  }         

}
