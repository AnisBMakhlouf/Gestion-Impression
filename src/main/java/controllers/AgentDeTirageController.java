package controllers;
import dao.AgentDeTirageDAO;
import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.ui.ModelMap;

import models.AgentDeTirage;

/**
 * Servlet implementation class AuthController
 */
@WebServlet("/AgentDeTirage/Authentification")
public class AgentDeTirageController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AgentDeTirageController() {
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
		AgentDeTirage currentUser = null;
		String login = request.getParameter("login");
		String pwd = request.getParameter("password");
		ServletContext application = getServletContext();
		HttpSession session = request.getSession();
		AgentDeTirage adt = null;
		try {
			adt = (AgentDeTirage) AgentDeTirageDAO.FindByLoginPwd(login, pwd);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if (adt != null) {
			
				session.setAttribute("currentUser", adt);
				//response.sendRedirect("bienvenue.jsp");
				getServletContext().getRequestDispatcher("/tableau_agent.jsp").forward(request, response);
			
		}
		else {
			request.setAttribute("erreur", "Aucun utilisateur n'est inscrit !!!");
			getServletContext().getRequestDispatcher("/index.jsp").forward(request, response);
		}
		
	}
	
}
