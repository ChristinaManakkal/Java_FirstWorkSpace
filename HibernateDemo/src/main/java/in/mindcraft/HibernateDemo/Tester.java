package in.mindcraft.HibernateDemo;

//import org.apache.http.config.RegistryBuilder;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

public class Tester {

	public static void main(String[] args) {
		laptop l1=new laptop();
		l1.setLid(105);
		l1.setMake("Dell");
		
		laptop l2=new laptop();
		l2.setLid(106);
		l2.setMake("HP");
		
		
		Student s1=new Student();
		s1.setRollno(101);
		s1.setName("Christy");
		s1.getList().add(l1); //get laptop
		s1.getList().add(l2);
		
		Student s2=new Student();
		s2.setRollno(102);
		s2.setName("Aditi");
		
		Student s3=new Student();
		s3.setRollno(103);
		s3.setName("Christina");
		
		l1.setStudent(s1);
		l2.setStudent(s1);
		
		
		Configuration con=new Configuration().configure();
		ServiceRegistry reg=new ServiceRegistryBuilder().applySettings(con.getProperties()).buildServiceRegistry();
		SessionFactory sf=con.buildSessionFactory(reg);
		Session session=sf.openSession();

		Transaction tx=session.beginTransaction();
		
		session.save(s1); //will be inserted in db 
		session.save(s2);
		session.save(s3);
		
		session.save(l1);
		session.save(l2);
		
		tx.commit(); //will be saved in db
	}

}
