
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Num
 */
@WebServlet("/Num")
public class Num extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public Num() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");

		double num1 = Double.parseDouble(request.getParameter("num1"));
		double num2 = Double.parseDouble(request.getParameter("num2"));

		PrintWriter out = response.getWriter();
		out.println("<html><body>");
		out.println("<h1>Operator Result</h1>");
		try {
			out.printf("Add: %f + %f = %f<br>", num1, num2, num1 + num2);
			out.printf("Sub: %f - %f = %f<br>", num1, num2, num1 - num2);
			out.printf("Mux: %f x %f = %f<br>", num1, num2, num1 * num2);
			out.printf("Div: %f / %f = %f<br>", num1, num2, num1 / num2);
		} catch (ArithmeticException e) {
			out.println(e.getMessage() + "<br>");
		} finally {
			out.println("</body></html>");
		}
		out.close();
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
