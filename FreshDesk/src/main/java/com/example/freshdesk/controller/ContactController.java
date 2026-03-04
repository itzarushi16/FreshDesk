package com.example.freshdesk.controller;

import java.util.List;

import org.springframework.web.bind.annotation.*;

import com.example.freshdesk.dto.ContactDTO;
import com.example.freshdesk.dto.CreateContactRequest;
import com.example.freshdesk.service.ContactService;

@RestController
@RequestMapping("/api/contacts")
public class ContactController {

    private final ContactService contactService;

    public ContactController(ContactService contactService) {
        this.contactService = contactService;
    }

    @GetMapping
    public List<ContactDTO> getAllContacts() {
        return contactService.getAllContacts();
    }

    @GetMapping("/{id}")
    public ContactDTO getContactById(@PathVariable Long id) {
        return contactService.getContactById(id);
    }

    @PostMapping
    public ContactDTO createContact(@RequestBody CreateContactRequest request) {
        return contactService.createContact(request);
    }

    
    @PutMapping("/{id}")
    public ContactDTO updateContact(
            @PathVariable Long id,
            @RequestBody ContactDTO contactDTO) {
        return contactService.updateContact(id, contactDTO);
    }

    @DeleteMapping("/{id}")
    public void deleteContact(@PathVariable Long id) {
        contactService.deleteContact(id);
    }
}
