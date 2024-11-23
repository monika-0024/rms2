package com.innoverasolutions.resource_management.service;

import java.util.List;
import com.innoverasolutions.resource_management.model.HelpQuestion;

public interface HelpQuestionService {
    HelpQuestion saveHelpQuestion(HelpQuestion helpQuestion);
    List<HelpQuestion> getAllHelpQuestions();
    HelpQuestion getHelpQuestionById(Long id);
    HelpQuestion updateHelpQuestion(HelpQuestion helpQuestion);
    void deleteHelpQuestion(Long id);
}
