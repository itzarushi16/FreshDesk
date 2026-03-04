package com.example.freshdesk.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

import com.example.freshdesk.dto.TicketRequestDTO;

@Service
public class TicketService {

    private final WebClient webClient;

    public TicketService(WebClient freshdeskWebClient) {
        this.webClient = freshdeskWebClient;
    }

    // GET ALL TICKETS
    public List<?> getAllTickets() {
        return webClient.get()
                .uri("/tickets")
                .retrieve()
                .bodyToMono(List.class)
                .block();
    }

    // GET TICKET BY ID
    public Object getTicket(Long id) {
        return webClient.get()
                .uri("/tickets/{id}", id)
                .retrieve()
                .bodyToMono(Object.class)
                .block();
    }

    // CREATE TICKET
    public Object createTicket(TicketRequestDTO dto) {
        return webClient.post()
                .uri("/tickets")
                .bodyValue(dto)
                .retrieve()
                .bodyToMono(Object.class)
                .block();
    }

    // UPDATE TICKET
    public Object updateTicket(Long id, TicketRequestDTO dto) {
        return webClient.put()
                .uri("/tickets/{id}", id)
                .bodyValue(dto)
                .retrieve()
                .bodyToMono(Object.class)
                .block();
    }

    // DELETE TICKET
    public void deleteTicket(Long id) {
        webClient.delete()
                .uri("/tickets/{id}", id)
                .retrieve()
                .toBodilessEntity()
                .block();
    }
}
