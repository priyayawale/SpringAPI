package com.College.StudentManagementSystem.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.College.StudentManagementSystem.model.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student,Long>{

}
