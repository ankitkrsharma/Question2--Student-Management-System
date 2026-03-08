package com.hibernate.customer_order_app.app;

import java.time.LocalDate;
import java.util.List;

import com.hibernate.customer_order_app.dao.CustomerDAOImpl;
import com.hibernate.customer_order_app.dao.OrderDAOImpl;
import com.hibernate.customer_order_app.entity.Customer;
import com.hibernate.customer_order_app.entity.Order;

public class App {

	public static void main(String[] args) {

		CustomerDAOImpl customerDAO = new CustomerDAOImpl();
		OrderDAOImpl orderDAO = new OrderDAOImpl();

// INSERT //

		
		
		
		
//		Order o = new Order("ORD101", "Laptop", 1, 80000, LocalDate.now());
//
//		Customer c = new Customer("Ankit", "ankit@gmail.com", "Male", 9876543210L, LocalDate.now(), o);
//
//		customerDAO.insertCustomer(c);
		
		
		
		
		

// FETCH BY ID
		
		
		
		

//     Customer customer = customerDAO.getCustomerById(1);
//     System.out.println(customer);
		
		
		
		

//  FETCH ALL 

		
		
		
		
//        List<Customer> list = customerDAO.getAllCustomers();
//
//        for(Customer cus : list)
//            System.out.println(cus);
		
		
		
		

//  UPDATE CUSTOMER 
		
		
		
		

//        Customer customer = customerDAO.getCustomerById(1);
//        customer.setPhone(9999999999L);
//
//        customerDAO.updateCustomer(customer);
		
		
		
		
		

//  DELETE CUSTOMER 
		
		
		

//        customerDAO.deleteCustomer(1);
		
		
		

//  UPDATE ORDER 
		
		
		
		

//        Order order = orderDAO.getOrderById(1);
//
//        order.setPrice(75000);
//
//        orderDAO.updateOrder(order);
		
		
		

//  JPQL FETCH BY EMAIL 

        Customer cus = customerDAO.getCustomerByEmail("ankit@gmail.com");

        System.out.println(cus);

	}
}