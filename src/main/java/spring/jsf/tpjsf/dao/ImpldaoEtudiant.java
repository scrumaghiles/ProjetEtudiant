package spring.jsf.tpjsf.dao;
/*******/
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;




import javax.persistence.Query;








import spring.jsf.tpjsf.entities.Etudiant;
import spring.jsf.tpjsf.entities.Examen;
import spring.jsf.tpjsf.entities.Session;

public class ImpldaoEtudiant implements InterdaoEtudiant {

	@PersistenceContext
    private EntityManager em;
	
	
	@Override
	public Etudiant AddEtudiant(Etudiant e) {
		em.persist(e);
	return e;
	}

	@Override
	public Etudiant AddEtudiantToSession(Long idEtudiant, Long idSession) {
		Etudiant e = em.find(Etudiant.class, idEtudiant);
		Session s = em.find(Session.class, idSession);
		s.getTabEtudiant().add(e);
		em.merge(s);
		return e;
	}

	@Override
	public Etudiant deleteEudiant(Etudiant e) {
		em.remove(e);
		return e;
	}

	@Override
	public Etudiant updateEtudiant(Long idEtudiant) {
		Etudiant e =em.find(Etudiant.class,idEtudiant);
	    em.merge(e);
		return e;
	}

	@Override
	public Etudiant getEtudiant(Long idEtudiant) {
		Etudiant e = em.find(Etudiant.class, idEtudiant);
		return e;
	}

	@Override
	public List<Etudiant> getListofEtudiant() {
		Query req=(Query) em.createQuery("from Etudiant");
		return req.getResultList();
	}

	@Override
	public List<Examen> getExamenbyEtudiant(Long idEtudiant) {
		Query query = em.createQuery("Select c.tabExamen from Etudiant e where e.idEtudiant = "+idEtudiant);
		return query.getResultList();
	}

}
