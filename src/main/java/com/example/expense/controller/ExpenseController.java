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
    private ItemService itemService;

    @GetMapping
    public List<Item> getAllItems() {
        return itemService.getAllItems();
    }

    @GetMapping("/{id}")
    public Optional<Item> getItemById(@PathVariable Long id) {
        return itemService.getItemById(id);
    }

    @GetMapping("/category/{category}")
    public List<Item> getItemsByCategory(@PathVariable String category) {
        return itemService.getItemsByCategory(category);
    }

    @PostMapping
    public Item createItem(@RequestBody Item item) {
        return itemService.saveItem(item);
    }

    @DeleteMapping("/{id}")
    public void deleteItem(@PathVariable Long id) {
        itemService.deleteItem(id);
    }
}

// package com.example.expense.controller;

// import com.example.expense.model.Item;
// import com.example.expense.service.ExpenseService;
// import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.web.bind.annotation.*;

// @RestController
// @RequestMapping("/Expense")
// public class ExpenseController {
//     private final ExpenseService expenseService;

//     @Autowired
//     public ExpenseController(ExpenseService expenseService) {
//         this.expenseService = expenseService;
//     }

//     @PostMapping("/add")
//     public void addExpense(@RequestBody Item item) {

//     }

//     @DeleteMapping("/remove")
//     public void removeItem(@RequestBody Item item) {
//     }

//     @PostMapping("/borrow")
//     public void borrowItem(@RequestBody Item item) {
//     }

//     @PostMapping("/return")
//     public void returnItem(@RequestBody Item item) {
//     }
// }
