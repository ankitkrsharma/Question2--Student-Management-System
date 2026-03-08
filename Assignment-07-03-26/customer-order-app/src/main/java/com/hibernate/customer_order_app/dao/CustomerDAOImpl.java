package com.hibernate.customer_order_app.dao;

import java.util.List;

import com.hibernate.customer_order_app.entity.Customer;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import jakarta.persistence.Query;

public class CustomerDAOImpl {

    EntityManagerFactory emf =
            Persistence.createEntityManagerFactory("myPU");

    EntityManager em = emf.createEntityManager();


    // INSERT
    public void insertCustomer(Customer customer) {

        em.getTransaction().begin();

        em.persist(customer);

        em.getTransaction().commit();
    }


    // FETCH CUSTOMER BY ID
    public Customer getCustomerById(int id) {

        return em.find(Customer.class, id);
    }


    // FETCH ALL CUSTOMERS
    public List<Customer> getAllCustomers() {

        Query q = em.createQuery("SELECT c FROM Customer c");

        return q.getResultList();
    }


    // UPDATE CUSTOMER
    public void updateCustomer(Customer customer) {

        em.getTransaction().begin();

        em.merge(customer);

        em.getTransaction().commit();
    }


    // DELETE CUSTOMER
    public void deleteCustomer(int id) {

        em.getTransaction().begin();

        Customer c = em.find(Customer.class, id);

        if(c != null)
            em.remove(c);

        em.getTransaction().commit();
    }


    // JPQL QUERY (FETCH BY EMAIL)
    public Customer getCustomerByEmail(String email) {

        Query q = em.createQuery(
                "SELECT c FROM Customer c WHERE c.email = :email");

        q.setParameter("email", email);

        return (Customer) q.getSingleResult();
    }

}