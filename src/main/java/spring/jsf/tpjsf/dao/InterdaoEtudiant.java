package spring.jsf.tpjsf.dao;



import java.util.List;




import spring.jsf.tpjsf.entities.Etudiant;
import spring.jsf.tpjsf.entities.Examen;


public interface InterdaoEtudiant {

	/*Ajouter un etudiant*/
	public Etudiant AddEtudiant(Etudiant e);
	
	public Etudiant AddEtudiantToSession(Long idEtudiant,Long idSession);
	
	/*supprimer un etudiant */
	public Etudiant deleteEudiant(Etudiant e); 
	
	/*modifier un etudiant*/
	public Etudiant updateEtudiant(Long idEtudiant);
	
	
	public Etudiant getEtudiant(Long idEtudiant);
	
	/*consulter la liste des etudiants */
	public List<Etudiant>getListofEtudiant();
	
	public List<Examen> getExamenbyEtudiant(Long idEtudiant);
	
}
