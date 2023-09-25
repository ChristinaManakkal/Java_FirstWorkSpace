package in.mindcraft.HibernateDemo;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class laptop {
	@Id

	
		private int lid;
		private String make;
		
		@ManyToOne
		private Student student;
		
		//getter setter
		public Student getStudent() {
			return student;
		}
		public void setStudent(Student student) {
			this.student = student;
		}
		
		public int getLid() {
			return lid;
		}
		public void setLid(int lid) {
			this.lid = lid;
		}
		public String getMake() {
			return make;
		}
		public void setMake(String make) {
			this.make = make;
		}

	}


