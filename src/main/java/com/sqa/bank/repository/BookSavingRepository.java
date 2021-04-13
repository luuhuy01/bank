package com.sqa.bank.repository;

import com.sqa.bank.entity.BookSaving;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookSavingRepository extends JpaRepository<BookSaving, Integer> {
}
