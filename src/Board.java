/*제목 : ㅇㅇㅇ
작성자 : ㅇㅇㅇ
작성일 : Fri Dec 04 14:13:01 KST 2020
내용
ㅇㅇㅇㅇ*/

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Board
 */
@WebServlet("/Board")
public class Board extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Board() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html;charset=utf-8");
		request.setCharacterEncoding("utf-8");
		
		String title = request.getParameter("title");
		String writer = request.getParameter("writer");
		String content = request.getParameter("content");
		Date today = new Date();
		
		PrintWriter out = response.getWriter();
		out.println("<html><body>");
		out.println("<h1>게시판</h1>");
		out.println("제목 : "+ title+"<p>");
		out.println("작성자 : "+writer+"<p>");
		out.println("작성일 : " + today+"<p>");
		out.println("내용<br>");
		out.println("<pre>"+content+"</pre>");
		out.println("</body></html>");
		out.close();
	}

}
