package vo;
// Vo : vaule object
//DTO : Date Transfer Object
public class Contact {
    private int id;
    private String name;
    private  String phone;

    // 생성자 만들기
    public Contact(int id, String name, String phone) {
        this.id = id;
        this.name=name;
        this.phone=phone;

    }

    //Getter
    public int getId() {return this.id;}

    public String getName() {
        return this.name;
    }

    public String getPhone() {
        return this.phone;
    }

    //Setter
    public void setName(String name) {
        this.name =name;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
    //toString Override
    @Override
    public String toString() {
        return "Contact{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", phone='" + phone + '\'' +
                '}';
        }
    }
