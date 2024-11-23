package com.innoverasolutions.resource_management.service;

import com.innoverasolutions.resource_management.model.Feedback;
import com.innoverasolutions.resource_management.repository.FeedbackRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FeedbackService {

    @Autowired
    private FeedbackRepository feedbackRepository;

    public void saveFeedback(Feedback feedback) {
        feedbackRepository.save(feedback);
    }
}
