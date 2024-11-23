package com.innoverasolutions.resource_management.controller;

import com.innoverasolutions.resource_management.model.Feedback;
import com.innoverasolutions.resource_management.service.FeedbackService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class FeedbackController {

    @Autowired
    private FeedbackService feedbackService;

    @GetMapping("/ideator/feedback")
    public String feedbackForm(Model model) {
        model.addAttribute("feedback", new Feedback());
        return "feedback";
    }

    @PostMapping("/ideator/feedback")
    public String submitFeedback(Feedback feedback) {
        feedbackService.saveFeedback(feedback);
        return "redirect:/ideator?success";
    }
}
