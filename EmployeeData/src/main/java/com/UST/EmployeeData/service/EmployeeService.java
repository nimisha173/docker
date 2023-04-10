package com.UST.EmployeeData.service;

import com.UST.EmployeeData.model.Employee;
import com.UST.EmployeeData.repository.EmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
@Service
public class EmployeeService {
    @Autowired
    private EmployeeRepo repo;
    public Employee CreateEmployee(Employee employee) {
        return repo.save(employee);
    }

    public List<Employee> getEmployees() {
        return repo.findAll();
    }

    public Employee getEmployeeById(String empid) {
        return repo.findByEmpid(empid);
    }
@Transactional
    public String deleteEmployeeById(String empid) {
        repo.deleteByEmpid(empid);
        return "the employee information is deleted";
    }
}
