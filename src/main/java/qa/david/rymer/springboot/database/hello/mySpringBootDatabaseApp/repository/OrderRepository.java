package qa.david.rymer.springboot.database.hello.mySpringBootDatabaseApp.repository;


import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


import qa.david.rymer.springboot.database.hello.mySpringBootDatabaseApp.model.Order;
@Repository
public interface OrderRepository extends JpaRepository<Order, Long> {
	
	Page<Order> findByPersonId(Long personId, Pageable pageable);

	
}
