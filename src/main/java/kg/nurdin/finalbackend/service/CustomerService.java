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

    public Customer create(Customer customer) {
        Customer customer1 = new Customer();
        customer1.setFirstName(customer.getFirstName());
        customer1.setLastName(customer.getLastName());
        customer1.setEmailAddress(customer.getEmailAddress());
        customer1.setJobTitle(customer.getJobTitle());
        customer1.setMobilePhone(customer.getMobilePhone());
        customer1.setCity(customer.getCity());
        customer1.setWebPage(customer.getWebPage());

        return customerDao.save(customer);
    }

    public void deleteByID(Long id) {
        System.out.println("Customer with " + id + " id was deleted");
        customerDao.deleteById(id);
    }
}
