package com.UST.EmployeeData.controller;

import com.UST.EmployeeData.model.Employee;
import com.UST.EmployeeData.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping
public class employeecontroller {
    @Autowired
    private EmployeeService employeeService;

    @PostMapping("/addemps")
    public Employee addEmployee(@RequestBody Employee employee) {
        return employeeService.CreateEmployee(employee);
    }

    @GetMapping("/employees")
    public List<Employee> getAllEmployee() {
        return employeeService.getEmployees();
    }

    @GetMapping("/employees/{empid}")
    public Employee getEmployeeById(@PathVariable String empid) {
        return employeeService.getEmployeeById(empid);
    }

    @DeleteMapping("/deleteemployee/{empid}")
    public String deleteEmployee(@PathVariable String empid) {
        return employeeService.deleteEmployeeById(empid);
    }
}
