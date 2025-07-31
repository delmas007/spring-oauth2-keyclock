package ci.delmas.customerfrontthymeleaftapp.repository;

import ci.delmas.customerfrontthymeleaftapp.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Long> {
}
