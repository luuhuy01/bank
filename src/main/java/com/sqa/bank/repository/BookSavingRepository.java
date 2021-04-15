package com.sqa.bank.repository;

import com.sqa.bank.entity.BookSaving;
import com.sqa.bank.repository.DTO.InfoCustomerSendMoneyDTO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BookSavingRepository extends JpaRepository<BookSaving, Integer> {

//    @Query(value = "select new InfoCustomerSendMoneyDTO(b.id, a.numberAccount, c.name, b.dateSend, b.dateWithDraw, b.amountSend, i.ratio, (b.amountSend*i.ratio/100)) \n" +
//            "from Account a join BookSaving b on a.bookSaving.id = b.id \n" +
//            "join Interest i on b.interest.id = i.id \n" +
//            "join Customer c on c.id = a.customer.id \n" +
//            "where c.name like %:search% or a.numberAccount like %:search% ")
//    public List<InfoCustomerSendMoneyDTO> findCustomer(@Param("search")String search);


}
