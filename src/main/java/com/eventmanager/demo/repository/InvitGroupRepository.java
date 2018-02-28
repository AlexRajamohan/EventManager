package com.eventmanager.demo.repository;

import com.eventmanager.demo.entity.InvitGroup;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface InvitGroupRepository extends JpaRepository<InvitGroup, Long> {

}
