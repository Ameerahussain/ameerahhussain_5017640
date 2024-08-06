package com.libraries;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.library.service.BookService;

public class LibraryManagementApp {

    public static void main(String[] args) {
        // Load the Spring context
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        
        // Retrieve the BookService bean
        BookService bookService = context.getBean(BookService.class);

        // Call a method to trigger the AOP logging
        System.out.println("Calling a method on BookService");
        bookService.someMethod();

        // Test the bean
        System.out.println("BookService bean: " + bookService);
    }
}
