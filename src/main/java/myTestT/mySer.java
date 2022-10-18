package myTestT;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class mySer
 */
@WebServlet("/mySer")
public class mySer extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public mySer() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Servlet#init(ServletConfig)
	 */
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
		System.out.println("");	
	}


	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    	//request.getRequestDispatcher("/WEB-INF/pageOne.jsp").forward(request, response);
    	response.setContentType("text/html");
    	PrintWriter out = response.getWriter();
    	//
    	out.println("<head>");
    	out.println("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">");
    	out.println("<style>");
    	out.println("* {");
    	out.println("  box-sizing: border-box;");
    	out.println("}");
    	out.println(".menu {");
    	out.println("float: left;");
    	out.println("width: 20%;");
    	out.println("}");
    	out.println(".menuitem {");
    	out.println("  padding: 8px;");
    	out.println("margin-top: 7px;");
    	out.println("border-bottom: 1px solid #f1f1f1;");
    	out.println("}");
    	out.println(".main {");
    	out.println(" float: left;");
    	out.println(" width: 60%;");
   		out.println(" padding: 0 20px;");
   		out.println("  overflow: hidden;");
   		out.println("}");
   		out.println(".right {");
   		out.println("background-color: lightblue;");
   		out.println(" float: left;");
   		out.println(" width: 20%;");
   		out.println("padding: 10px 15px;");
   		out.println("margin-top: 7px;");
   		out.println("}");
   		out.println("@media only screen and (max-width:800px) {");
   		out.println("/* For tablets: */");
  			out.println(".main {");
   			out.println("width: 80%;");
   			out.println("padding: 0;");
   			out.println("}");
   		out.println(".right {");
   		out.println("width: 100%;");
   		out.println("}");
   		out.println("}");
   		out.println("@media only screen and (max-width:500px) {");
   		out.println("/* For mobile phones: */");
   		out.println(".menu, .main, .right {");
   		out.println(" width: 100%;");
   		out.println(" }");
   		out.println("}");
   		out.println("</style>");
   		out.println("</head>");
   		out.println("<body style=\"font-family:Verdana\">");

   		out.println("<div style=\"background-color:#f1f1f1;padding:15px;\">");
   		out.println(" <h1>Cinque Terre</h1>");
   		out.println("  <h3>Resize the browser window</h3>");
   		out.println("</div>");

   		out.println("<div style=\"overflow:auto\">");
   		out.println("<div class=\"menu\">");
   		out.println("<div class=\"menuitem\">The Walk</div>");
   		out.println("  <div class=\"menuitem\">Transport</div>");
   		out.println("  <div class=\"menuitem\">History</div>");
   		out.println("  <div class=\"menuitem\">Gallery</div>");
   		out.println("</div>");

   		out.println(" <div class=\"main\">");
   		out.println("   <h2>The Walk</h2>");
   		out.println("<p>The walk from Monterosso to Riomaggiore will take you approximately two hours, give or take an hour depending on the weather conditions and your physical shape.</p>");
   		out.println("<img src=\"http://ngannguyen.space/web/rre.jpg\" style=\"width=100%\">");
   		out.println("</div>");

   		out.println("<div class=\"right\">");
   		out.println("<h2>What?</h2>");
   		out.println(" <p>Cinque Terre comprises five villages: Monterosso, Vernazza, Corniglia, Manarola, and Riomaggiore.</p>");
   		out.println("<h2>Where?</h2>");
   		out.println("<p>On the northwest cost of the Italian Riviera, north of the city La Spezia.</p>");
   		out.println("<h2>Price?</h2>");
   		out.println("<p>The Walk is free!</p>");
   		out.println("</div>");
   		out.println("</div>");
   		out.println("<div style=\"background-color:#f1f1f1;text-align:center;padding:10px;margin-top:7px;font-size:12px;\"> This web page is a part of a demonstration of fluid web design made by w3schools.com. Resize the browser window to see the content respond to the resizing.</div>");

   		out.println("</body>");
    	//Html,css code
    	
    	
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
