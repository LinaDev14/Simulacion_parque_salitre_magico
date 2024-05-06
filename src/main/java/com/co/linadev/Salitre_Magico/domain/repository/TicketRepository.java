package com.co.linadev.Salitre_Magico.domain.repository;

import com.co.linadev.Salitre_Magico.domain.collections.Ticket;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface TicketRepository extends MongoRepository<Ticket, String> {

}
