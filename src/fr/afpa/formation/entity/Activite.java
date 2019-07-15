package fr.afpa.formation.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Activite")

public class Activite implements Serializable {
	
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)

	@Column(name = "id_activite")
	private int idActivite;
	@Column(name = "libelle_activite")
	private String libelleActivite;
	@Column(name = "charge_activite")
	private String chargeActivite;
	
	@ManyToOne
	@JoinColumn(name="id_cra")
	private Cra cra ;

	public Activite() {
		super();
	}

	public Activite(int idActivite, String libelleActivite, String chargeActivite) {
		super();
		this.idActivite = idActivite;
		this.libelleActivite = libelleActivite;
		this.chargeActivite = chargeActivite;
	}

	public Activite(String libelleActivite, String chargeActivite) {
		super();
		this.libelleActivite = libelleActivite;
		this.chargeActivite = chargeActivite;
	}

	public int getIdActivite() {
		return idActivite;
	}

	public void setIdActivite(int idActivite) {
		this.idActivite = idActivite;
	}

	public String getLibelleActivite() {
		return libelleActivite;
	}

	public void setLibelleActivite(String libelleActivite) {
		this.libelleActivite = libelleActivite;
	}

	public String getChargeActivite() {
		return chargeActivite;
	}

	public void setChargeActivite(String chargeActivite) {
		this.chargeActivite = chargeActivite;
	}

	public Cra getCra() {
		return cra;
	}

	public void setCra(Cra cra) {
		this.cra = cra;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((chargeActivite == null) ? 0 : chargeActivite.hashCode());
		result = prime * result + ((cra == null) ? 0 : cra.hashCode());
		result = prime * result + idActivite;
		result = prime * result + ((libelleActivite == null) ? 0 : libelleActivite.hashCode());
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
		Activite other = (Activite) obj;
		if (chargeActivite == null) {
			if (other.chargeActivite != null)
				return false;
		} else if (!chargeActivite.equals(other.chargeActivite))
			return false;
		if (cra == null) {
			if (other.cra != null)
				return false;
		} else if (!cra.equals(other.cra))
			return false;
		if (idActivite != other.idActivite)
			return false;
		if (libelleActivite == null) {
			if (other.libelleActivite != null)
				return false;
		} else if (!libelleActivite.equals(other.libelleActivite))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Activite [idActivite=" + idActivite + ", libelleActivite=" + libelleActivite + ", chargeActivite=" + chargeActivite
				+ ", cra=" + cra + "]";
	}
	
	

}
