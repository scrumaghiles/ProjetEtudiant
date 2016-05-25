package spring.jsf.tpjsf.entities;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.format.annotation.DateTimeFormat;

import com.ProjetALA.Chambre.Chambre;
import com.ProjetALA.Employer.Employer;
import com.ProjetALA.Reservation.Reservation;

/*Auteur:Rengassamy Alex
 * nom Projet :ProjetEtudiant
 *date:25/05/2016
 *Package:com.com.ProjetEtudiant
 *Class:etudiant
 **
 * 
 * */
@Entity
@DiscriminatorColumn(name="TypeSession",discriminatorType=DiscriminatorType.STRING)
public class Session {

	/*************** Attributes *********************/
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long idSession;
	private String nomSession;
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	@Temporal(TemporalType.DATE)
	private Date dateDebutSession;
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	@Temporal(TemporalType.DATE)
	private Date dateFinSession;
	
	/****************Association***************/
	
	/* association avec module */
	@ManyToMany(mappedBy="listeSession",fetch=FetchType.EAGER)
	private List<Module> listeModule = new ArrayList<Module>();
	
	/* association avec Salle */
	@ManyToOne
	private Salle salle;
	
	/*association avec etudiant*/
	@OneToMany(mappedBy = "Session")
	private List<Etudiant> tabEtudiant = new ArrayList<Etudiant>();
	
	/******** getterEtsetter ****************/
	public Long getIdSession() {
		return idSession;
	}
	public void setIdSession(Long idSession) {
		this.idSession = idSession;
	}
	public String getNomSession() {
		return nomSession;
	}
	public void setNomSession(String nomSession) {
		this.nomSession = nomSession;
	}
	public Date getDateDebutSession() {
		return dateDebutSession;
	}
	public void setDateDebutSession(Date dateDebutSession) {
		this.dateDebutSession = dateDebutSession;
	}
	public Date getDateFinSession() {
		return dateFinSession;
	}
	public void setDateFinSession(Date dateFinSession) {
		this.dateFinSession = dateFinSession;
	}
	
	
	/********************* constructors **********************/
	
	public Session(String nomSession, Date dateDebutSession, Date dateFinSession) {
		super();
		this.nomSession = nomSession;
		this.dateDebutSession = dateDebutSession;
		this.dateFinSession = dateFinSession;
	}
	public Session() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
