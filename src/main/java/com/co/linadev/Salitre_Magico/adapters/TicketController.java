package com.co.linadev.Salitre_Magico.adapters;


import com.co.linadev.Salitre_Magico.application.service.ticket.TicketService;
import com.co.linadev.Salitre_Magico.domain.dto.TicketDto;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("api/ticket")
public class TicketController {

    private final TicketService ticketService;

    //saveTicket
    //localhost:8080/api/ticket/saveTicket

    @PostMapping("/saveTicket")
    public ResponseEntity<TicketDto> saveTicket(@RequestBody TicketDto ticketDto){
        return new ResponseEntity<>(ticketService.saveTicket(ticketDto), HttpStatus.CREATED);
    }

    //findAllTickets
    //localhost:8080/api/ticket/findAllTickets
    @GetMapping("/findAllTickets")
    public ResponseEntity<List<TicketDto>> findAllTickets(){
        return new ResponseEntity<>(ticketService.findAllTickets(),HttpStatus.OK);
    }
}
