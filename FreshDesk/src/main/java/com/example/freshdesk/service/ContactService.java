package com.example.freshdesk.service;

import java.util.List;

import org.springframework.core.ParameterizedTypeReference;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

import com.example.freshdesk.dto.ContactDTO;
import com.example.freshdesk.dto.CreateContactRequest;

@Service
public class ContactService {

    private final WebClient webClient;

    public ContactService(WebClient freshdeskWebClient) {
        this.webClient = freshdeskWebClient;
    }

    // ✅ Get all contacts
    public List<ContactDTO> getAllContacts() {
        return webClient.get()
                .uri("/contacts")
                .retrieve()
                .bodyToMono(new ParameterizedTypeReference<List<ContactDTO>>() {})
                .block();
    }

    // ✅ Get contact by ID
    public ContactDTO getContactById(Long id) {
        return webClient.get()
                .uri("/contacts/{id}", id)
                .retrieve()
                .bodyToMono(ContactDTO.class)
                .block();
    }

    // ✅ Create contact (ID WILL COME BACK)
    public ContactDTO createContact(CreateContactRequest req) {
        return webClient.post()
            .uri("/contacts")
            .bodyValue(req)   // 🔥 NO ID CAN EVER GO HERE
            .retrieve()
            .bodyToMono(ContactDTO.class)
            .block();
    }


    // ✅ Update contact
    public ContactDTO updateContact(Long id, ContactDTO dto) {
        return webClient.put()
                .uri("/contacts/{id}", id)
                .bodyValue(dto)
                .retrieve()
                .bodyToMono(ContactDTO.class)
                .block();
    }

    // ✅ Delete contact
    public void deleteContact(Long id) {
        webClient.delete()
                .uri("/contacts/{id}", id)
                .retrieve()
                .toBodilessEntity()
                .block();
    }
}
