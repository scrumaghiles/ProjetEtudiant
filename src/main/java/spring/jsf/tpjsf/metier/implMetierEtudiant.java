package spring.jsf.tpjsf.metier;
/**/
import java.util.List;

import org.apache.log4j.Logger;






import spring.jsf.tpjsf.dao.InterdaoEtudiant;
import spring.jsf.tpjsf.entities.Etudiant;
import spring.jsf.tpjsf.entities.Examen;

public class implMetierEtudiant implements InterMetierEtudiant {

	private final Logger LOG = Logger.getLogger("ImplMetierEtudiant");
	private InterdaoEtudiant daoetudiant;
	
	public void setDaoetudiant(InterdaoEtudiant daoetudiant) {
		this.daoetudiant = daoetudiant;
		LOG.info("daoetudiant Etudiant injected");
	}
	
	@Override
	public Etudiant AddEtudiant(Etudiant e) {
	return daoetudiant.AddEtudiant(e);
		
	}

	@Override
	public Etudiant AddEtudiantToSession(Long idEtudiant, Long idSession) {
	return daoetudiant.AddEtudiantToSession(idEtudiant, idSession);
		
	}

	@Override
	public Etudiant deleteEudiant(Etudiant e) {
		return daoetudiant.deleteEudiant(e);
		
	}

	@Override
	public Etudiant updateEtudiant(Long idEtudiant) {
		return daoetudiant.updateEtudiant(idEtudiant);
		
	}

	@Override
	public Etudiant getEtudiant(Long idEtudiant) {
		return daoetudiant.getEtudiant(idEtudiant);
	}

	@Override
	public List<Etudiant> getListofEtudiant() {
		// TODO Auto-generated method stub
		return daoetudiant.getListofEtudiant();
	}

	@Override
	public List<Examen> getExamenbyEtudiant(Long idEtudiant) {
		return daoetudiant.getExamenbyEtudiant(idEtudiant);
	}

	
	
	
	
	
}
