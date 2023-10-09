package hu.progmatic.accountapplication_1009.repository;

import hu.progmatic.accountapplication_1009.model.Expense;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface ExpenseRepository extends JpaRepository<Expense, Long> {

    @Query(nativeQuery = true, value = """
            SELECT name FROM owner o
            JOIN expense e ON o.id = e.owner_id
            GROUP BY name
            ORDER BY SUM(cost) LIMIT 1""")
    String findBiggestSpender();
}
