package fr.afpa.formation.entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.*;

@Entity
@Table

public class Utilisateur implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)

	@Column(name = "id_utilisateur")
	private int idUtilisateur;
	@Column(name = "role")
	private String role;
	@Column(name = "matricule")
	private String matricule;
	@Column(name = "login")
	private String login;
	@Column(name = "mdp")
	private String mdp;
	@Column(name = "nom")
	private String nom;
	@Column(name = "prenom")
	private String prenom;
	@Column(name = "numero_secu")
	private String numeroSecu;
	@Column(name = "mail")
	private String mail;
	@Column(name = "telephone")
	private String telephone;
	@Column(name = "numero_rue")
	private String numeroRue;
	@Column(name = "libelle_rue")
	private String libelleRue;
	@Column(name = "code_postal")
	private String codePostal;
	@Column(name = "ville")
	private String ville;
	@Column(name = "pays")
	private String pays;
	
	@OneToMany(mappedBy="utilisateur")
	private List<Cra> listeCra;
	
	public void addCra(Cra cra) {
		listeCra.add(cra);
	}
	
	public Utilisateur() {
		super();
	}

	public Utilisateur(int idUtilisateur, String role, String matricule, String login, String mdp, String nom,
			String prenom, String numeroSecu, String mail, String telephone, String numeroRue, String libelleRue,
			String codePostal, String ville, String pays) {
		super();
		this.idUtilisateur = idUtilisateur;
		this.role = role;
		this.matricule = matricule;
		this.login = login;
		this.mdp = mdp;
		this.nom = nom;
		this.prenom = prenom;
		this.numeroSecu = numeroSecu;
		this.mail = mail;
		this.telephone = telephone;
		this.numeroRue = numeroRue;
		this.libelleRue = libelleRue;
		this.codePostal = codePostal;
		this.ville = ville;
		this.pays = pays;
	}

	public Utilisateur(String role, String matricule, String login, String mdp, String nom, String prenom,
			String numeroSecu, String mail, String telephone, String numeroRue, String libelleRue, String codePostal,
			String ville, String pays) {
		super();
		this.role = role;
		this.matricule = matricule;
		this.login = login;
		this.mdp = mdp;
		this.nom = nom;
		this.prenom = prenom;
		this.numeroSecu = numeroSecu;
		this.mail = mail;
		this.telephone = telephone;
		this.numeroRue = numeroRue;
		this.libelleRue = libelleRue;
		this.codePostal = codePostal;
		this.ville = ville;
		this.pays = pays;
	}


	
	public int getIdUtilisateur() {
		return idUtilisateur;
	}

	public void setIdUtilisateur(int idUtilisateur) {
		this.idUtilisateur = idUtilisateur;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public String getMatricule() {
		return matricule;
	}

	public void setMatricule(String matricule) {
		this.matricule = matricule;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getMdp() {
		return mdp;
	}

	public void setMdp(String mdp) {
		this.mdp = mdp;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getNumeroSecu() {
		return numeroSecu;
	}

	public void setNumeroSecu(String numeroSecu) {
		this.numeroSecu = numeroSecu;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	public String getNumeroRue() {
		return numeroRue;
	}

	public void setNumeroRue(String numeroRue) {
		this.numeroRue = numeroRue;
	}

	public String getLibelleRue() {
		return libelleRue;
	}

	public void setLibelleRue(String libelleRue) {
		this.libelleRue = libelleRue;
	}

	public String getCodePostal() {
		return codePostal;
	}

	public void setCodePostal(String codePostal) {
		this.codePostal = codePostal;
	}

	public String getVille() {
		return ville;
	}

	public void setVille(String ville) {
		this.ville = ville;
	}

	public String getPays() {
		return pays;
	}

	public void setPays(String pays) {
		this.pays = pays;
	}

	public List<Cra> getListeCra() {
		return listeCra;
	}

	public void setListeCra(List<Cra> listeCra) {
		this.listeCra = listeCra;
	}

	
	
}
