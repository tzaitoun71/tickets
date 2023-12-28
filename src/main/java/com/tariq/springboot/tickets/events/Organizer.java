package com.tariq.springboot.tickets.events;

public record Organizer( // A record is a concise syntax to create an immutable class
        int id,
        String name,
        String description) {
}
