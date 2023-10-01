package com.gl.tickettracker.TicketTrackerapplication.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gl.tickettracker.TicketTrackerapplication.entity.Ticket;

public interface TicketRepository extends JpaRepository<Ticket,Integer>{

	
	 public Optional<Ticket> findTicketsByTicketShortDescriptionIgnoreCaseOrTicketTitle(String description,String ticketTitle);
}
