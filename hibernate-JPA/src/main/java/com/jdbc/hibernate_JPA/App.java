package com.jdbc.hibernate_JPA;


import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        EntityManagerFactory emf =Persistence.createEntityManagerFactory("myPU");
        
        EntityManager em=emf.createEntityManager();
        EntityTransaction et=em.getTransaction();
        et.begin();
        Employee e= new Employee("Ankit",6446);
        em.persist(e);
        
        
        
        
        
        et.commit();
       
        em.close();
        
        emf.close();
        
    }
}
