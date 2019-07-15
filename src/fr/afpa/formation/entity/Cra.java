package fr.afpa.formation.entity;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.*;

@Entity
@Table(name = "Cra")

public class Cra implements Serializable  {
	
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)

	@Column(name = "id_cra")
	private int idCra;
	@Column(name = "date_activite")
	private String dateActivite;
	@Column(name = "etat_demande")
	private String etatDemande;
	@Column(name = "date_etat_cra")
	private String dateEtatCra;
	@Column(name = "commentaire")
	private String commentaire;
	@Column(name = "charge")
	private double charge;
	
	@ManyToOne
	@JoinColumn (name="id_utilisateur")
	private Utilisateur utilisateur ;
	
	@OneToMany(mappedBy="cra")
	private List<Activite> listeActivite;
	
	public void addActivite(Activite activite) {
		listeActivite.add(activite);
	}

	
	
	public Cra() {
		super();
	}

	public Cra(int idCra, String dateActivite, String etatDemande, String dateEtatCra, String commentaire,	double charge) {
		super();
		this.idCra = idCra;
		this.dateActivite = dateActivite;
		this.etatDemande = etatDemande;
		this.dateEtatCra = dateEtatCra;
		this.commentaire = commentaire;
		this.charge = charge;
	}

	public Cra(String dateActivite, String etatDemande, String dateEtatCra, String commentaire, double charge) {
		super();
		this.dateActivite = dateActivite;
		this.etatDemande = etatDemande;
		this.dateEtatCra = dateEtatCra;
		this.commentaire = commentaire;
		this.charge = charge;
	}

	public Utilisateur getUtilisateur() {
		return utilisateur;
	}

	public void setUtilisateur(Utilisateur utilisateur) {
		this.utilisateur = utilisateur;
	}
	
	public int getIdCra() {
		return idCra;
	}

	public void setIdCra(int idCra) {
		this.idCra = idCra;
	}

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

	public String getDateEtatCra() {
		return dateEtatCra;
	}

	public void setDateEtatCra(String dateEtatCra) {
		this.dateEtatCra = dateEtatCra;
	}

	public String getCommentaire() {
		return commentaire;
	}

	public void setCommentaire(String commentaire) {
		this.commentaire = commentaire;
	}

	

	public double getCharge() {
		return charge;
	}

	public void setCharge(double charge) {
		this.charge = charge;
	}



	@Override
	public String toString() {
		return "Cra [idCra=" + idCra + ", dateActivite=" + dateActivite + ", etatDemande=" + etatDemande
				+ ", dateEtatCra=" + dateEtatCra + ", commentaire=" + commentaire + ", charge=" + charge
				+ ", utilisateur=" + utilisateur + ", listeActivite=" + listeActivite + "]";
	}



	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(charge);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((commentaire == null) ? 0 : commentaire.hashCode());
		result = prime * result + ((dateActivite == null) ? 0 : dateActivite.hashCode());
		result = prime * result + ((dateEtatCra == null) ? 0 : dateEtatCra.hashCode());
		result = prime * result + ((etatDemande == null) ? 0 : etatDemande.hashCode());
		result = prime * result + idCra;
		result = prime * result + ((listeActivite == null) ? 0 : listeActivite.hashCode());
		result = prime * result + ((utilisateur == null) ? 0 : utilisateur.hashCode());
		return result;
	}



	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Cra other = (Cra) obj;
		if (Double.doubleToLongBits(charge) != Double.doubleToLongBits(other.charge))
			return false;
		if (commentaire == null) {
			if (other.commentaire != null)
				return false;
		} else if (!commentaire.equals(other.commentaire))
			return false;
		if (dateActivite == null) {
			if (other.dateActivite != null)
				return false;
		} else if (!dateActivite.equals(other.dateActivite))
			return false;
		if (dateEtatCra == null) {
			if (other.dateEtatCra != null)
				return false;
		} else if (!dateEtatCra.equals(other.dateEtatCra))
			return false;
		if (etatDemande == null) {
			if (other.etatDemande != null)
				return false;
		} else if (!etatDemande.equals(other.etatDemande))
			return false;
		if (idCra != other.idCra)
			return false;
		if (listeActivite == null) {
			if (other.listeActivite != null)
				return false;
		} else if (!listeActivite.equals(other.listeActivite))
			return false;
		if (utilisateur == null) {
			if (other.utilisateur != null)
				return false;
		} else if (!utilisateur.equals(other.utilisateur))
			return false;
		return true;
	}

	
	

}
