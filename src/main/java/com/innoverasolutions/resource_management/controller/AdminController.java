package com.innoverasolutions.resource_management.controller;

import com.innoverasolutions.resource_management.model.HelpQuestion;
import com.innoverasolutions.resource_management.service.HelpQuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class AdminController {

    @Autowired
    private HelpQuestionService helpQuestionService;

    @GetMapping("/admin/hackathon")
    public String showHackathonPage() {
        // Return the view name for the hackathon management page
        return "hackathon";  // Make sure you have hackathon.html in the templates folder
    }
}
