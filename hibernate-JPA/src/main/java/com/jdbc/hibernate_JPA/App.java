package com.hibernate.customer_order_app;

import java.time.LocalDate;
import java.util.List;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;
import jakarta.persistence.Query;

public class App {

    public static void main(String[] args) {

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("myPU");

        EntityManager em = emf.createEntityManager();

        EntityTransaction et = em.getTransaction();

        et.begin();


// ================= CREATE =================

//        Order o = new Order("ORD101","Laptop",1,80000,LocalDate.now());
//
//        Customer c = new Customer("Ankit","ankit@gmail.com","Male",
//                9876543210L,LocalDate.now(),o);
//
//        em.persist(c);




// ================= READ =================

//        Customer c = em.find(Customer.class,1);
//        System.out.println(c);




// ================= UPDATE =================

//        Customer c = em.find(Customer.class,1);
//        c.setPhone(9999999999L);
//        em.persist(c);




// ================= DELETE =================

//        Customer c = em.find(Customer.class,1);
//        em.remove(c);




// ================= JPQL QUERY =================

//        Query q = em.createQuery("SELECT c FROM Customer c");
//
//        List<Customer> list = q.getResultList();
//
//        for(Customer c : list) {
//            System.out.println(c);
//        }




// ================= JPQL (Fetch by Email) =================

//        Query q = em.createQuery(
//                "SELECT c FROM Customer c WHERE c.email = :email");
//
//        q.setParameter("email","ankit@gmail.com");
//
//        Customer c = (Customer) q.getSingleResult();
//
//        System.out.println(c);



        et.commit();

        em.close();

        emf.close();

    }
}