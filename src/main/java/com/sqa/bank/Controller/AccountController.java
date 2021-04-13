package com.sqa.bank.Controller;

import com.sqa.bank.entity.Account;
import com.sqa.bank.service.AccountService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.text.SimpleDateFormat;

@Controller
@RequestMapping
public class AccountController {

    private AccountService accountService;

    @GetMapping("/account")
    public String getAccount(Model model){
        Account account = new Account();
        model.addAttribute("account", account);
        return "addAccount";
    }

    @PostMapping("/add-account")
    public String createAccount(Model model, @ModelAttribute Account account, @RequestParam("birthday") String birthday, @RequestParam("confirm-password") String confirmPassword){

        System.out.println(birthday);
        return "index";
    }
}
