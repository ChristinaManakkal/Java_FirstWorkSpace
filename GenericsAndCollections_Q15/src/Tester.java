import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

class Employee<G>{
	private int id;
	private String name;
	private double salary;
	
	//default constructor
	public void Employee() {	
	}

	public Employee(int id, String name, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	public void show() {
		System.out.println(id+ " " +name+ " "+ salary);
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}
	
	
	
	
	
	
		
}
public class Tester {

	public static void main(String[] args) {
		
		
		ArrayList<Employee> employeeList = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Menu:");
            System.out.println("1. Insert Record");
            System.out.println("2. Update Information");
            System.out.println("3. Display All Records");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter Employee ID: ");
                    int id = scanner.nextInt();
                    System.out.print("Enter Employee Name: ");
                    scanner.nextLine(); // Consume the newline character
                    String name = scanner.nextLine();
                    System.out.print("Enter Salary: ");
                    double salary = scanner.nextDouble();
                    Employee newEmployee = new Employee(id, name,salary);
                    employeeList.add(newEmployee);
                    break;

                case 2:
                    System.out.print("Enter Employee ID to update information: ");
                    int updateid = scanner.nextInt();
                    boolean found = false;

                    for (Employee employee : employeeList) {
                        if (employee.getId() == updateid) {
                            System.out.print("Enter new Salary: ");
                            double newSalary = scanner.nextDouble();
                            employeeList.remove(employee);
                            employeeList.add(new Employee(employee.getId(), employee.getName(), newSalary));
                            found = true;
                            break;
                        }
                    }

                    if (!found) {
                        System.out.println("Employee with ID " + updateid + " not found.");
                    }
                    break;

                case 3:
                    System.out.println("Employee Records:");
                    for (Employee employee : employeeList) {
                        System.out.println(employee);
                    }
                    break;

                case 4:
                    scanner.close();
                    System.exit(0);

                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        }
    
}
}