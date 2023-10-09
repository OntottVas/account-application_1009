package hu.progmatic.accountapplication_1009.service;

import hu.progmatic.accountapplication_1009.repository.ExpenseRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class ExpenseService {
    private ExpenseRepository expenseRepository;
}
