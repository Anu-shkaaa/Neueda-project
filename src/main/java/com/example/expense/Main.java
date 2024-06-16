package com.example.expense;

import com.example.expense.service.ExpenseService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Main {

    @Bean
    public CommandLineRunner demo(ExpenseService expenseService) {
        return (args) -> {
            
        };
    }
}
