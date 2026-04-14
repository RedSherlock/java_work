package repository;

import vo.Contact;

import java.util.List;
import java.util.Optional;

public class ContactRepositoryImpl implements ContactRepositoty{
    @Override
    public void save(Contact contact) {

    }

    @Override
    public List<Contact> findAll() {
        return List.of();
    }

    @Override
    public void delete(int id) {

    }

    @Override
    public Optional<Contact> findById(int id) {
        return Optional.empty();
    }

    @Override
    public void update(int id, Contact contact) {

    }
}
