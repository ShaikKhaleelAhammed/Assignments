package com.microservice.employee.controller;


import com.microservice.employee.entity.Employee;
import com.microservice.employee.service.EmployeeService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class EmployeeController {

     @Autowired
    private EmployeeService empService;

     @GetMapping("/docs")
     public String printUsage(){
         return "/emps for listing and entering employees (get and post) endpoint \n /udpate/emp/{id} to update employees \n /delete/emp/{id} to delete employees";
     }
     @GetMapping("/emps")
    public List<Employee> listEmployees(){
         return empService.getEmps();

     }

     @PostMapping("/emps")
    public void addEmp(@Valid @RequestBody Employee emp){
         empService.saveEmp(emp);
     }
     @PutMapping("/update/emp/{id}")
    public void updateEmp(@Valid @RequestBody Employee emp,@PathVariable("id") long id){
         Employee oldEmp = empService.getEmpById(id);
         oldEmp.setName(emp.getName());
         oldEmp.setSalary(emp.getSalary());
         empService.saveEmp(oldEmp);
     }

     @DeleteMapping("/delete/emp/{id}")
    public void deleteEmp(@PathVariable("id") long id){
         empService.deleteEmp(id);
     }




}
