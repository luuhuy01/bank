package com.sqa.bank.Controller;

import com.sqa.bank.entity.Account;
import com.sqa.bank.entity.Customer;
import com.sqa.bank.service.AccountService;
import com.sqa.bank.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.Date;

@Controller
@RequestMapping
public class AccountController {

    @Autowired
    private AccountService accountService;

    @Autowired
    private CustomerService customerService;

    @GetMapping("/account")
    public String getAccount(Model model){
        Account account = new Account();
        int code = (int) Math.floor(((Math.random() * 899999) + 100000));
        account.setNumberAccount(code);
        model.addAttribute("account", account);
        return "addAccount";
    }

    @PostMapping("/add-account")
    public String createAccount(Model model, @ModelAttribute Account account, @RequestParam("birthday") String birthday, @RequestParam("confirm-password") String confirmPassword) throws ParseException {
        Account accountPost = (Account) model.getAttribute("account");
        Customer customer = new Customer();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date  date = new Date();
        Date birthdayFormat = sdf.parse(birthday);
//        customer.setBirthday(birthdayFormat);
        accountPost.getCustomer().setBirthday(birthdayFormat);
        accountPost.setDateCreate(date);
        int idCustomer = customerService.save(accountPost.getCustomer()).getId();
//        System.out.println(accountPost.getNumberAccount());
        customer.setId(idCustomer);
        accountPost.setCustomer(customer);
        accountService.save(accountPost);
        return "index";
    }
}
