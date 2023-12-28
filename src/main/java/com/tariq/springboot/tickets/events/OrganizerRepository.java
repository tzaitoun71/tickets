package com.tariq.springboot.tickets.events;

import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class OrganizerRepository {
    private final List<Organizer> organizers = List.of(
            new Organizer(101, "Apple", "Apple event"),
            new Organizer(102, "Facebook", "Facebook event")
    );

    public List<Organizer> findAll() {
        return organizers;
    }
}
