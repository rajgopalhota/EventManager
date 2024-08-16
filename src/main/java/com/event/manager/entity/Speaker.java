package com.event.manager.entity;

import lombok.Data;

import jakarta.persistence.*;

@Data
@Entity
@Table(name = "speakers")
public class Speaker {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne
    @JoinColumn(name = "user_id", nullable = false)
    private User user;

    // Additional fields specific to Speaker
}
