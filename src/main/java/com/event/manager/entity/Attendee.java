package com.event.manager.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Attendee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String email;

    @ManyToOne
    @JoinColumn(name = "session_id")
    private Session session;
}
