package state;

import vo.Contact;

import java.util.ArrayList;
import java.util.List;

// 프로그램 전체에서 사용될 공용 연락처 리스트
// 자동증가 ID 관리용 클래스
public class ContactState {
    private final List<Contact> contacts = new ArrayList<>();
    private int nextId = 1;

    //getter 생성
    public List<Contact> getContacts() {
        return this.contacts;
    }

    //다음번 입력될 id 값 생성
    public int generateId() {
        return nextId++;
    }

}
