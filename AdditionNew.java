package scs;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class AdditionNew
 */
@WebServlet("/AdditionNew")
public class AdditionNew extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AdditionNew() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		String a1=request.getParameter("a")!=null?request.getParameter("a"):""; 
		String b1=request.getParameter("b")!=null?request.getParameter("b"):"";
		out.write("<form action='' method='post'>");
		out.write("<input type='text' name='txtnum1' placeholder='enter first number' value='"+a1+"'/><br>");
		out.write("<input type='text' name='txtnum2' placeholder='enter second number' value='"+b1+"'/><br>");
		out.write("<input type='submit' name='btnsubmit' value='+' />");
		out.write("<input type='submit' name='btnsubmit' value='-' />");
		out.write("<input type='submit' name='btnsubmit' value='*' />");
		out.write("<input type='submit' name='btnsubmit' value='/' />");
		out.write("</form>");
		
		if(request.getParameter("q")!=null)
		{
			out.print("Result is "+request.getParameter("q"));
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		try
		{
		
		int a = Integer.parseInt(request.getParameter("txtnum1"));
		int b = Integer.parseInt(request.getParameter("txtnum2"));
		int c ;
		if(request.getParameter("btnsubmit").equals("+"))
		{
			c=a+b;
		}
		else if(request.getParameter("btnsubmit").equals("-"))
		{
			c=a-b;
		}
		else if(request.getParameter("btnsubmit").equals("*"))
		{
			c=a*b;
		}
		else
		{
			c=a/b;
		}
		//out.write("result is "+c);
		//response.sendRedirect("AdditionNew?q="+c);
		//response.sendRedirect("https://shivaconceptsolution.com");
		response.sendRedirect("AdditionNew?q="+c+"&a="+a+"&b="+b);
		}
		catch(Exception ex)
		{
			out.write(ex.getMessage().toString());
		}
		
		
	}

}
