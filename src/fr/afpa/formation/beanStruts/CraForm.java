package fr.afpa.formation.beanStruts;

import java.util.Date;
import javax.servlet.http.HttpServletRequest;
import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;

import fr.afpa.formation.entity.Activite;


public class CraForm extends ActionForm{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String dateActivite;
	private String etatDemande;
	private Date dateEtatCra;
	private String commentaire;
	private Activite activite;
	private double charge;
	
	
	public String getDateActivite() {
		return dateActivite;
	}

	public void setDateActivite(String dateActivite) {
		this.dateActivite = dateActivite;
	}

	public String getEtatDemande() {
		return etatDemande;
	}

	public void setEtatDemande(String etatDemande) {
		this.etatDemande = etatDemande;
	}

	public Date getDateEtatCra() {
		return dateEtatCra;
	}

	public void setDateEtatCra(Date dateEtatCra) {
		this.dateEtatCra = dateEtatCra;
	}

	public String getCommentaire() {
		return commentaire;
	}

	public void setCommentaire(String commentaire) {
		this.commentaire = commentaire;
	}

	public Activite getActivite() {
		return activite;
	}

	public void setActivite(Activite activite) {
		this.activite = activite;
	}

	public double getCharge() {
		return charge;
	}

	public void setCharge(double charge) {
		this.charge = charge;
	}

	public ActionErrors validate() {
		 ActionErrors errors = new ActionErrors();
		 return errors;
	 }
	
	public void reset(ActionMapping mapping, HttpServletRequest request) {
		 
		 this.dateActivite = null;
		 this.etatDemande = null;
		 this.dateEtatCra = null;
		 this.commentaire = null;
		 this.activite = null;
		 this.charge = 0;
	 }
}
