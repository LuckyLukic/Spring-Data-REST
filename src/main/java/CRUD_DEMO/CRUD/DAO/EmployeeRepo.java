package CRUD_DEMO.CRUD.DAO;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import CRUD_DEMO.CRUD.Employee;

//@RepositoryRestResource(path="members") If I want to use members as endpoint instead of employees
public interface EmployeeRepo extends JpaRepository<Employee, Integer>{

}
