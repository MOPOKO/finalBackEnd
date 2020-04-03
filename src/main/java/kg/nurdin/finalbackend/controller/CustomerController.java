package kg.nurdin.finalbackend.controller;

import kg.nurdin.finalbackend.model.Customer;
import kg.nurdin.finalbackend.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.validation.Valid;
import java.util.List;

@Controller
public class CustomerController {

    @Autowired
    private CustomerService customerService;

    @GetMapping("/customers")
    public String customers (Model model) {
        List<Customer> customers = customerService.findAll();
        boolean isEmpty = customers.isEmpty();

        model.addAttribute("customers", customers);
        model.addAttribute("isEmpty", isEmpty);
        return "customers";
    }

    @GetMapping("/customers/add")
    public String addCustomer (Model model) {
        Customer customer = new Customer();
        model.addAttribute("customer", customer);
        return "customerForm";
    }

    @PostMapping(value = "/customers/create")
    public String addOrganization(@Valid @ModelAttribute("customer") Customer customer,
                                  BindingResult result, Model model) {
        if (result.hasErrors()) {
            return "organizationForm";
        }
        customerService.create(customer);
        return "redirect:/customers";
    }

    @GetMapping("customers/delete/{id}")
    public String deleteOrganization(@PathVariable("id") Long id, RedirectAttributes redirectAttributes) {
        customerService.deleteByID(id);
        return "redirect:/customers";
    }

}
