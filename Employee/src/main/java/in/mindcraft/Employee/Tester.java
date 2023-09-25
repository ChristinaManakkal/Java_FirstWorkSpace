package in.mindcraft.Employee;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

public class Tester {

	public static void main(String[] args) {
		

		//import org.apache.http.config.RegistryBuilder;
		
		

		

			
				Address a1=new Address();
				a1.setStreet("Dahisar");
				a1.setCity("Mumbai");
				a1.setState("Maharashtra");
				
				Address a2=new Address();
				a2.setStreet("Deonar");
				a2.setCity("Navi Mumbai");
				a2.setState("Maharashtra");
				
				
				Employee e1=new Employee();
				e1.setEmpid(101);
				e1.setName("Christy");
				e1.getList().add(a1); //get laptop
				e1.getList().add(a2);
				
//				Student s2=new Student();
//				s2.setRollno(102);
//				s2.setName("Aditi");
//				
//				Student s3=new Student();
//				s3.setRollno(103);
//				s3.setName("Christina");
//				
//				l1.setStudent(s1);
//				l2.setStudent(s1);
				
				
				Configuration con=new Configuration().configure();
				ServiceRegistry reg=new ServiceRegistryBuilder().applySettings(con.getProperties()).buildServiceRegistry();
				SessionFactory sf=con.buildSessionFactory(reg);
				Session session=sf.openSession();

				Transaction tx=session.beginTransaction();
				
				session.save(a1); //will be inserted in db 
				session.save(a2);
				//session.save(s3);
				
				session.save(e1);
				//session.save(l2);
				
				tx.commit(); //will be saved in db
			}

		


	}


