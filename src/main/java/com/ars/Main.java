package com.ars;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {


    public static void main(String[] args) {


        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");


        BookDAO bookDAO = (BookDAO)context.getBean("bookDAO");

        Book b1 = new Book(1, "Learn Java", 500);
        Book b2 = new Book(2, "Learn Hibernate", 400);
        Book b3 = new Book(3, "Learn Spring", 600);

        bookDAO.saveBookRecord(b1);
        bookDAO.saveBookRecord(b2);
        bookDAO.saveBookRecord(b3);

        System.out.println("Database transaction complete.");

        ((ClassPathXmlApplicationContext)context).close();

    }
}