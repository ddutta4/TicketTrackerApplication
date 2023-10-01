package com.gl.tickettracker.TicketTrackerapplication.service;

import java.util.List;

import com.gl.tickettracker.TicketTrackerapplication.entity.Ticket;

public interface TicketService {
	
	public List<Ticket> displayTicketDetails();
	
	public Ticket getTicketByTicketId(Integer ticketId);
	public void saveTicketDetails(Ticket ticket);
	public void deleteTicketByTicketId(Integer ticketId);
	public Ticket findTicketsByTicketShortDescriptionIgnoreCaseAndAndTicketTitle(String description,String ticketTitle);
	

}
