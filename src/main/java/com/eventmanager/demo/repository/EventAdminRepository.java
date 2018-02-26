package com.eventmanager.demo.repository;

import com.eventmanager.demo.entity.EventAdmin;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by audre on 21/02/2018.
 */

public interface EventAdminRepository extends CrudRepository<EventAdmin, Long>
{

}