package in.mindcraft.HibernateInheritanceDemo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

import in.mindcraft.HibernateInheritanceDemo.Account;

public class Tester {

	public static void main(String[] args) {
		Account a1=new Account();
		a1.setAccid(101);
		a1.setName("Christy");
		a1.setBalance(50000);
		
		SavingsAccount s1=new SavingsAccount();
		s1.setAccid(102);
		s1.setInterestRate(5);
		
		CurrentAccount c1=new CurrentAccount();
		c1.setAccid(103);
		c1.setOverlimit(10000);
		
		
		
		Configuration con=new Configuration().configure();
		ServiceRegistry reg=new ServiceRegistryBuilder().applySettings(con.getProperties()).buildServiceRegistry();
		SessionFactory sf=con.buildSessionFactory(reg);
		Session session=sf.openSession();

		Transaction tx=session.beginTransaction();
		
		session.save(a1); //will be inserted in db 
		session.save(s1);
		session.save(c1);
		
		
		
		tx.commit();

	}

}
