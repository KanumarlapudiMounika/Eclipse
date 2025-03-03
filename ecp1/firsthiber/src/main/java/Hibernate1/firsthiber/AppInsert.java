package Hibernate1.firsthiber;

import org.hibernate.Session;
import org.hibernate.cfg.Configuration;
import org.hibernate.*;
public class AppInsert {
	public static void main(String[] args) {
		System.out.println("Project Started.....");
		
		Configuration cfg=new Configuration();
		cfg.configure();
		SessionFactory factory=cfg.buildSessionFactory();
		Session session=factory.openSession();
		Transaction tx=session.beginTransaction();
		
		
		
		Student st= new Student();
	
		st.setId(110);
		st.setName("Mounika");
		st.setCity("Andhra");
		session.save(st);
		tx.commit();
		
		st.setId(109);
		st.setName("Satya");
		st.setCity("Andhar");
		session.save(st);
		tx.commit();
		
		st.setId(111);
		st.setName("Kanu");
		st.setCity("banglore");
		
		
	
		session.save(st);
		tx.commit();
		factory.close();
	
	
	
	
	}
}
