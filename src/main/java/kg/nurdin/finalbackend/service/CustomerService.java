package kg.nurdin.finalbackend.service;

import kg.nurdin.finalbackend.dao.CustomerDao;
import kg.nurdin.finalbackend.model.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerService {

    @Autowired
    CustomerDao customerDao;

    public List<Customer> findAll() {
        return customerDao.findAll();
    }
}
