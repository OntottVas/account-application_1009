package hu.progmatic.accountapplication_1009.controller;

import hu.progmatic.accountapplication_1009.model.Expense;
import hu.progmatic.accountapplication_1009.service.ExpenseService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
@AllArgsConstructor
public class ExpenseController {
    private ExpenseService expenseService;

    @GetMapping("/expenses")
    public String getAllExpenses(Model model) {
        model.addAttribute("expenses", expenseService.getAllExpenses());
        return "expense/expenses";
    }

    @GetMapping("/addExpense")
    public String newExpense(Model model) {
        model.addAttribute("newExpense", new Expense());
        return "expense/addExpense";
    }

    @PostMapping("/addExpense")
    public String newExpense(@ModelAttribute("newExpense") Expense expense) {
        expenseService.newExpense(expense);
        return "redirect:/expenses";
    }

    @GetMapping("/biggestSpender")
    public String findMostSpender(Model model) {
        model.addAttribute("spender", expenseService.findBiggestSpender());
        return "expense/biggestSpender";
    }
}
