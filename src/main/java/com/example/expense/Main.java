package com.example.expense;

import com.example.expense.service.ExpenseService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Main {

    public static void main(String[] args) {
        SpringApplication.run(Main.class, args);
    }

    @Bean
    public CommandLineRunner demo(ExpenseService expenseService) {
        return (args) -> {
            // Add initialization code here if needed
        };
    }
}

// package com.example.expense;

// import com.example.expense.service.ExpenseService;
// import org.springframework.boot.CommandLineRunner;
// import org.springframework.context.annotation.Bean;
// import org.springframework.context.annotation.Configuration;

// @Configuration
// public class Main {

//     @Bean
//     public CommandLineRunner demo(ExpenseService expenseService) {
//         return (args) -> {
            
//         };
//     }
// }

