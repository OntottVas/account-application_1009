package hu.progmatic.accountapplication_1009.service;

import hu.progmatic.accountapplication_1009.model.Expense;
import hu.progmatic.accountapplication_1009.repository.ExpenseRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class ExpenseService {
    private ExpenseRepository expenseRepository;

    public List<Expense> getAllExpenses() {
        return expenseRepository.findAll();
    }

    public Expense getExpenseById(Long id) throws Exception {
        return expenseRepository.findById(id).orElseThrow(() -> new Exception("Expense not found by: " + id + "id"));
    }

    public void newExpense(Expense expense) {
        expenseRepository.save(expense);
    }


}
