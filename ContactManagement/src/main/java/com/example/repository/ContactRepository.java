package com.example.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.entity.Contact;

public interface ContactRepository extends JpaRepository<Contact, Integer> {
	List<Contact> findByActive(boolean b);

}
