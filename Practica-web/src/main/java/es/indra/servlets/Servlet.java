package es.indra.servlets;



import java.io.IOException;
import java.io.PrintWriter;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import java.sql.Connection; 
import java.sql.DriverManager; 
import java.sql.SQLException; 
import java.util.Properties;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import javafx.print.Printer;


/**
 * Servlet implementation class Servlet
 */
@WebServlet("/Servlet")
public class Servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public Servlet() {
        
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		HttpSession session = request.getSession();
		String id = request.getParameter("id");
		int nuevoId = Integer.parseInt(id);
		String nombre = request.getParameter("nombre");
		session.setAttribute("id", id);
		session.setAttribute("nombre", nombre);
		request.getRequestDispatcher("listaCategoria.jsp").forward(request, response);
		
		
		Connection conn1 = null;
		try {
			String url1 = "jdbc:mysql://sql7.freemysqlhosting.net:3306/sql7264745";
			String user = "sql7264745";
			String password = "Zb1XGdwrD6";

			try {
				Class.forName("com.mysql.jdbc.Driver");
			} catch (ClassNotFoundException e1) {
				
				e1.printStackTrace();
			} 
			
			
			conn1 = DriverManager.getConnection(url1, user, password);
			if (conn1 != null) {
				System.out.println("Connected to the database sql7264745");
			}
		} catch (SQLException ex) {
			System.out.println("Error en la conexion,usuario /password incorrecto");
			ex.printStackTrace();
		}

		String query = " insert into categorias values (?, ?)";
		PreparedStatement preparedStmt;
		try {
			preparedStmt = conn1.prepareStatement(query);
			preparedStmt.setInt(1,nuevoId);
			preparedStmt.setString(2,nombre);
			preparedStmt.execute();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		
		String query2 = "SELECT * FROM categorias " + nuevoId;
		Statement st;
		PrintWriter out = response.getWriter();
		try {
			st = conn1.createStatement();
			ResultSet rs = st.executeQuery(query2);
			while (rs.next()) {
				int id2 = rs.getInt("id");
				String nombre2 = rs.getString("nombre");
				out.println("<br>"+ id2 +" "+ nombre2);
			}
			
			st.close();
			conn1.close();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
