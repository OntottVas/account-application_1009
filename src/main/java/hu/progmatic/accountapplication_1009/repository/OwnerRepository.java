package hu.progmatic.accountapplication_1009.repository;

import hu.progmatic.accountapplication_1009.model.Owner;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OwnerRepository extends JpaRepository<Owner, Long> {
}
