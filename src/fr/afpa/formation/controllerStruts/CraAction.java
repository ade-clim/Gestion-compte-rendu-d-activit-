package fr.afpa.formation.controllerStruts;

import java.util.Date;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import fr.afpa.formation.beanStruts.CraForm;
import fr.afpa.formation.beanStruts.LoginForm;
import fr.afpa.formation.metier.CraMetier;

public class CraAction extends Action{

	@SuppressWarnings("deprecation")
	public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest req, HttpServletResponse res) throws Exception{
		CraMetier craMetier = new CraMetier();
		String resultat = null;
		
		String dateActivite = ((CraForm) form).getDateActivite();
		System.out.println("Ma date "+dateActivite);
		if(craMetier.verifDateCrea(dateActivite)) {
			
		}
		
		
		
		
		return mapping.findForward(resultat);
	}
}
