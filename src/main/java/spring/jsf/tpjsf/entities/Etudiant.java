package spring.jsf.tpjsf.entities;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.Entity;
/*Auteur:Rengassamy Alex
 * nom Projet :ProjetEtudiant
 *date:25/05/2016
 *Package:com.com.ProjetEtudiant
 *Class:etudiant
 **
 * 
 * */

import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import org.springframework.format.annotation.DateTimeFormat;



@Entity
@DiscriminatorColumn(name="TypeEtudiant",discriminatorType=DiscriminatorType.STRING)
public class Etudiant implements Serializable {
	
	/*************** Attributes *********************/
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long idEtudiant;
	private String nomEtudiant;
	private String prenomEtudiant;
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date dateDeNaissance;
	private String telEtudiant;
	private String mailEtudiant;
	private String adresseEtudiant;
	private String specialiteEtudiant;
	
	/***************Association*************/
	
	/* association avec Salle */
	@ManyToOne
	@JoinColumn(name="idSession")
	private Session session;
	
	/*association avec etudiant*/
	@OneToMany(mappedBy="etudiant",fetch=FetchType.LAZY)	
	private List<Examen> tabExamen = new ArrayList<Examen>();
	
	/*association avec etudiant*/
	@OneToMany
	@JoinColumn(name="idMateriel")
	private List<Materiel> tabMateriel = new ArrayList<Materiel>();
	
	
	/******** getterEtsetter ****************/
	
	public Long getIdEtudiant() {
		return idEtudiant;
	}
	public void setIdEtudiant(Long idEtudiant) {
		this.idEtudiant = idEtudiant;
	}
	public String getNomEtudiant() {
		return nomEtudiant;
	}
	public void setNomEtudiant(String nomEtudiant) {
		this.nomEtudiant = nomEtudiant;
	}
	public String getPrenomEtudiant() {
		return prenomEtudiant;
	}
	public void setPrenomEtudiant(String prenomEtudiant) {
		this.prenomEtudiant = prenomEtudiant;
	}
	public Date getDateDeNaissance() {
		return dateDeNaissance;
	}
	public void setDateDeNaissance(Date dateDeNaissance) {
		this.dateDeNaissance = dateDeNaissance;
	}
	public String getTelEtudiant() {
		return telEtudiant;
	}
	public void setTelEtudiant(String telEtudiant) {
		this.telEtudiant = telEtudiant;
	}
	public String getMailEtudiant() {
		return mailEtudiant;
	}
	public void setMailEtudiant(String mailEtudiant) {
		this.mailEtudiant = mailEtudiant;
	}
	public String getAdresseEtudiant() {
		return adresseEtudiant;
	}
	public void setAdresseEtudiant(String adresseEtudiant) {
		this.adresseEtudiant = adresseEtudiant;
	}
	public String getSpecialiteEtudiant() {
		return specialiteEtudiant;
	}
	public void setSpecialiteEtudiant(String specialiteEtudiant) {
		this.specialiteEtudiant = specialiteEtudiant;
	}
	
	
	/********************* constructors **********************/
	
	
	public Etudiant(String nomEtudiant, String prenomEtudiant,
			Date dateDeNaissance, String telEtudiant, String mailEtudiant,
			String adresseEtudiant, String specialiteEtudiant) {
		super();
		this.nomEtudiant = nomEtudiant;
		this.prenomEtudiant = prenomEtudiant;
		this.dateDeNaissance = dateDeNaissance;
		this.telEtudiant = telEtudiant;
		this.mailEtudiant = mailEtudiant;
		this.adresseEtudiant = adresseEtudiant;
		this.specialiteEtudiant = specialiteEtudiant;
	}
	public Etudiant() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
}
