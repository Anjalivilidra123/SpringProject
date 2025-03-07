package SpringBootmvc.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor

@Entity

public class Employeeentity {
	@Id
	@GeneratedValue(strategy =GenerationType.AUTO )
	
	private int id;
	private String name;
	private long phnno;
	private String gender;
	private String doj;
	private int deptno;
	private double salary;
	private double dra;
	private String hra;
	private String totalsalary;
}
