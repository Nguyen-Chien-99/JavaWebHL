package com.devmaster.Lab04.service;

import com.devmaster.Lab04.entity.Student;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Service class: StudentService
 * <p>Lớp dịch vụ thực hiện các chức năng thao tác với List Object Student</p>
 *
 * @author Chung Trịnh
 * @version 1.0
 */
@Service
public class StudentService {
    List<Student> students = new ArrayList<>();

    public StudentService() {
        students.addAll(Arrays.asList(
                new Student(1L, "DevMaster1", 20, "Nam", "Số 25 VNP", "0978611889", "chien08032003@gmail.com"),
                new Student(2L, "DevMaster2", 25, "Nam", "Số 25 VNP", "0978611889", "contact@devmaster.edu.vn"),
                new Student(3L, "DevMaster3", 22, "Nam", "Số 25 VNP", "0978611889", "chien83@gmail.com")
        ));
    }

    // Lấy toàn bộ danh sách sinh viên
    public List<Student> getStudents() {
        return students;
    }

    // Lấy sinh viên theo id
    public Student getStudent(Long id) {
        return students.stream()
                .filter(student -> student.getId().equals(id))
                .findFirst()
                .orElse(null);
    }

    // Thêm mới một sinh viên
    public Student addStudent(Student student) {
        students.add(student);
        return student;
    }

    // Cập nhật thông tin sinh viên
    public Student updateStudent(Long id, Student student) {
        Student check = getStudent(id);
        if (check == null) {
            return null;
        }

        students.forEach(item -> {
            if (item.getId().equals(id)) {
                item.setName(student.getName());
                item.setAddress(student.getAddress());
                item.setEmail(student.getEmail());
                item.setPhone(student.getPhone());
                item.setAge(student.getAge());
                item.setGender(student.getGender());
            }
        });
        return student;
    }

    // Xóa thông tin sinh viên
    public boolean deleteStudent(Long id) {
        Student check = getStudent(id);
        return students.remove(check);
    }
}

