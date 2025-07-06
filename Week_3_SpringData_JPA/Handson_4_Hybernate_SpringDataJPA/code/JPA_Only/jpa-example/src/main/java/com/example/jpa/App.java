package com.example.jpa;

import com.example.jpa.model.Employee;
import jakarta.persistence.*;

public class App {
    public static void main(String[] args) {

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("jpa-unit");
        EntityManager em = emf.createEntityManager();

        Employee emp = new Employee();
        emp.setName("JPA Only");
        emp.setSalary(75000);

        EntityTransaction tx = em.getTransaction();
        tx.begin();

        em.persist(emp);

        tx.commit();
        em.close();
        emf.close();

        System.out.println("Employee inserted using pure JPA!");
    }
}
