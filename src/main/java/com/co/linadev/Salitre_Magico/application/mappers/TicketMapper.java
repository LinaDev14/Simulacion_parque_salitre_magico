package com.co.linadev.Salitre_Magico.application.mappers;


import com.co.linadev.Salitre_Magico.domain.collections.Ticket;
import com.co.linadev.Salitre_Magico.domain.dto.TicketDto;
import org.springframework.stereotype.Component;

import java.util.function.Function;

@Component
public class TicketMapper {

    public Function<TicketDto, Ticket> mapToTicket(){

        return ticketDto -> new Ticket(
                ticketDto.getId(),
                ticketDto.getName(),
                ticketDto.getDescription(),
                ticketDto.getPrice(),
                ticketDto.getCode(),
                ticketDto.getStock(),
                ticketDto.getIdStation()
        );
    }
    public Function<Ticket, TicketDto> mapToTicketDto(){

        return ticket -> new TicketDto(
                ticket.getId(),
                ticket.getName(),
                ticket.getDescription(),
                ticket.getPrice(),
                ticket.getCode(),
                ticket.getStock(),
                ticket.getIdStation()

        );
    }
}
