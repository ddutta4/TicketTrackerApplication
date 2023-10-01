package com.gl.tickettracker.TicketTrackerapplication.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.gl.tickettracker.TicketTrackerapplication.entity.Ticket;
import com.gl.tickettracker.TicketTrackerapplication.repository.TicketRepository;

import lombok.RequiredArgsConstructor;

@Service

public class TicketServiceImpl implements TicketService{
	
	private  TicketRepository ticketRepository;

	@Override
	public List<Ticket> displayTicketDetails() {
		
		return ticketRepository.findAll();
	}

	@Override
	public Ticket getTicketByTicketId(Integer ticketId) {
		// TODO Auto-generated method stub
		return ticketRepository.findById(ticketId).get();
	}

	@Override
	public void saveTicketDetails(Ticket ticket) {
		// TODO Auto-generated method stub
		ticketRepository.save(ticket);
		
	}

	@Override
	public void deleteTicketByTicketId(Integer ticketId) {
		// TODO Auto-generated method stub
		ticketRepository.deleteById(ticketId);
		
	}

	@Override
	public Ticket findTicketsByTicketShortDescriptionIgnoreCaseAndAndTicketTitle(String description,
			String ticketTitle) {
		// TODO Auto-generated method stub
		return ticketRepository.findTicketsByTicketShortDescriptionIgnoreCaseOrTicketTitle(description, ticketTitle).get();
	}

}
