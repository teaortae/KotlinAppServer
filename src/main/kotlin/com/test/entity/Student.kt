package com.test.entity

import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id
import javax.persistence.Entity

@Entity
data class Student(
		val firstname: String? = null,
		val lastname: String? = null,
		val age: Int? = null,
		@Id @GeneratedValue(strategy = GenerationType.AUTO)
		val id: Int? = null) {
}

