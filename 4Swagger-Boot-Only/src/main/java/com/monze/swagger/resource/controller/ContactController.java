package com.monze.swagger.resource.controller;

import com.monze.swagger.resource.model.Contact;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

@RestController
@RequestMapping( "/contact" )
public class ContactController {
  ConcurrentHashMap< String, Contact > contacts = new ConcurrentHashMap<>();

  @GetMapping( "/{id}" )
  public Contact getContact(@PathVariable String id) {
    return contacts.get(id);
  }

  @GetMapping
  public List< Contact > getAllContact() {
    return new ArrayList<>(contacts.values());
  }

  @PostMapping
  public Contact addContact(@RequestBody Contact contact) {
    contacts.put(contact.getId(), contact);
    return contact;
  }

}

