package com.modelai.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.modelai.api.model.*;

public interface ModelaAiRepository extends JpaRepository<Modela, Long> {
    
}
