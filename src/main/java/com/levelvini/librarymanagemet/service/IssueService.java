package com.levelvini.librarymanagemet.service;

import com.levelvini.librarymanagemet.repository.IssueRepository;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

@Service
public class IssueService {
    IssueRepository repository;
    ModelMapper mapper;

    public IssueService(IssueRepository repository, ModelMapper mapper) {
        this.repository = repository;
        this.mapper = mapper;
    }
}
