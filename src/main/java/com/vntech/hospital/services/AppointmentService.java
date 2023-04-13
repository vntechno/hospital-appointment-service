package com.vntech.hospital.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vntech.hospital.entities.Appointment;
import com.vntech.hospital.repository.AppointmentRepository;

@Service
public class AppointmentService {

	@Autowired
	private AppointmentRepository appointmentRepository;

	public Appointment book(Appointment appointment) {
		return appointmentRepository.save(appointment);
	}
}
