package com.microservice.employee.service;

import com.microservice.employee.entity.Department;
import com.microservice.employee.entity.Employee;
import com.microservice.employee.repo.EmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service

public class EmployeeService {
    @Autowired
    EmployeeRepo empRepo;

    public List<Employee> getEmps(){
        return empRepo.findAll();

    }

    public void saveEmp(Employee emp){
        empRepo.save(emp);
    }

    public void deleteEmp(Long id){
        empRepo.deleteById(id);
    }

    public Employee getEmpById(long id){
        return empRepo.findById(id).get();
    }
}

