package com.eventmanager.demo.repository;

import com.eventmanager.demo.entity.Guest;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.Repository;

public interface GuestRepository extends CrudRepository<Guest, Long> {
}
