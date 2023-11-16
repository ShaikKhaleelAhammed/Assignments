package com.microservice.employee.entity;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jdk.jfr.Enabled;

@Entity
@Table(name="deptms")
public class Department {


    @Id
    private long deptid;

    @Column
    private String deptname;

    public Department(long deptid, String deptname) {
        this.deptid = deptid;
        this.deptname = deptname;
    }

    public long getDeptid() {
        return deptid;
    }

    public void setDeptid(long deptid) {
        this.deptid = deptid;
    }

    public String getDeptname() {
        return deptname;
    }

    public void setDeptname(String deptname) {
        this.deptname = deptname;
    }

    public Department() {
    }
}
