import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import model.Szerzok;

public class Test {

	public static void main(String[] args) {
		System.out.println("Test start");
		
		EntityManagerFactory f = Persistence.createEntityManagerFactory("JPA_Demo");
		EntityManager m = f.createEntityManager();
		EntityTransaction t = m.getTransaction();
		t.begin();
		//új rekord
		Szerzok sz = new Szerzok();
		sz.setId(10);
		sz.setNev("Gardonyi Geza");
		m.persist(sz);	
		t.commit();
		
		System.out.println("Test stop");

	}

}
