package controllers;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import models.Utilisateur;

/**
 * Servlet implementation class AuthController
 */
@WebServlet("/Administrateur/Authentification")
public class AdministrateurController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AdministrateurController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		boolean trouve = false;
		Utilisateur currentUser = null;
		String login = request.getParameter("login");
		String pwd = request.getParameter("password");
		ServletContext application = getServletContext();
		HttpSession session = request.getSession();
		List<Utilisateur> liste = (List<Utilisateur>) application.getAttribute("listeUsers");
		if (liste != null) {
			for (Utilisateur utilisateur : liste) {
				if(utilisateur.getLogin().equals(login) && utilisateur.getMotDePasse().equals(pwd)) {
					trouve = true;
					currentUser = utilisateur;
					break;
				}
			}
			if(trouve) {
				session.setAttribute("currentUser", currentUser);
				response.sendRedirect("index.jsp");
			}
			else
			{
				request.setAttribute("erreur", "Erreur d'authentification !!!");
				getServletContext().getRequestDispatcher("/authentification.jsp").forward(request, response);
			}
		}
		else {
			request.setAttribute("erreur", "Aucun utilisateur n'est inscrit !!!");
			getServletContext().getRequestDispatcher("/authentification.jsp").forward(request, response);
		}
		
	}

}
