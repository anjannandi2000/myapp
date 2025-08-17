package Myproject_crud.springboot.myapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import Myproject_crud.springboot.myapp.entity.Student;

public interface StudentRepository extends JpaRepository<Student,Integer > {


}

