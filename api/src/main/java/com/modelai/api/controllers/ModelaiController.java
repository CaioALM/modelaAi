package com.modelai.api.controllers;
import org.springframework.beans.factory.annotation.*;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestBody;
import com.modelai.api.dto.*;
import com.modelai.api.model.Modela;
import com.modelai.api.controllers.ModelaiController;
import com.modelai.api.repository.ModelaAiRepository;

@RestController
@RequestMapping("/api/modelai")
public class ModelaiController {

    @Autowired
    private ModelaAiRepository repository;

    @PostMapping
    public void create( @RequestBody ModelaAiDTO req) {

   
        repository.save(new Modela(req));

    }
    
}
