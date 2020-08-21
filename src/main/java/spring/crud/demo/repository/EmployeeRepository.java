package spring.crud.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import spring.crud.demo.model.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee,Long> {
}
