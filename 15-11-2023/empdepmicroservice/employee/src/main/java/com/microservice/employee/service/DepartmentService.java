package com.microservice.employee.service;

import com.microservice.employee.entity.Department;
import com.microservice.employee.entity.Employee;
import com.microservice.employee.repo.DepartmentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class DepartmentService {


    @Autowired
    DepartmentRepo deptRepo;

    public List<Department> getDepts(){
        return deptRepo.findAll();

    }

    public void saveDept(Department dept){
        deptRepo.save(dept);
    }

    public void deleteDept(Long id){
        deptRepo.deleteById(id);
    }
    public Department getDeptById(long id){
        return deptRepo.findById(id).get();
    }
}
