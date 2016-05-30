import static org.junit.Assert.*;

import java.util.Date;
import java.util.List;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import spring.jsf.tpjsf.entities.Session;

import spring.jsf.tpjsf.metier.InterMetierSession;


public class TestSession {
	private static ClassPathXmlApplicationContext context;
	private static InterMetierSession metier;

	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		context=new ClassPathXmlApplicationContext("applicationContext.xml");
		metier=(InterMetierSession) context.getBean("SessionMetier");
		
		
		
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		context.close();
		
	}

	
	Session s1= new Session("Juin",new Date(25/05/2016),new Date(25/06/2016));
	Session s2= new Session("Septembre",new Date(25/05/2016),new Date(25/06/2016));
	Session s3= new Session("Janvier",new Date(25/05/2016),new Date(25/06/2016));
	
	@Test
	public void testAddSession() {
		
		metier.AddSession(s1, 1L,1L);
		
		assertNotNull(s1.getIdSession());
		
	}

	@Test
	public void testDeleteSession() {
		int ancien = metier.getListofSession().size();
		metier.deleteSession(4L);
		int nouveau = metier.getListofSession().size();
		assertTrue(ancien > nouveau);
	}

	@Test
	public void testUpdateSession() {
		metier.updateSession(1L);
		assertNull(s3.getIdSession());
	}

	@Test
	public void testGetSession() {
		Session s = metier.getSession(3L);
		assertNotNull(s.getIdSession());
	}

	@Test
	public void testGetListofSession() {
		List<Session> tab=metier.getListofSession();
		assertTrue(tab.size()>0);
	}

}
