package com.example.freshdesk.controller;

import java.util.List;

import org.springframework.web.bind.annotation.*;

import com.example.freshdesk.dto.TicketRequestDTO;
import com.example.freshdesk.service.TicketService;

@RestController
@RequestMapping("/api/tickets")
@CrossOrigin(origins = "http://localhost:3000")
public class TicketController {

    private final TicketService service;

    public TicketController(TicketService service) {
        this.service = service;
    }

    // GET ALL TICKETS
    @GetMapping
    public List<?> getAll() {
        return service.getAllTickets();
    }

    // GET TICKET BY ID
    @GetMapping("/{id}")
    public Object get(@PathVariable Long id) {
        return service.getTicket(id);
    }

    // CREATE TICKET
    @PostMapping
    public Object create(@RequestBody TicketRequestDTO dto) {
        return service.createTicket(dto);
    }

    // UPDATE TICKET
    @PutMapping("/{id}")
    public Object update(@PathVariable Long id, @RequestBody TicketRequestDTO dto) {
        return service.updateTicket(id, dto);
    }

    // DELETE TICKET
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        service.deleteTicket(id);
    }
}
