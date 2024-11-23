package com.innoverasolutions.resource_management.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.innoverasolutions.resource_management.model.HelpQuestion;
import com.innoverasolutions.resource_management.repository.HelpQuestionRepository;
import com.innoverasolutions.resource_management.service.HelpQuestionService;

@Service
public class HelpQuestionServiceImpl implements HelpQuestionService {

    @Autowired
    private HelpQuestionRepository helpQuestionRepository;

    @Override
    public HelpQuestion saveHelpQuestion(HelpQuestion helpQuestion) {
        return helpQuestionRepository.save(helpQuestion);
    }

    @Override
    public List<HelpQuestion> getAllHelpQuestions() {
        return helpQuestionRepository.findAll();
    }

    @Override
    public HelpQuestion getHelpQuestionById(Long id) {
        return helpQuestionRepository.findById(id).orElse(null);
    }

    @Override
    public HelpQuestion updateHelpQuestion(HelpQuestion helpQuestion) {
        return helpQuestionRepository.save(helpQuestion);
    }

    @Override
    public void deleteHelpQuestion(Long id) {
        helpQuestionRepository.deleteById(id);
    }
}
