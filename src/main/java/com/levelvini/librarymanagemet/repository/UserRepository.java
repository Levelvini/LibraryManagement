package com.levelvini.librarymanagemet.repository;

import com.levelvini.librarymanagemet.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User,Long> {
}
