package kg.nurdin.finalbackend.dao;

import kg.nurdin.finalbackend.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CustomerDao extends JpaRepository<Customer, Long> {

    List<Customer> findAll();
}