package com.prithvi.quizapp.dao;

import com.prithvi.quizapp.Question;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface QuestionDAO extends JpaRepository<Question, Integer> {



}
