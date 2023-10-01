package com.gl.tickettracker.TicketTrackerapplication.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;


@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Table(name="ticket")
public class Ticket {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="ticket_id")
	private int id;
	@Column(name="ticket_title")
	private String ticketTitle;
	@Column(name="ticket_short_description")
	private String ticketShortDescription;
	@Column(name = "content")
	private String content;
	@Column(name="ticket_created_on")
	private Date date = new Date(System.currentTimeMillis());
	

}
