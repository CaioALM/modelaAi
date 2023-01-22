package com.modelai.api.model;
import com.modelai.api.dto.ModelaAiDTO;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
public class Modela {

    public Modela(ModelaAiDTO data) {
        this.name = data.name();

    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(length = 50, nullable = false)
    private String name;

    @Column(length = 50, nullable = false)
    private String lastname;

    @Column(length = 10, nullable = false)
    private String birthdate;

    @Column(length = 11, nullable = false)
    private String phone;

    @Column(length = 100, nullable = false)
    private String email;

    
    
}
