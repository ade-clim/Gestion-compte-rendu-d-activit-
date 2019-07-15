package fr.afpa.formation.dao;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import fr.afpa.formation.entity.Cra;
import fr.afpa.formation.entity.Utilisateur;

public class CraDao {

	public boolean verifDateCrea(Date dateCrea, Session s) {
		try {
			Transaction tx = s.beginTransaction();
			Query query; 
			tx.commit();
		} catch (Exception e) {
			System.out.println("erreur dans la methode creerUtilisateur(verifDateCrea)"+e.getMessage());
		}
		return false;	
	}

	public List<Cra> recupCra(String date, Session s) {
		List<Cra> maListe = new ArrayList<>();
		try {
			Transaction tx = s.beginTransaction();
			Query query = s.createQuery(""); 
			tx.commit();
		} catch (Exception e) {
			System.out.println("erreur dans la methode creerUtilisateur(verifDateCrea)"+e.getMessage());
		}
		return maListe;
	}
	
	public List<Cra> rechercheCra(Utilisateur utilisateur, Session s){
		List<Cra> maListe = new ArrayList<>();
		try {
			Transaction tx = s.beginTransaction();
			Query query = s.createQuery("from Cra where id_utilisateur=:idUtilisateurIn");
			query.setInteger("idUtilisateurIn", utilisateur.getIdUtilisateur());
			maListe = query.list();
			tx.commit();
		} catch (Exception e) {
			// TODO: handle exception
		}
		return maListe;
	}

}
