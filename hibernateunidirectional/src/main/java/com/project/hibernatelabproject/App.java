package com.project.hibernatelabproject;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App //main class
{
    public static void main( String[] args ) //main method
    {
    	System.out.println( "Project Started" );
        Configuration cfg=new Configuration();
        cfg.configure("hibernatelab.cfg.xml");
        
        //creating the session factory
        SessionFactory factory=cfg.buildSessionFactory();
        //System.out.println(factory.isClosed());
        
        //creating the object of student entity and setting its values
        Customer c1=new Customer(); 
        c1.setCid(101);
        c1.setCname("Ravi Desai");
        c1.setAge(20);
        c1.setCity("Pune");
        c1.setContactno("9876543210");
        
        Customer c2=new Customer();
        c2.setCid(102);
        c2.setCname("Nisha Verma");
        c2.setAge(22);
        c2.setCity("Ahmednagar");
        c2.setContactno("8976543291");
        
        //creating the object of product entity and setting its values
        Product p1=new Product();
        p1.setPid(201);
        p1.setPname("Handbag");
        p1.setPrice(2000);
        p1.setDateOfManufacture("2022-12-12");
        
        Product p2=new Product();
        p2.setPid(202);
        p2.setPname("Shoes");
        p2.setPrice(2300);
        p2.setDateOfManufacture("2023-3-23");
        
        //passing the object of product in customer
        c1.setProd(p1);
        c2.setProd(p2);
        
        //opening the session
        Session session=factory.openSession();
        
        //starting the transaction
        Transaction tx=session.beginTransaction();
        session.save(c1); //saving the customer object c1
        session.save(c2); //saving the customer object c2
        session.save(p1); //saving the product object p1
        session.save(p2); //saving the product object p2
        tx.commit();
        
        session.close(); //closing the session
        factory.close(); //closing the factory
    }
}
