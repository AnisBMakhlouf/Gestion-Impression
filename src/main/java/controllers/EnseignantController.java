package controllers;
import dao.EnseignantDao;
import dao.DemandeDeTirageDAO;
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

import models.Enseignant;
import models.Utilisateur;
import models.DemandeDeTirage;

/**
 * Servlet implementation class AuthController
 */
@WebServlet(urlPatterns = { "/Enseignant/Authentification","/Enseignants", "/Enseignant/Ajouter", "/Enseignant/Modifier/*", "/Enseignant/MesDemandeDeTirage" })
public class EnseignantController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EnseignantController() {
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
		Enseignant currentUser = null;
		String login = request.getParameter("login");
		String pwd = request.getParameter("password");
		ServletContext application = getServletContext();
		HttpSession session = request.getSession();
		Utilisateur ens = null;
		String path = request.getServletPath();
		
		//Auth
		if (path.equals("/Enseignant/Authentification")) {
		try {
			ens = EnseignantDao.FindByLoginPwd(login, pwd);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if (ens != null) {
			
				session.setAttribute("currentUser", ens);
				//response.sendRedirect("bienvenue.jsp");
				//getServletContext().getRequestDispatcher("/tableau_ens.jsp").forward(request, response);
				response.sendRedirect("/IITGestionImpression/tableau_ens.jsp");
			
		}
		else {
			request.setAttribute("erreur", "Aucun utilisateur n'est inscrit !!!");
			getServletContext().getRequestDispatcher("/index.jsp").forward(request, response);
		}
		
			}
		
		
		//Get All
				if (path.equals("/Enseignants")) {
					List<Utilisateur> listens = null;
				try {
					listens = EnseignantDao.GetAllEns();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				if (ens != null) {
					
						session.setAttribute("listens", listens);
					
				}
				else {
					request.setAttribute("erreur", "Aucun utilisateur n'est inscrit !!!");
					getServletContext().getRequestDispatcher("/index.jsp").forward(request, response);
				}
				
					}
				
				
				if (path.equals("/Enseignant/MesDemandeDeTirage")) {
					List<DemandeDeTirage> demandeList = null;
				try {
					
					Utilisateur u = (Utilisateur) session.getAttribute("currentUser");
					demandeList = DemandeDeTirageDAO.getEnseignantDemande(u.getNomComplet());
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				if (ens != null) {
					
						session.setAttribute("demandeList", demandeList);
					
				}
				else {
					request.setAttribute("erreur", "Aucun utilisateur n'est inscrit !!!");
					getServletContext().getRequestDispatcher("/tableau_admin.jsp").forward(request, response);
				}
				
					}
				}

				
				}
	


}
