package in.mindcraft.HibernateSwitchCase;

import java.util.List;
import java.util.Scanner;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

//import in.mindcraft.HQLSwitchCase.MobPhone;

public class Tester {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		//MobPhone mp = new MobPhone();
        
		Configuration con=new Configuration().configure();
		ServiceRegistry reg=new ServiceRegistryBuilder().applySettings(con.getProperties()).buildServiceRegistry();
		SessionFactory sf=con.buildSessionFactory(reg);
		Session session=sf.openSession();

		Transaction tx=session.beginTransaction();

        while (true) {
            System.out.println("\nSelect:");
            System.out.println("1. Add Mobile Phone");
            System.out.println("2. Display Mobile Phone");
            System.out.println("3. Update Mobile Phone");
            System.out.println("4. Delete Mobile Phone");
            System.out.println("5. Exit Menu");
            System.out.print("Enter your choice: ");
            int Choice = scanner.nextInt();

            switch (Choice) {
                case 1:
                	System.out.print("Enter mobile phone ID: ");
                    int id = scanner.nextInt();
                    scanner.nextLine(); 

                    System.out.print("Enter mobile phone name: ");
                    String brand = scanner.nextLine();

                    System.out.print("Enter mobile phone price: ");
                    double price = scanner.nextDouble();

                    // Create an instance of MobilePhone with user input
                    MobPhone m1 = new MobPhone(id, brand, price);
                    session.save(m1);
            		
            		tx.commit();
                    
                    break;
                case 2:
                	Query query=session.createQuery("from MobPhone");
                	List<MobPhone> mlist=query.list(); //using query obj call list method
            		for(MobPhone m:mlist)
            			System.out.println(m);
            		tx.commit();
            
            break;
        case 3:
            System.out.println("Enter details to be updated");
            System.out.print("Enter mobile phone ID: ");
            int mid = scanner.nextInt();
            scanner.nextLine(); 

            System.out.print("Enter mobile phone name: ");
            String name = scanner.nextLine();

            System.out.print("Enter mobile phone price: ");
            double cost = scanner.nextDouble();

            // Create an instance of MobilePhone with user input
            MobPhone mo = new MobPhone(mid, name, cost);
            session.update(mo);
    		
    		tx.commit();
            
            break;
            
        case 4:
        	System.out.print("Enter the mobile phone ID to delete: ");
            int d = scanner.nextInt();
        	String hql = "DELETE FROM MobPhone WHERE mid = :mobilePhoneId";
            Query q = session.createQuery(hql);
            q.setParameter("mobilePhoneId", d);

            int deletedCount = q.executeUpdate();

            tx.commit();
        	break;
        default:
            System.out.println("Invalid option.");
            break;
    }
    
   
		
		
		
		
		

	}

	}}
