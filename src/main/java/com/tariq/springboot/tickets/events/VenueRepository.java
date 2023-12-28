package com.tariq.springboot.tickets.events;

import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class VenueRepository {
    private final List<Venue> venues = List.of(
            new Venue(201, "Apple Office", "120 Bremner Blvd Suite 1600", "Toronto", "Canada"),
            new Venue(202, "Meta Office", "2300 Yonge St", "Toronto", "Canada")
    );

    public Optional<Venue> findById(int id) {
        return venues.stream().filter(venue -> venue.id() == id).findAny();
    }
}
