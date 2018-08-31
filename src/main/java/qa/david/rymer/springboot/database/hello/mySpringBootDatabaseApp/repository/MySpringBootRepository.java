package qa.david.rymer.springboot.database.hello.mySpringBootDatabaseApp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import qa.david.rymer.springboot.database.hello.mySpringBootDatabaseApp.model.MySpringBootDataModel;

@Repository
public interface MySpringBootRepository extends JpaRepository<MySpringBootDataModel,Long> {
}
