package com.test.controller

import com.test.entity.Student
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController
import com.test.repository.StudentRepository
import org.springframework.beans.factory.annotation.Autowired

@RestController
class StudentController() {

	@Autowired
	lateinit var strepository: StudentRepository

	@GetMapping("/studentList")
	fun getStudentList(): List<Student> {
		return strepository.findAll()
	}
}