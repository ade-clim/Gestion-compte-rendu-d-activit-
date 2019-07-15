package fr.afpa.formation.metier;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;

import fr.afpa.formation.dao.UtilisateurDao;
import fr.afpa.formation.entity.Utilisateur;
import fr.afpa.formation.utils.HibernateUtils;
public class UtilisateurMetier {

	public void creerUtilisateur(Utilisateur utilisateur) {
		UtilisateurDao utilisateurDao = new UtilisateurDao();
		Session s = HibernateUtils.getSession();
		try {
			utilisateurDao.creerUtilisateur(utilisateur, s);;
		} catch (Exception e) {
			System.out.println("erreur dans la methode creerUtilisateur(UtilisateurMetier)" + e.getMessage());
		} finally {
			s.close();
		}
	}

	public List<Utilisateur> rechercheCompteUtilisateur(String login, String password) {
		UtilisateurDao utilisateurDao = new UtilisateurDao();
		List<Utilisateur> maListe = new ArrayList<>();
		Session s = HibernateUtils.getSession();
		try {
			maListe = utilisateurDao.rechercheCompteUtilisateur(login, password, s);

		} catch (Exception e) {
			System.out.println("erreur dans la methode creerUtilisateur(UtilisateurMetier)" + e.getMessage());
		} finally {
			s.close();
		}
		return maListe;
	}
}
