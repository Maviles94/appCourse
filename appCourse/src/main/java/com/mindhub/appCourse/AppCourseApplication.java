package com.mindhub.appCourse;

import com.mindhub.appCourse.models.*;
import com.mindhub.appCourse.repositories.*;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.time.LocalDateTime;

@SpringBootApplication
public class AppCourseApplication {

	public static void main(String[] args) {
		SpringApplication.run(AppCourseApplication.class, args);
	}

	@Bean
	public CommandLineRunner initData(AdminRepository adminRepository, StudentsRepository studentsRepository, TeacherRepository teacherRepository, CourseRepository courseRepository, PersonRepository personRepository,WorkshopRepository workshopRepository, ClassRoomRepository classRoomRepository) {
		return args -> {
			Admin admin = new Admin("Melba", "admin@mindhub.com","2024");
			adminRepository.save(admin);

			Student student = new Student("Mariano","marianoaviles@mindhub.com","2024");
			studentsRepository.save(student);

			Teacher teacher = new Teacher("Martin","martin@mindhub.com","1234","JAVA");
			teacherRepository.save(teacher);

			Course course = new Course("CodeUP","Course of JAVA");
			teacher.addCourse(course);
			courseRepository.save(course);

			ClassRoom classRoom = new ClassRoom("A0123", 20);
			classRoomRepository.save(classRoom);

			WorkShop workShop = new WorkShop(LocalDateTime.now().plusHours(2L));
			course.addWorkShop(workShop);
			classRoom.addWorkShop(workShop);
			workshopRepository.save(workShop);

			student.addWorkShop(workShop);
			workshopRepository.save(workShop);

		};
	}
}
