
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Person
 */
@WebServlet("/Person")
public class Person extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");

		String name = request.getParameter("name");
		String id = request.getParameter("id");
		String password = request.getParameter("pass");
		String gender = request.getParameter("gender");
		String[] mailtype = request.getParameterValues("mailtype");
		String job = request.getParameter("job");
		
		PrintWriter out = response.getWriter();
		out.println("<html><body>");
		out.println("<h2>Personal Information</h2>");
		out.println("이름 : " + name + "<p>");
		out.println("아이디 : " + id + "<p>");
		out.println("암호 : " + password + "<p>");
		out.println("성별 : " + gender + "<p>");
		out.println("수신메일 : ");
		for (int i = 0; i < mailtype.length; i++) {
			out.print(mailtype[i]);
			if (i + 1 < mailtype.length) {
				out.print(", ");
			}
		}
		out.print("<p>직업 : "+job);
		out.println("</body></html>");
		out.close();
	}

}
