package com.co.linadev.Salitre_Magico.application.service.ticket;

import com.co.linadev.Salitre_Magico.application.mappers.TicketMapper;
import com.co.linadev.Salitre_Magico.domain.dto.TicketDto;
import com.co.linadev.Salitre_Magico.domain.repository.TicketRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class TicketService implements TicketInterface{

    //Repository
    private final TicketRepository ticketRepository;

    //Mapper
    private final TicketMapper ticketMapper;

    @Override
    public TicketDto saveTicket(TicketDto ticketDto) {
        return ticketMapper.mapToTicketDto()
                .apply(ticketRepository.save(ticketMapper.mapToTicket()
                        .apply(ticketDto)));
    }

    @Override
    public List<TicketDto> findAllTickets() {
        return ticketRepository.findAll()
                .stream()
                .map(ticketMapper.mapToTicketDto())
                .collect(Collectors.toList());
    }
}
