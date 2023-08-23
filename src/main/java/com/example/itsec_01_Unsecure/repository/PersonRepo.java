package com.example.itsec_01_Unsecure.repository;

import com.example.itsec_01_Unsecure.model.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepo extends JpaRepository<Person, Long> {
}
