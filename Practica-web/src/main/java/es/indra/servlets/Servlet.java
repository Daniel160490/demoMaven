package es.indra.servlets;



import java.io.IOException;
import java.io.PrintWriter;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import java.sql.Connection; 
import java.sql.DriverManager; 
import java.sql.SQLException;
import java.util.List;
import java.util.Properties;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import es.indra.beans.Categoria;
import es.indra.dao.CategoriasDao;
import javafx.print.Printer;


/**
 * Servlet implementation class Servlet
 */
@WebServlet("/Servlet")
public class Servlet extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
	
	CategoriasDao categoriasDao = new CategoriasDao();

    /**
     * Default constructor. 
     */
    public Servlet() {
        
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		int id = Integer.parseInt(request.getParameter("id"));
		String nombre =  request.getParameter("nombre");
		
		Categoria cat = new Categoria(id,nombre);
		
		categoriasDao.createCategory(cat);
		
		List<Categoria> todas =  categoriasDao.getAllCategories();
		
		request.setAttribute("listaCategoria", todas);
		
		request.getRequestDispatcher("listaCategoria.jsp").forward(request, response);
	}

}
