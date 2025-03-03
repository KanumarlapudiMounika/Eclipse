package Hibernate1.firsthiber;

import org.hibernate.*;
import org.hibernate.cfg.Configuration;


public class Select {
		public static void main(String[] args) {
			System.out.println("Started............................");
			Configuration cfg=new Configuration();
			cfg.configure();
			SessionFactory factory = cfg.buildSessionFactory();
			Session session=factory.openSession();
			
			Student s1=(Student)session.get(Student.class, 101);
			System.out.println(s1);
			System.out.println("fetching the data using the load");
			Student s2= (Student)session.load(Student.class, 103);
			System.out.println(s2);
			factory.close();
			System.out.println("Finished");
		}
}
