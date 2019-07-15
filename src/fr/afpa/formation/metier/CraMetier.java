package fr.afpa.formation.metier;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.hibernate.Session;

import fr.afpa.formation.dao.CraDao;
import fr.afpa.formation.dao.UtilisateurDao;
import fr.afpa.formation.entity.Cra;
import fr.afpa.formation.entity.Utilisateur;
import fr.afpa.formation.utils.HibernateUtils;

public class CraMetier {

	public boolean verifDateCrea(Date dateCrea) {
		boolean valeur = false;
		CraDao craDao = new CraDao();
		Session s = HibernateUtils.getSession();
		try {
			if(craDao.verifDateCrea(dateCrea, s)) {
				valeur = true;
			}
		} catch (Exception e) {
			System.out.println("erreur dans la methode verifDateCrea(CraMetier)" + e.getMessage());
		} finally {
			s.close();
		}
		return false;
	}
	
	public List<Cra> recupCra(String date) {
		List<Cra> maListe = new ArrayList<>();
		CraDao craDao = new CraDao();
		Session s = HibernateUtils.getSession();
		try {
			craDao.recupCra(date, s);
		} catch (Exception e) {
			System.out.println("erreur dans la methode verifDateCrea(CraMetier)" + e.getMessage());
		} finally {
			s.close();
		}
		return maListe;
	}
}
