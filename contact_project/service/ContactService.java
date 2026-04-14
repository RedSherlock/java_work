package service;

import vo.Contact;

import java.util.List;
import java.util.Optional;

public interface ContactService {
    void create(String name, String phone);
    List<Contact> readAll();
    Optional<Contact> findById(int id);
    void update(int id, String name, String phone);
    void delete(int id);
}

