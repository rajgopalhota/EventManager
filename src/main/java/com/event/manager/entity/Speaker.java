package com.event.manager.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Data
public class Speaker {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String bio;
    private String expertise;

    @OneToMany(mappedBy = "speaker", cascade = CascadeType.ALL)
    private List<Session> sessions;

}
