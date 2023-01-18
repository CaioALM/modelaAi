package com.modelai.api.controllers;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestBody;
import com.modelai.api.dto.*;

@RestController
@RequestMapping("/api/modelai")
public class ModelaiController {

    @PostMapping
    public void create( @RequestBody ModelaAiDTO req) {

    System.out.println(req.name());


    }
}
