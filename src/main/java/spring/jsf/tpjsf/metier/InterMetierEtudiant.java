package spring.jsf.tpjsf.metier;
/****/
import java.util.List;

import spring.jsf.tpjsf.entities.Etudiant;
import spring.jsf.tpjsf.entities.Examen;

public interface InterMetierEtudiant {

	/*Ajouter un etudiant*/
	public Etudiant AddEtudiant(Etudiant e);
	
	public Etudiant AddEtudiantToSession(Long idEtudiant,Long idSession);
	
	/*supprimer un etudiant */
	public Etudiant deleteEudiant(Etudiant e); 
	
	/*modifier un etudiant*/
	public Etudiant updateEtudiant( Long Etudiant );
	
	
	public Etudiant getEtudiant(Long idEtudiant);
	
	/*consulter la liste des etudiants */
	public List<Etudiant>getListofEtudiant();
	
	public List<Examen> getExamenbyEtudiant(Long idEtudiant);
	
	
	
}
