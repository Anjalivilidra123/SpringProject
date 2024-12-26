package Employeeservice;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Employeerepository.Employeerepository;
import SpringBootmvc.Employee.Employeemodel;
import SpringBootmvc.Entity.Employeeentity;

@Service
public class Employeeservice {
	@Autowired
		Employeerepository employeerepository;
		
		public void saveemployeedetails (Employeemodel employeemodel) {
			double da;
			da=employeemodel.getSalary()*0.1;
			double hra;
			hra=employeemodel.getSalary()*0.9;
			double totalsalary;
			totalsalary=employeemodel.getSalary()+da+hra;
			Employeeentity employeeentity=new Employeeentity();
			employeeentity.setName(employeemodel.getName());
			employeeentity.setPhnno(employeemodel.getPhnno());
			employeeentity.setGender(employeemodel.getGender());
			employeeentity.setDoj(employeemodel.getDoj());
			employeeentity.setDeptno(employeemodel.getDeptno());
			employeeentity.setSalary(employeemodel.getSalary());
			employeeentity.setDra(da);
			employeeentity.setHra(hra);
			employeeentity.setTotalsalary(totalsalary);
		employeerepository.save(employeeentity);
		}
		public List<Employeeentity> getallemployeedetalis(){
			List<Employeeentity>employee=employeerepository.findAll();
			return employee;
			
		}
		public Employeeentity searchbyid(int id) {
			Optional<Employeeentity>optionaldata=employeerepository.findById(id);
			if(optionaldata.isPresent()) {
				Employeeentity employee = optionaldata.get();
				return employee; 
			}
			else
			{
				return null;
			}
		}
		public void deleteemployeebyid(int id) {
			employeerepository.deleteById(id);
		
			
		}	


	public static List<Employeeentity> getallemployeedetails() {
		// TODO Auto-generated method stub
		return null;
	}

	
	
}
