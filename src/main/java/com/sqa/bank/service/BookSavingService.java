package com.sqa.bank.service;

import com.sqa.bank.entity.BookSaving;
import com.sqa.bank.repository.BookSavingRepository;
import com.sqa.bank.repository.DTO.InfoCustomerSendMoneyDTO;
import com.sqa.bank.repository.DTO.InfoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BookSavingService {
    @Autowired
    private BookSavingRepository bookSavingRepository;
    @Autowired
    private InfoRepository infoRepository;


    public List<InfoCustomerSendMoneyDTO> findCustomer(String search){
        List<InfoCustomerSendMoneyDTO> list =infoRepository.findCustomer(search);
        return list;
    }

    public BookSaving save(BookSaving bookSaving){
        return bookSavingRepository.save(bookSaving);
    }

    public BookSaving findById(int id){
        BookSaving bookSaving = bookSavingRepository.findById(id).get();
        return bookSaving;
    }
}
