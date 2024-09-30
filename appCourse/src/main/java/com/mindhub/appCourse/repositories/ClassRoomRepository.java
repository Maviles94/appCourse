package com.mindhub.appCourse.repositories;

import com.mindhub.appCourse.models.ClassRoom;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface ClassRoomRepository extends JpaRepository<ClassRoom, UUID> {
}
