package com.innoverasolutions.resource_management.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.innoverasolutions.resource_management.model.HelpQuestion;

public interface HelpQuestionRepository extends JpaRepository<HelpQuestion, Long> {
    // Additional query methods (if any) can be defined here
}
