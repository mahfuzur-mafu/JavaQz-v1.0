package com.mahfuz.main.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.mahfuz.main.model.Question;

@Repository
public interface QuestionRepo extends JpaRepository<Question, Integer> {

}