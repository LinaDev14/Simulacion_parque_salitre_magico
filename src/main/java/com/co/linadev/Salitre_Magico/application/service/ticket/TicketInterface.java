package com.co.linadev.Salitre_Magico.application.service.ticket;

import com.co.linadev.Salitre_Magico.domain.dto.TicketDto;

import java.util.List;

public interface TicketInterface {

    //Basic CRUD service
    TicketDto saveTicket (TicketDto ticketDto);
    List<TicketDto> findAllTickets ();
}
