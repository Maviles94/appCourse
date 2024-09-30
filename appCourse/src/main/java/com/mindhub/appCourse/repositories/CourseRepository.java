package com.mindhub.appCourse.repositories;

import com.mindhub.appCourse.models.Course;
import jakarta.persistence.Id;
import org.springframework.data.jpa.repository.JpaRepository;
import org.yaml.snakeyaml.events.Event;

import java.util.UUID;

public interface CourseRepository extends JpaRepository<Course, UUID> {
}
