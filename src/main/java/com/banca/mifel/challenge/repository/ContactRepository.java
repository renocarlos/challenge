package com.banca.mifel.challenge.repository;

import com.banca.mifel.challenge.model.Contact;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface ContactRepository extends JpaRepository<Contact, Long> {
    List<Contact> findByName(String name);
}
