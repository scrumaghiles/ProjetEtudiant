package spring.jsf.tpjsf.metier;
/******/
import java.util.List;

import spring.jsf.tpjsf.entities.Session;

public interface InterMetierSession {

	/*Ajouter une session*/
	public Session AddSession(Session s,Long idSalle,Long idModule);
	
	/*supprimer une session */
	public Session deleteSession(Long idSession);
	
	/*modifier un etudiant*/
	public Session updateSession(Long idSession);
	
	public Session getSession(Long idSession);
	
	/*consulter la liste des personnes */
	public List<Session>getListofSession();
	
	
	
}
