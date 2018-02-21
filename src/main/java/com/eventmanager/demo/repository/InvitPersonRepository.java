package com.eventmanager.demo.repository;


import com.eventmanager.demo.entity.InvitPerson;
import org.springframework.data.repository.CrudRepository;


public interface InvitPersonRepository extends CrudRepository<InvitPerson, Long> {
}
