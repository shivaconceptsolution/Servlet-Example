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
		out.write("<form action='' method='post'>");
		out.write("<input type='text' name='txtnum1' placeholder='enter first number' /><br>");
		out.write("<input type='text' name='txtnum2' placeholder='enter second number' /><br>");
		out.write("<input type='submit' name='btnsubmit' />");
		out.write("</form>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		int a = Integer.parseInt(request.getParameter("txtnum1"));
		int b = Integer.parseInt(request.getParameter("txtnum2"));
		int c = a+b;
		out.write("result is "+c);
		
		
	}

}
