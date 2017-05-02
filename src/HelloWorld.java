import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HelloWorld extends HttpServlet {
	public void doGet (HttpServletRequest req, HttpServletResponse res)
			throws ServletException, IOException {
		PrintWriter out;

		res.setContentType("text/html; charset=Shift_JIS");
		out = res.getWriter();

		out.println("<html><body>");
		out.println("<h1>Hello World!</h1>");
		out.println("<p>Servletのサンプル（HelloServlet.java）</p>");
		out.println("</body></html>");
	}
}