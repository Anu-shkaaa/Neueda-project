package com.example.expense.controller;

import com.example.expense.model.Item;
import com.example.expense.service.ExpenseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/expenses")
public class ExpenseController {

    @Autowired
    private ExpenseService expenseService;

    @GetMapping
    public List<Item> getAllItems() {
        return expenseService.getAllItems();
    }

    @GetMapping("/{id}")
    public Optional<Item> getItemById(@PathVariable Long id) {
        return expenseService.getItemById(id);
    }

    @GetMapping("/category/{category}")
    public List<Item> getItemsByCategory(@PathVariable String category) {
        return expenseService.getItemsByCategory(category);
    }

    @PostMapping
    public Item createItem(@RequestBody Item item) {
        return expenseService.saveItem(item);
    }

    @DeleteMapping("/{id}")
    public void deleteItem(@PathVariable Long id) {
        expenseService.deleteItem(id);
    }
}
