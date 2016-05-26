package spring.jsf.tpjsf.dao;
/****/
import java.util.List;






import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;



import spring.jsf.tpjsf.entities.Module;
import spring.jsf.tpjsf.entities.Salle;
import spring.jsf.tpjsf.entities.Session;

public class ImpldaoSession implements InterdaoSession {
	@PersistenceContext
    private EntityManager em;
	
	
	@Override
	public Session AddSession(Session s, Long idSalle, Long idModule) {
		Salle sa = em.find(Salle.class, idSalle);
		Module m = em.find(Module.class, idModule);
		s.setSalle(sa);
		s.getListeModule().add(m);
		
		em.persist(s);
		sa.getSession().add(s);
		
		return s;
	}

	@Override
	public Session deleteSession(Long idSession) {
		Session s = em.find(Session.class, idSession);
		 em.remove(s);
		 return s;
	}

	@Override
	public Session updateSession(Long idSession) {
		Session s = em.find(Session.class, idSession);
		return s;
	}

	@Override
	public Session getSession(Long idSession) {
		Session s = em.find(Session.class, idSession);
		return s;
	}

	@Override
	public List<Session> getListofSession() {
		Query query= em.createQuery("from Session s");
		return query.getResultList();
	}

	
	
	
	
	
	
}
