package com.sqa.bank.Controller;

import com.sqa.bank.entity.BookSaving;
import com.sqa.bank.repository.DTO.InfoCustomerSendMoneyDTO;
import com.sqa.bank.service.BookSavingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.thymeleaf.util.StringUtils;

import java.util.Date;
import java.util.List;

@Controller
@RequestMapping
public class BookSavingController {
    @Autowired
    private BookSavingService bookSavingService;

    @GetMapping("/withdraw-saving")
    public String getViewWithDraw(){
        return "withDrawBookSaving";
    }

    @GetMapping("/get-customer-has-booksaving")
    public String findCustomer(Model model, @RequestParam("input-search")String inputSearch){
        List<InfoCustomerSendMoneyDTO> icsm = bookSavingService.findCustomer(inputSearch);
        model.addAttribute("listCustomers", icsm);
        return "withDrawBookSaving";
    }

    //cập nhật ngày rút
    @GetMapping("/with-draw/{id}")
    public String updateWithDraw(@PathVariable("id")int id){
        BookSaving bookSaving = bookSavingService.findById(id);
        Date date = new Date();
        bookSaving.setDateWithDraw(date);
        bookSavingService.save(bookSaving);
        return "redirect:/withdraw-saving";
    }
}
