package hu.progmatic.accountapplication_1009.repository;

import hu.progmatic.accountapplication_1009.model.Expense;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ExpenseRepository extends JpaRepository<Expense, Long> {
}
