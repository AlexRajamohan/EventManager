package com.eventmanager.demo;

import com.eventmanager.demo.entity.Event;
import com.eventmanager.demo.entity.EventAdmin;
//import com.eventmanager.demo.entity.EventQuestions;
import com.eventmanager.demo.entity.EventQuestions;
import com.eventmanager.demo.repository.EventRepository;
import com.eventmanager.demo.service.serviceImpl.EventAdminService;
//import com.eventmanager.demo.service.serviceImpl.EventQuestionsService;
import com.eventmanager.demo.service.serviceImpl.EventQuestionsService;
import com.eventmanager.demo.service.serviceImpl.EventService;
import com.eventmanager.demo.service.serviceInterface.EventAdminServiceInterface;
//import com.eventmanager.demo.service.serviceInterface.EventQuestionsServiceInterface;
import com.eventmanager.demo.service.serviceInterface.EventQuestionsServiceInterface;
import com.eventmanager.demo.service.serviceInterface.EventServiceInterface;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Date;
import java.util.Optional;

@RunWith(SpringRunner.class)
@SpringBootTest
public class EventManagerApplicationTests {
	@Autowired
	EventServiceInterface eventService=new EventService();
	@Autowired
	EventAdminServiceInterface eventAdminService=new EventAdminService();
	@Autowired
	EventQuestionsServiceInterface eventQuestionsService=new EventQuestionsService();
	@Test
	public void contextLoads() {

		Date d=new Date(2018, 10, 12);
		Event e=new Event(d, "mariage", 400, true);
		eventService.saveEvent(e);
		//eventService.getEventById(69878999L);
		//eventService.listAllEvent();
		//eventService.deleteEvent(e);

	EventAdmin a= new EventAdmin("Seurin", "Audrey", "audrey.seurin@gmail.com", "0656765434" );
	eventAdminService.saveEventAdmin(a);
		//eventAdminService.getEventAdminById(69878999L);
		//eventAdminService.listAllEventAdmin();
		//eventAdminService.deleteEventAdmin(a);

		EventQuestions q=new EventQuestions ("Mangez vous de la viande?", "wtf");
		eventQuestionsService.saveEventQuestions(q);
		//eventAdminService.getEventAdminById(69878999L);
		//eventAdminService.listAllEventAdmin();
		//eventAdminService.deleteEventAdmin(e);

	}



}
