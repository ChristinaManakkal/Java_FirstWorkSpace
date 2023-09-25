import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

class Student
		{
			private int rollno;
			private String name;
			private double percentage;
			private Set<String> skillset;

			// methods of Student class
			public Student() {
				skillset=new HashSet<>();
			}
			
			public Student(int rollno, String name, double percentage, Set<String> skillset) {
				this.rollno=rollno;
				this.name=name;
				this.percentage=percentage;
				this.skillset=skillset;
			}

			//getters and setters of rollno,name,percentage and skillset
			public int getRollno() {
				return rollno;
			}

			public void setRollno(int rollno) {
				this.rollno = rollno;
			}

			public String getName() {
				return name;
			}

			public void setName(String name) {
				this.name = name;
			}

			public double getPercentage() {
				return percentage;
			}

			public void setPercentage(double percentage) {
				this.percentage = percentage;
			}

			public Set<String> getSkillset() {
				return skillset;
			}

			public void setSkillset(Set<String> skillset) {
				this.skillset = skillset;
			}
			
			
			
		}


class UtilityList {
    private List<Student> list;

    public List<Student> getList() {
		return list;
	}

	public void setList(List<Student> list) {
		this.list = list;
	}

	public UtilityList() {
        list = new ArrayList<>();
    }

    public void createList() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of students: ");
        int numStudents = scanner.nextInt();
        scanner.nextLine();  // Consume newline
        for (int i = 0; i < numStudents; i++) {
            System.out.println("Enter details for student " + (i + 1) + ":");
            System.out.print("Roll No: ");
            int rollno = scanner.nextInt();
            scanner.nextLine();  // Consume newline
            System.out.print("Name: ");
            String name = scanner.nextLine();
            System.out.print("Percentage: ");
            double percentage = scanner.nextDouble();
            scanner.nextLine();  // Consume newline
            System.out.print("Enter skillset (comma-separated): ");
            String[] skills = scanner.nextLine().split(",");
            Set<String> skillset = new HashSet<>(Arrays.asList(skills));

            Student student = new Student(rollno, name, percentage, skillset);
            list.add(student);
        }
    }

    public void printList() {
        System.out.println("List of Students:");
        for (Student student : list) {
            System.out.println("Roll No: " + student.getRollno());
            System.out.println("Name: " + student.getName());
            System.out.println("Percentage: " + student.getPercentage());
            System.out.println("Skillset: " + student.getSkillset());
            System.out.println();
        }
    }
}

class UtilityReport {
    private Map<String, Double> m;

    public UtilityReport(List<Student> students) {
        m = new HashMap<>();
        for (Student student : students) {
            m.put(student.getName(), student.getPercentage());
        }
    }

    public void showReport() {
        System.out.println("Student Report:");
        for (Map.Entry<String, Double> entry : m.entrySet()) {
            System.out.println(entry.getKey() + "-->" + entry.getValue());
        }
    }
}


public class Tester {

	public static void main(String[] args) {
		UtilityList utilityList = new UtilityList();
        utilityList.createList();
        utilityList.printList();

        UtilityReport utilityReport = new UtilityReport(utilityList.getList());
        utilityReport.showReport();

	}

}
