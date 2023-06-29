package com.prithvi.quizapp.service;

import com.prithvi.quizapp.dao.QuestionDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.prithvi.quizapp.Question;

import java.util.List;

@Service
public class QuestionService {

    @Autowired
    QuestionDAO questionDao;


    public List<Question> getAllQuestions() {
        return questionDao.findAll();
    }
}
