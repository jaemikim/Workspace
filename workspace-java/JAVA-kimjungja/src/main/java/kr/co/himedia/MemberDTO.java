package kr.co.himedia;

public class MemberDTO {
    private String name;
    private String age;
    private String birthday;
    private String phone;
    private String address;
    private boolean marriage;

    public MemberDTO() {
    }

    public MemberDTO(String name, String age, String birthday, String phone, String address, boolean marriage) {
        this.name = name;
        this.age = age;
        this.birthday = birthday;
        this.phone = phone;
        this.address = address;
        this.marriage = marriage;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public boolean isMarriage() {
        return marriage;
    }

    public void setMarriage(boolean marriage) {
        this.marriage = marriage;
    }

    @Override
    public String toString() {
        return "MemberDTO{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", birthday='" + birthday + '\'' +
                ", phone='" + phone + '\'' +
                ", address='" + address + '\'' +
                ", marriage=" + marriage +
                '}';
    }
}
