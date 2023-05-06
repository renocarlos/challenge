package com.banca.mifel.challenge.controller;

import com.banca.mifel.challenge.exceptions.PokemonNotFoundException;
import com.banca.mifel.challenge.model.Contact;
import com.banca.mifel.challenge.service.ContactService;
import com.banca.mifel.challenge.service.impl.ContactServiceImpl;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("contacts")
@NoArgsConstructor
public class ContactController {

    @Autowired
    ContactService contactService;

    public ContactController(ContactServiceImpl contactService) {
        this.contactService = contactService;
    }

    @GetMapping
    public ResponseEntity<List<Contact>> listContacts() {
        Optional<List<Contact>> contacts = contactService.findAll();
        if (contacts.isPresent()) {
            return new ResponseEntity<>(contacts.get(), HttpStatus.OK);
        } else {
            throw new PokemonNotFoundException("Contacts is empty");
        }
    }

    @GetMapping("/{name}")
    public ResponseEntity<List<Contact>> listContactsByName(@PathVariable("name") String name) {
        Optional<List<Contact>> contacts = contactService.findByName(name);
        if (contacts.isPresent()) {
            return new ResponseEntity<>(contacts.get(), HttpStatus.OK);
        } else {
            throw new PokemonNotFoundException("Contacts with name " + name + " not found");
        }
    }
}
