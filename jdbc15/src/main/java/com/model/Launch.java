package com.model;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Launch {
	public static void main(String[] args) {
		Configuration cfg=new Configuration();
		cfg.configure();
		cfg.addAnnotatedClass(Student.class);
		SessionFactory sf=cfg.buildSessionFactory();
		Session s=sf.openSession();
		
		
		
		
		
		
		
//		Student student=new Student(3, "Gopu", "Gopu@333");
//		Student student1=new Student(4, "Motu", "Ankit@333");
//		Student student2=new Student(5, "chandu", "Ankit@333");
//		Student student3=new Student(6, "sonu", "Ankit@333");
//		
		
		
		
		Student st = s.get(Student.class, 2);
		
		
		Transaction t=s.beginTransaction();
		
		st.setEmail("sub@324");
	
		
		
		t.commit();
		
	}

}
