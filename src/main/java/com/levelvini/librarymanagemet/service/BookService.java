package com.levelvini.librarymanagemet.service;

import com.levelvini.librarymanagemet.repository.BookRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookService {
    BookRepository repository;
    ModelMapper mapper;
    
    public BookService(BookRepository repository, ModelMapper mapper) {
        this.repository = repository;
        this.mapper = mapper;
    }
}
