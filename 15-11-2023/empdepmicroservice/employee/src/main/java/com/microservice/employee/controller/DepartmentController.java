package com.microservice.employee.controller;


import com.microservice.employee.entity.Department;
import com.microservice.employee.service.DepartmentService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class DepartmentController {
    @Autowired
    private DepartmentService deptService;

    @GetMapping("/depts")
    public List<Department> listDepts(){
        return deptService.getDepts();

    }

    @PostMapping("/depts")
    public void addDept(@Valid @RequestBody Department dept){
        deptService.saveDept(dept);
    }
    @PutMapping("/update/dept/{id}")
    public void updateDept(@Valid @RequestBody Department dept,@PathVariable("id") long id){
        Department oldDept = deptService.getDeptById(id);
        oldDept.setDeptname(dept.getDeptname());
        deptService.saveDept(oldDept);
    }

    @DeleteMapping("/delete/dept/{id}")
    public void deleteDept(@PathVariable("id") long id){
        deptService.deleteDept(id);
    }
}
