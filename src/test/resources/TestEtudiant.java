import static org.junit.Assert.*;

import java.util.Date;
import java.util.List;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;



import spring.jsf.tpjsf.entities.Etudiant;
import spring.jsf.tpjsf.entities.Examen;
import spring.jsf.tpjsf.metier.InterMetierEtudiant;




public class TestEtudiant {
	private static ClassPathXmlApplicationContext context;
	private static InterMetierEtudiant metier;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		context=new ClassPathXmlApplicationContext("applicationContext.xml");
		metier=(InterMetierEtudiant) context.getBean("EtudiantMetier");
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		context.close();
		
	}

	
	Etudiant e1= new Etudiant("Rengassamy","Alex",new Date(17/9/1988),"0621729076","alexstains@hotmail.fr","Stains","Mecanique");
	Etudiant e2= new Etudiant("Rengassamy","Alex",new Date(17/9/1988),"0621729076","alexstains@hotmail.fr","Stains","Mecanique");
	Etudiant e3= new Etudiant("Rengassamy","Alex",new Date(17/9/1988),"0621729076","alexstains@hotmail.fr","Stains","Mecanique");
	@Test
	public void testAddEtudiant() {
		metier.AddEtudiant(e1);
		metier.AddEtudiant(e2);
		metier.AddEtudiant(e3);
		assertNotNull(e1.getIdEtudiant());
	}

	@Test
	public void testAddEtudiantToSession() {
		metier.AddEtudiantToSession(1L, 2L);
		assertNotNull(metier.getEtudiant(1L).getSession().getIdSession());
	}

	@Test
	public void testDeleteEudiant() {
		metier.deleteEudiant(e1);
		assertNull(e1.getIdEtudiant());
	}

	@Test
	public void testUpdateEtudiant() {
		metier.updateEtudiant(1L);
		assertNull(e3.getIdEtudiant());
	}

	@Test
	public void testGetEtudiant() {
		Etudiant e = metier.getEtudiant(1L);
		assertNotNull(e.getIdEtudiant());
	}

	@Test
	public void testGetListofEtudiant() {
		List<Etudiant> tab=metier.getListofEtudiant();
		assertTrue(tab.size()>0);
	}

	@Test
	public void testGetExamenbyEtudiant() {
		List<Examen> tab = metier.getExamenbyEtudiant(2L);
		assertTrue(tab.size()>0);
	}

}
