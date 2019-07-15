package fr.afpa.formation.controllerStruts;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionError;
import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import fr.afpa.formation.beanStruts.*;
import fr.afpa.formation.entity.Utilisateur;
import fr.afpa.formation.metier.UtilisateurMetier;

public class LoginAction extends Action {

	@SuppressWarnings("deprecation")
	public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest req, HttpServletResponse res) throws Exception{
		String resultat = null;
		String login = ((LoginForm) form).getLogin();
		String role = ((LoginForm) form).getRole();
		String password = ((LoginForm) form).getPassword();
		System.out.println(role);

		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
		String dateStr = simpleDateFormat.format(new Date());

		System.out.println(dateStr);
		
		
//  	Date aujourdhui = new Date();
//		DateFormat shortDateFormat = DateFormat.getDateTimeInstance(DateFormat.SHORT, DateFormat.SHORT);
//		System.out.println(shortDateFormat.format(aujourdhui));
		
		if("Manager".equals(role)) {
			UtilisateurMetier utilisateurMetier = new UtilisateurMetier();
			List<Utilisateur> maListe = utilisateurMetier.rechercheCompteUtilisateur(login, password);
			
			for (Utilisateur utilisateur : maListe) {
				System.out.println(utilisateur.toString());
			}
			if(!maListe.isEmpty()) {
				HttpSession session = req.getSession();
				session.setAttribute("Utilisateur", maListe.get(0));
				resultat = "succesManager";
			}
			else
				resultat = "echec";
			
		}
		else if("Collaborateur".equals(role)) {
			UtilisateurMetier utilisateurMetier = new UtilisateurMetier();
			List<Utilisateur> maListe = utilisateurMetier.rechercheCompteUtilisateur(login, password); 
			if(!maListe.isEmpty()) {
				HttpSession session = req.getSession();
				session.setAttribute("Utilisateur", maListe.get(0));
				resultat = "succesCollaborateur";
			}
			else
				resultat = "echec";
			
		}
		if (resultat.equals("echec")) {
			ActionErrors errors = new ActionErrors();
			errors.add("login", new ActionError("app.login.erreur"));
			errors.add("password", new ActionError("app.password.erreur"));
			if(!errors.isEmpty()) {
				saveErrors(req, errors);
			}
		}

		return mapping.findForward(resultat);
	}
}
