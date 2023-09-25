package in.mindcraft.HQLDemo;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

import in.mindcraft.HQLDemo.MobilePhone;

public class Tester {

	public static void main(String[] args) {
//		MobilePhone m1=new MobilePhone(101,"Oppo",15000);   //calling parameterised constructor
//		MobilePhone m2=new MobilePhone(102,"Iphone",95000);
//		MobilePhone m3=new MobilePhone(103,"Vivo",20000);
		
		MobilePhone m1=new MobilePhone(104,"Redmi",25000);   //calling parameterised constructor
		
		
		
		Configuration con=new Configuration().configure();
		ServiceRegistry reg=new ServiceRegistryBuilder().applySettings(con.getProperties()).buildServiceRegistry();
		SessionFactory sf=con.buildSessionFactory(reg);
		Session session=sf.openSession();

		Transaction tx=session.beginTransaction();
		
//		session.save(m1); //will be inserted in db 
//	session.save(m2);
//		session.save(m3);
		
		//MobilePhone m=(MobilePhone)session.get(MobilePhone.class, 102);
		//System.out.println("Details of mobile:"+m);
		
		//Query query=session.createQuery("from MobilePhone"); //create HQL query like select * from table_name
		
		Query query=session.createQuery("from MobilePhone where  cost>20000"); //HQL query
		List<MobilePhone> mlist=query.list(); //using query obj call list method
		for(MobilePhone m:mlist)
			System.out.println(m);
		
		tx.commit();

	}

}
