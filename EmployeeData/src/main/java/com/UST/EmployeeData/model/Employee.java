package com.UST.EmployeeData.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;



import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Employee {
        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
        private int id;
        private String empid;
        private String empname;
        private String designation;
        private String empHr;
}
