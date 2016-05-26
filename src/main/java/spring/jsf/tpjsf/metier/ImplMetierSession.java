package spring.jsf.tpjsf.metier;
/******/
import java.util.List;



import org.apache.log4j.Logger;


import spring.jsf.tpjsf.dao.InterdaoSession;
import spring.jsf.tpjsf.entities.Session;

public class ImplMetierSession implements InterMetierSession {

	private final Logger LOG = Logger.getLogger("ImplMetierSession");
	private InterdaoSession daosession;
	
	public void setDaosession(InterdaoSession daosession) {
		this.daosession = daosession;
		LOG.info("daosession Session injected");
	}
	
	
	
	@Override
	public Session AddSession(Session s, Long idSalle, Long idModule) {
		daosession.AddSession(s, idSalle, idModule);
		return s;
	}

	@Override
	public Session deleteSession(Long idSession) {
		return daosession.deleteSession(idSession);
		
	}

	@Override
	public Session updateSession(Long idSession) {
		return daosession.updateSession(idSession);
	}

	@Override
	public Session getSession(Long idSession) {
		return daosession.getSession(idSession);
	}

	@Override
	public List<Session> getListofSession() {
		return daosession.getListofSession();
	}

}
