package com.tariq.springboot.tickets.registration;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Optional;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;

public interface RegistrationRepository extends MongoRepository<Registration, String> {
    public Optional<Registration> findByTicketCode(String ticketCode);

    public void deleteByTicketCode(String ticketCode);
}