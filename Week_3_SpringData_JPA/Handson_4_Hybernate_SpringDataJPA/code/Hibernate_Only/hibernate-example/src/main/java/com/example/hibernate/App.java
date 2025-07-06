package com.example.hibernate;

import com.example.hibernate.model.Employee;
import com.example.hibernate.util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class App {
    public static void main(String[] args) {
        Employee emp = new Employee();
        emp.setName("Karthik");
        emp.setSalary(60000);

        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction tx = session.beginTransaction();

        session.persist(emp);

        tx.commit();
        session.close();

        System.out.println("Employee saved successfully");
    }
}
