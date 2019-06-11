package com.carlos.springbootapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.carlos.springbootapp.model.Contact;

@Repository
public interface ContactRepository extends JpaRepository<Contact, Long>{

}
