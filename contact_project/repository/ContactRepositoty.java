package repository;

import vo.Contact;

import java.util.List;
import java.util.Optional;

public interface ContactRepositoty {
    void save(Contact contact); // 저장
    List<Contact> findAll();
    void delete(int id);
    // 존재유무 확인용 1개 얻어오기 기능
     Optional<Contact> findById(int id);
     void update(int id, Contact contact);
}
