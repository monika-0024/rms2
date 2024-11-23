package com.innoverasolutions.resource_management.controller;

import com.innoverasolutions.resource_management.model.HelpQuestion;
import com.innoverasolutions.resource_management.service.HelpQuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

import java.util.List;

@Controller
public class HelpQuestionController {

    @Autowired
    private HelpQuestionService helpQuestionService;

    @GetMapping("/help")
    public String showHelpPage(Model model) {
        model.addAttribute("helpQuestion", new HelpQuestion());
        return "help";
    }

    @PostMapping("/submitQuestion")
    public String submitQuestion(@ModelAttribute HelpQuestion helpQuestion) {
        helpQuestionService.saveHelpQuestion(helpQuestion);
        return "redirect:/help"; // Redirect back to help page after submission
    }

    @GetMapping("/admin/reports")
    public String showReportsPage(Model model) {
        List<HelpQuestion> helpQuestions = helpQuestionService.getAllHelpQuestions();
        model.addAttribute("helpQuestions", helpQuestions);
        return "admin"; // This corresponds to the admin.html page
    }
}
