package es.indra.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ServletDemo
 */
@WebServlet("/ServletDemo")
public class ServletDemo extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletDemo() {
        super();
        
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//	EJEMPLOS DE REEDIRECCION DE JSP.
		/*
		 * En este ejemplo se utiliza cuando quieres enviar mas parametros
		 */
		RequestDispatcher requestDispatcher = request.getRequestDispatcher("hola.jsp");
		requestDispatcher.forward(request, response);
		
		/*
		 * Cuando solo tenemos una pagina se puede hacer en una sola linea
		 */
		//request.getRequestDispatcher("index.jsp").forward(request, response);
		
		/*
		 * Esto otro ejemplo de reedirigir la peticion a otro lugar.
		 */
		//response.sendRedirect("");
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
