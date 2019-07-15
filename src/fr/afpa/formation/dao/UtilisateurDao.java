package fr.afpa.formation.dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import fr.afpa.formation.entity.Utilisateur;

public class UtilisateurDao {

	public void creerUtilisateur(Utilisateur utilisateur, Session s) {
		try {
			Transaction tx = s.beginTransaction();
			s.persist(utilisateur);
			tx.commit();
		} catch (Exception e) {
			System.out.println("erreur dans la methode creerUtilisateur(UtilisateurDao)"+e.getMessage());
		}
	}

	public List<Utilisateur> rechercheCompteUtilisateur(String login, String password, Session s) {
		List<Utilisateur> maListe = new ArrayList<>();
		try {
			Transaction tx = s.beginTransaction();
			Query query = s.createQuery("from Utilisateur where login= :loginIn and password= :passIn");
			query.setParameter("loginIn", login);
			query.setParameter("passIn", password);
			maListe = query.list();
			tx.commit();
			for (Utilisateur utilisateur : maListe) {
				System.out.println(utilisateur.toString());
			}
				
		}catch (Exception e) {
			System.out.println("erreur dans la methode rechercheCompteUtilisateur(UtilisateurDao)"+e.getMessage());
		}
		return maListe;
	}
}
