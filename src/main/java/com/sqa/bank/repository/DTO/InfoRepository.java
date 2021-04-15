package com.sqa.bank.repository.DTO;

import com.sqa.bank.entity.BookSaving;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.data.repository.query.Param;

import java.util.List;

@EnableJpaRepositories
public interface InfoRepository extends JpaRepository<BookSaving, Integer> {

    @Query(value = "select new com.sqa.bank.repository.DTO.InfoCustomerSendMoneyDTO(b.id, a.numberAccount, c.name, b.dateSend, b.dateWithDraw, (b.amountSend), i.numberMonth, i.ratio, (b.amountSend*b.numberMonth*(i.ratio/12)/100)) \n" +
            "from Account a join BookSaving b on a.bookSaving.id = b.id \n" +
            "join Interest i on b.interest.id = i.id \n" +
            "join Customer c on c.id = a.customer.id \n" +
            "where c.name like %:search% or a.numberAccount like %:search% ", nativeQuery = false)
    public List<InfoCustomerSendMoneyDTO> findCustomer(@Param("search")String search);
}
