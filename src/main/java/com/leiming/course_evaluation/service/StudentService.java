package com.leiming.course_evaluation.service;

import com.leiming.course_evaluation.dto.Student;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface StudentService {
    Page<Student> findAll(Pageable pageable);
    int findAllCount();

    Student findById(Long id);
    void saveOne(Student student);
    int deleteStudent(int id);
    int deleteAllStudent(List<Long> stuList);
    Student findOneByNumber(String stuNumber);
}
