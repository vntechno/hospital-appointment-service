package com.vntech.hospital.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vntech.hospital.entities.Appointment;
import com.vntech.hospital.services.AppointmentService;

@RestController
@RequestMapping("/book")
public class AppointmentController {

	@Autowired
	private AppointmentService appointmentService;
	@PostMapping("/appointment")
	public Appointment book(@RequestBody Appointment Appointment) {
		return appointmentService.book(Appointment);
	}

}
