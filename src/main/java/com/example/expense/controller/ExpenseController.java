package com.example.expense.controller;

import com.example.expense.model.Item;
import com.example.expense.service.ExpenseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/Expense")
public class ExpenseController {
    private final ExpenseService expenseService;

    @Autowired
    public ExpenseController(ExpenseService expenseService) {
        this.expenseService = expenseService;
    }

    @PostMapping("/add")
    public void addExpense(@RequestBody Item item) {

    }

    @DeleteMapping("/remove")
    public void removeItem(@RequestBody Item item) {
    }

    @PostMapping("/borrow")
    public void borrowItem(@RequestBody Item item) {
    }

    @PostMapping("/return")
    public void returnItem(@RequestBody Item item) {
    }
}
