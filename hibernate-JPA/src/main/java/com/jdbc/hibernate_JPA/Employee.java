package com.jdbc.hibernate_JPA;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="employee")
public class Employee {
	//Primary Key
	
	
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
      
    
    //Columns
    @Column
    private int id;
    
    @Column
    private String name;
    
    
    @Column
    private double salary;
    
    
    
    //Empty Constructor
    public Employee() {
    	
    	
    	
    }
    
    
    //Parameterised  Constructor
    public Employee (String name, double salary) {
       super();
        this.name = name;
        this.salary = salary;
    }
    
    
    
    // Getters Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    //to string overriding
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}
    
    
}
