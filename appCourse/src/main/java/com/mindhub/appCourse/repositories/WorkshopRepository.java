package com.mindhub.appCourse.repositories;

import com.mindhub.appCourse.models.WorkShop;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface WorkshopRepository extends JpaRepository<WorkShop, UUID> {
}
