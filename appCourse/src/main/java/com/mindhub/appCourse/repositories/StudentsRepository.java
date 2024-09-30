package com.mindhub.appCourse.repositories;

import com.mindhub.appCourse.models.Student;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface StudentsRepository extends JpaRepository<Student, UUID> {
}
