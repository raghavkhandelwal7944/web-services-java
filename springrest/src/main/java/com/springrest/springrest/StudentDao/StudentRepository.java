package com.springrest.springrest.StudentDao;

import org.springframework.data.jpa.repository.JpaRepository;
import com.springrest.springrest.student.Students;

public interface StudentRepository extends JpaRepository<Students, Integer> {
    // No need to implement anything, Spring Data JPA does it all
}

