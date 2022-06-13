package controllers;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import models.DemandeDeTirage;
import models.Utilisateur;
import dao.DemandeDeTirageDAO;

/**
 * Servlet implementation class DemandeDeTirageController
 */
@WebServlet(urlPatterns = { "/GetAllDemandes","/ajouterDemande", "/modifierDemande", "/supprimerDemande" })
public class DemandeDeTirageController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DemandeDeTirageController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		HttpSession session = request.getSession();
		PrintWriter out = response.getWriter();
		String path = request.getServletPath();
		DemandeDeTirageDAO demandeTirageDAO = new DemandeDeTirageDAO();
		if (path.equals("/supprimerDemande")) {
			if (request.getParameter("id") != null) {
				String id = request.getParameter("id");
				demandeTirageDAO.supprimer(id);
				response.sendRedirect("listedemandetirage.jsp");
			}
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		HttpSession session = request.getSession();
		PrintWriter out = response.getWriter();
		String path = request.getServletPath();

		if (path.equals("/ajouterDemande")) {
			String matiere = request.getParameter("matiere");
			String classe = request.getParameter("classe");
			String enseignant = request.getParameter("enseignant");
			String status = request.getParameter("Status");
			String date = request.getParameter("date");
			int nbcopie = Integer.parseInt(request.getParameter("nbcopie"));
			String fihier = request.getParameter("fichier");
			int utilisateur_id = Integer.parseInt(request.getParameter("enseignant"));
			

			DemandeDeTirage u = new DemandeDeTirage(0, matiere, classe, fihier,enseignant, date,status,nbcopie,  utilisateur_id);
			try {
				DemandeDeTirageDAO.save(u);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			response.sendRedirect("listedemandetirage.jsp?success=vrai");

		} else if (path.equals("/modifierUtilisateur")) {

			
		}
	}

}
