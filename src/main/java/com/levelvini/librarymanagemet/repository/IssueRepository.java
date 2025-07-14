package com.levelvini.librarymanagemet.repository;

import com.levelvini.librarymanagemet.model.Issue;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IssueRepository extends JpaRepository<Issue,Long> {
}
