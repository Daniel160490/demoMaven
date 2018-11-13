package es.indra;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class ServletLogin
 */
@WebServlet("/ServletLogin")
public class ServletLogin extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * Default constructor.
	 */
	public ServletLogin() {

	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//RequestDispatcher requestDispatcher = request.getRequestDispatcher("home.jsp");
		//requestDispatcher.forward(request, response);
		
		HttpSession session = request.getSession();
		String nombre = request.getParameter("login");
		String idioma = request.getParameter("idioma");
		session.setAttribute("usuario", nombre);
		session.setAttribute("idioma", idioma);
		request.getRequestDispatcher("home.jsp").forward(request, response);
		
		Cookie miCookie = new Cookie("usuario","idioma");
		// hacemos que nuestra cookie tenga sentido durante un día
		miCookie.setMaxAge(60*60*24);
		response.addCookie(miCookie);
		
		
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
