package spring.jsf.tpjsf.bean;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;





import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;

import spring.jsf.tpjsf.entities.Etudiant;
import spring.jsf.tpjsf.entities.Examen;
import spring.jsf.tpjsf.metier.InterMetierEtudiant;
@Controller
@Component("EtudiantBean")
@RequestScoped
public class BeanEtudian implements Serializable {

	//attributs
	@Autowired
	private InterMetierEtudiant metier;
	private List<Etudiant> list = new ArrayList<Etudiant>();
	
	private Etudiant e = new Etudiant ();

	//getters&setters des attributs
	public List<Etudiant> getList() {
		return list;
	}

	public void setList(List<Etudiant> list) {
		this.list = list;
	}
	
	/*private String nomEtudiant="Rengassamy";
	private String prenomEtudiant="Alex";
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date dateDeNaissance;
	private String telEtudiant="0621729076";
	private String mailEtudiant="alexstains@hotmail.fr";
	private String adresseEtudiant="stains";
	private String specialiteEtudiant="mecanique";
	
	
	// getter and setters
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
	}*/
	

	// constructeur par défaut
	public BeanEtudian() {
		
	}
	
	public void afficher(){
		System.out.println("Affichage ok");
	}
	
	// méthodes
	/*Ajouter un etudiant*/
	public Etudiant AddEtudiant(){
		metier.AddEtudiant(e);
		return e;
	}
	
	//public Etudiant AddEtudiantToSession(Long idEtudiant,Long idSession);
	
	/*supprimer un etudiant */
	//public Etudiant deleteEudiant(Etudiant e); 
	
	/*modifier un etudiant*/
	//public Etudiant updateEtudiant( Long Etudiant );
	
	
	//public Etudiant getEtudiant(Long idEtudiant);
	
	public Etudiant getE() {
		return e;
	}

	public void setE(Etudiant e) {
		this.e = e;
	}

	/*consulter la liste des etudiants */
	public List<Etudiant> getListofEtudiant(){
		list = metier.getListofEtudiant();
		return list;
	}
	
	/*public List<Examen> getExamenbyEtudiant(Long idEtudiant);*/
	
}
