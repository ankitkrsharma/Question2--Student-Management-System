package com.hibernate.customer_order_app.dao;

import com.hibernate.customer_order_app.entity.Order;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class OrderDAOImpl {

    EntityManagerFactory emf =
            Persistence.createEntityManagerFactory("myPU");

    EntityManager em = emf.createEntityManager();


    // FETCH ORDER BY ID
    public Order getOrderById(int id) {

        return em.find(Order.class, id);
    }


    // UPDATE ORDER
    public void updateOrder(Order order) {

        em.getTransaction().begin();

        em.merge(order);

        em.getTransaction().commit();
    }

}