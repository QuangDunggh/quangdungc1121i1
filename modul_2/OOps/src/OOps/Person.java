package OOps;

public class Person {
    private String name;
    private int age;
    private int id;
    private int phone;
    private Address address;
    static public class Address {
        private int numberHome;
        private String street;
        private String district;
        private String city;

        public Address(int numberHome, String street, String district, String city) {
            this.numberHome = numberHome;
            this.street = street;
            this.district = district;
            this.city = city;
        }

        public int getNumberHome() {
            return numberHome;
        }

        public void setNumberHome(int numberHome) {
            this.numberHome = numberHome;
        }

        public String getStreet() {
            return street;
        }

        public void setStreet(String street) {
            this.street = street;
        }

        public String getDistrict() {
            return district;
        }

        public void setDistrict(String district) {
            this.district = district;
        }

        public String getCity() {
            return city;
        }

        public void setCity(String city) {
            this.city = city;
        }

        @Override
        public String toString() {
            return "Có địa chỉ là " + numberHome +" đường " + street
                    + " phường " + district + " thành phố " + city;
        }
    }

    public Person(String name, int age, int id, int phone, Address address) {
        this.name = name;
        this.age = age;
        this.id = id;
        this.phone = phone;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", id=" + id +
                ", phone=" + phone +
                ", " + address +
                '}';
    }
}
