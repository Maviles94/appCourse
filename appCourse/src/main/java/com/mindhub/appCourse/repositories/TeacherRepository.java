package com.mindhub.appCourse.repositories;

import com.mindhub.appCourse.models.Teacher;
import org.springframework.data.jpa.repository.JpaRepository;
import org.yaml.snakeyaml.events.Event;

import java.util.UUID;

public interface TeacherRepository extends JpaRepository<Teacher, Long> {
}
