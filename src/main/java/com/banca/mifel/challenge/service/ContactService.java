package com.banca.mifel.challenge.service;

import com.banca.mifel.challenge.model.Contact;

import java.util.List;
import java.util.Optional;
public interface ContactService {
    Optional<List<Contact>> findAll();
    Optional<List<Contact>> findByName(String name);
}
