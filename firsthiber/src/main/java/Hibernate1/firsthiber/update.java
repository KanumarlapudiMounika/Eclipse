package Hibernate1.firsthiber;

import org.hibernate.*;
import org.hibernate.cfg.Configuration;
public class update {

	public static void main(String[] args) {
		System.out.println("Started...........");
		
		
		Configuration cfg=new Configuration();
		cfg.configure();
		SessionFactory factory =cfg.buildSessionFactory();
		Session session=factory.openSession();
		Transaction tx=session.beginTransaction();
		
		
		
		Student s1=(Student)session.get(Student.class, 106);
		s1.setName("KSM");
		session.save(s1);
		tx.commit();
		factory.close();
	}

}
