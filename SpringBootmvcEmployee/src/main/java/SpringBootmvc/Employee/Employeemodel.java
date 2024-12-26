package SpringBootmvc.Employee;

	import lombok.AllArgsConstructor;
	import lombok.Data;
	import lombok.NoArgsConstructor;

	@Data
	@NoArgsConstructor
	@AllArgsConstructor

	public class Employeemodel {
		private int id;
		private String name;
		private long phnno;
		private String gender;
		private String doj;
		private int deptno;
		private double salary;
	}



