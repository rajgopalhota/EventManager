package com.event.manager.entity;

import jakarta.persistence.*;
import lombok.Data;
import java.util.List;

@Entity
@Data
public class Event {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String description;
    private String location;
    private String startTime;
    private String endTime;

    @OneToMany(mappedBy = "event", cascade = CascadeType.ALL)
    private List<Session> sessions;
}
