package com.mindhub.appCourse.repositories;

import com.mindhub.appCourse.models.Admin;
import jakarta.persistence.Id;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface AdminRepository extends JpaRepository<Admin, Long> {
}
