package model;

public class PhoneBook {
    private String phoneNumber;
    private String group;
    private String fullName;
    private String sex;
    private String address;
    private String birthDate;
    private String email;

    public PhoneBook() {

    }

    public PhoneBook(String phoneNumber, String group, String fullName, String sex, String address, String birthDate, String email) {
        this.phoneNumber = phoneNumber;
        this.group = group;
        this.fullName = fullName;
        this.sex = sex;
        this.address = address;
        this.birthDate = birthDate;
        this.email = email;
    }

    public PhoneBook(String record) {
        String[] fields = record.split(";");
        phoneNumber = fields[0];
        group = fields[1];
        fullName = fields[2];
        sex = fields[3];
        address = fields[4];
        birthDate = fields[5];
        email = fields[6];
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return String.format("%s;%s;%s;%s;%s;%s;%s", phoneNumber, group, fullName, sex, address, birthDate, email);
    }
}
