package Employeerepository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import SpringBootmvc.Entity.Employeeentity;

@Repository
public interface Employeerepository extends JpaRepository<Employeeentity, Integer> {



}
