package com.eventmanager.demo.repository;


import com.eventmanager.demo.entity.InvitPerson;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.Repository;

public interface InvitPersonRepository extends CrudRepository<InvitPerson, Long> {
}
