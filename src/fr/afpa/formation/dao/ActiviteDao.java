package fr.afpa.formation.dao;

import java.util.ArrayList;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.classic.Session;
import fr.afpa.formation.entity.Activite;
import fr.afpa.formation.entity.Cra;
import fr.afpa.formation.entity.Utilisateur;

public class ActiviteDao {

	public List<Activite> rechercheActivite(Cra cra, Session s){
		List<Activite> maListe = new ArrayList<>();
		try {
			Query query = s.createQuery("from Activite where id_cra=:idCraIn");
			query.setInteger("idCraIn", cra.getIdCra());
			maListe = query.list();
		} catch (Exception e) {
			
		}
		return maListe;
	}

	
}
