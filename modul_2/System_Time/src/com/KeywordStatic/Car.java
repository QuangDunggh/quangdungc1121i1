package com.KeywordStatic;

public class Car {
    private String name;
    private String engine;
    private static int numberofcar;

    public Car(String name, String engine) {
        this.name = name;
        this.engine = engine;
        numberofcar++;
    }

    public String getName() {
        return name;
    }

    public String getEngine() {
        return engine;
    }

    public  int getNumberofcar() {
        return this.numberofcar;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Car{" +
                "name=" + name +
                ", engine='" + engine + " id of car: " + numberofcar + '\'' +
                '}';
    }

    public static void main(String[] args) {
        Car car1 = new Car("Camry", "Suzuki honda");
        System.out.println(Car.numberofcar);
        System.out.println(car1);
        Car car2 = new Car("EAltis", "Suzuki honda");
        System.out.println(Car.numberofcar);
        System.out.println(car2);
        Car car3 = new Car("Vios", "Suzuki honda");
        System.out.println(Car.numberofcar);
        System.out.println(car3);
        Car car4 = new Car("Phantom", "Suzuki honda");
        System.out.println(Car.numberofcar);
        System.out.println(car4);
        Car car5 = new Car("Ford", "Suzuki honda");
        System.out.println(Car.numberofcar);
        System.out.println(car5);

        System.out.println(car1.getNumberofcar());

        System.out.println(car1);
        System.out.println(car2);
        System.out.println(car3);
        System.out.println(car4);
        System.out.println(car5);
    }
}
