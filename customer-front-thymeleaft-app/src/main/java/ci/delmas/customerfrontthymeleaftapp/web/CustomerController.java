package ci.delmas.customerfrontthymeleaftapp.web;

import ci.delmas.customerfrontthymeleaftapp.model.Customer;
import ci.delmas.customerfrontthymeleaftapp.repository.CustomerRepository;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class CustomerController {
    private final CustomerRepository customerRepository;

    public CustomerController(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    @GetMapping("/")
    public String index() {
        return "index";
    }

    @GetMapping("/auth")
    @ResponseBody
    public Authentication authentication(Authentication authentication) {
        return authentication;
    }


    @GetMapping("/customers")
    public String customers(Model model) {
        List<Customer> customerList = customerRepository.findAll();
        model.addAttribute("customers", customerList);
        return "customers";
    }
}
