package com.mindhub.appCourse.repositories;

import com.mindhub.appCourse.models.Person;
import jakarta.persistence.Id;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface PersonRepository extends JpaRepository<Person, Long> {
}
