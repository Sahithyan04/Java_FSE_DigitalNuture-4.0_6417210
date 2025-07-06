package com.example.springdata;

import com.example.springdata.model.Employee;
import com.example.springdata.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class App implements CommandLineRunner {

    @Autowired
    private EmployeeService employeeService;

    public static void main(String[] args) {
        SpringApplication.run(App.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        Employee emp = new Employee();
        emp.setName("Spring Data Kutty");
        emp.setSalary(88000);
        employeeService.addEmployee(emp);
        System.out.println("Saved via Spring Data JPA!");
    }
}
