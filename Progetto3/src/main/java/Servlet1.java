

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Servlet1
 */
@WebServlet("/Servlet1")
public class Servlet1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Servlet1() {
        super();
     
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
       out.println("<!DOCTYPE html><html lang=\"it\"><head><title>tabella</title> </head><body> <form action=\"\" method=\"post\"><h4>Numero colonne</h4><input name=\"colonne\" type=\"text\"> <br><h4> Numero righe</h4><input name=\"righe\" type=\"text\"><br><button type=\"submit\">submit</button></form>  </body></html>");
          out.close();

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
	doGet(request, response);
response.setContentType("text/html");
PrintWriter out = response.getWriter();
String temp="";
int righe, colonne, i, j;

temp = request.getParameter("righe");
righe = Integer.valueOf(temp).intValue();

temp = "";

temp = request.getParameter("colonne");
colonne = Integer.valueOf(temp).intValue();
out.println("<table>");
for(i=1;i<=righe;i++) {
out.print("<tr>");
for(j=1;j<=colonne;j++) {
out.print("<td>" + i*j + "</td>");
}
out.print("</tr>");
}
out.println("</table>");

		
	}

}
