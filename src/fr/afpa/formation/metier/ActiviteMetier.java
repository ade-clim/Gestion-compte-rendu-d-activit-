package fr.afpa.formation.metier;

import java.util.ArrayList;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.classic.Session;

import fr.afpa.formation.dao.ActiviteDao;
import fr.afpa.formation.entity.Activite;
import fr.afpa.formation.entity.Cra;
import fr.afpa.formation.utils.HibernateUtils;

public class ActiviteMetier {

	public List<Activite> rechercheActivite(Cra cra){
		List<Activite> maListe = new ArrayList<>();
		ActiviteDao activiteDao = new ActiviteDao();
		
		try {
			Session s = HibernateUtils.getSession();
			maListe = activiteDao.rechercheActivite(cra, s);
		} catch (Exception e) {
			
		}
		return maListe;
	}
}
