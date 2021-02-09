package fr.eni.ecole.projectenchere.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class NouvelleVenteServlet
 */
@WebServlet("/NouvelleVente.html")
public class NouvelleVenteServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public NouvelleVenteServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.getRequestDispatcher("/WEB-INF/jsp/accueilAvecConnexion.jsp").forward(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.getWriter().append("je suis dans la doPost NouvelleVenteServlet");
		}
	}

