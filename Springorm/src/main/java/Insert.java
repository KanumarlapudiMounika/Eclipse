import geekpro.Springorm.*; 
//import context.ContextProvider; 
import Studentdao.StudentDao; 
import Context.ContextProvider;
import org.springframework.context.ApplicationContext; 

public class Insert { 
	public static void main(String[] args) { 
		
		ApplicationContext ctx= ContextProvider.provideContext(); 
		StudentDao studentDao=ctx.getBean("stDao",StudentDao.class); 

		// insert 
		Student s=new Student(101,"Nisha"); 
		studentDao.insert(s); 

	} 
}
