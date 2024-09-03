package com.example.todoapp.repository;

import com.example.todoapp.domain.ToDo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

//입력, 수정, 삭제를 도와주는 인터페이스
@Repository
public interface ToDoRepository extends JpaRepository<ToDo,Long> {
}
