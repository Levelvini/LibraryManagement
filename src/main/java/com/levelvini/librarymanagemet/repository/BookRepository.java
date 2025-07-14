package com.levelvini.librarymanagemet.repository;

import com.levelvini.librarymanagemet.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRepository extends JpaRepository<Book,Long> {
}
