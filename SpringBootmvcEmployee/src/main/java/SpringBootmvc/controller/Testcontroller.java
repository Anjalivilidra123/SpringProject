package SpringBootmvc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import Employeeservice.Employeeservice;
import SpringBootmvc.Employee.Employeemodel;
import SpringBootmvc.Entity.Employeeentity;
@Controller
public class Testcontroller {
	@Autowired
	Employeeservice employeeservice;
	
	@GetMapping("/Employeeform")
	  public String getEmployeeForm()
	  {
		  return "add-emp";
	  }
	  
	  // to send employee data 
	  @PostMapping("/submitemployee")
	  public String sendEmployee(Employeemodel employee)
	  {
		  System.out.println(employee);
		  return "done";
	  }
	  @GetMapping("/getallemployeedetails")
	  public String getallemployeedetails(Model model) {
	  	List<Employeeentity>employee=Employeeservice.getallemployeedetails();
	  	model.addAttribute("Employee",employee);
	  	return "employee-list";
	  }
	  @GetMapping("/searchform")
	  public String getearchform(){
	  	return "search-employee";
	  }
	  @PostMapping("/searchbyid")
	  public String searchbyid(@RequestParam long id,Model model) {
	  	Employeeentity employee = Employeeservice.searchbyid(id);
	  	model.addAttribute( "Employee",employee);
	  	return "search-employee";
	  	
	  }
	  @GetMapping("/delete/{id}")
	  public String deleteemployeebyid(@PathVariable long id) {
	  	Employeeservice.deleteemployeebyid(id);
	  	return "redirect:/getallemployeedetails";
	  }
	  }