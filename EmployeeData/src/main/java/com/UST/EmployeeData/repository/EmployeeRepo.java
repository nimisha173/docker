package com.UST.EmployeeData.repository;

import com.UST.EmployeeData.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepo extends JpaRepository<Employee,Integer> {
    Employee findByEmpid(String empid);

    void deleteByEmpid(String empid);
}
