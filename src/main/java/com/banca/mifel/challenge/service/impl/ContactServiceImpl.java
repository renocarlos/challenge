package com.banca.mifel.challenge.service.impl;

import com.banca.mifel.challenge.model.Contact;
import com.banca.mifel.challenge.repository.ContactRepository;
import com.banca.mifel.challenge.service.ContactService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class ContactServiceImpl implements ContactService {

    @Autowired
    private ContactRepository contactRepository;

    @Override
    public Optional<List<Contact>> findAll() {
        return Optional.of(contactRepository.findAll());
    }

    @Override
    public Optional<List<Contact>> findByName(String name) {
        return Optional.of(contactRepository.findByName(name));
    }

}
