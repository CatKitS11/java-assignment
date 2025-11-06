class Vehicle {
    private String brand;
    public String getBrand() {
        return brand;
    }
    public void setBrand(String newBrand) {
        brand = newBrand;
    }
    void start() {
        System.out.println( brand + " is starting");
    }
}

class Car extends Vehicle {
    
    void drive() {
        System.out.println( getBrand() + " is driving");
    }
}


public class MyInfo {
    public static void main(String[] args) {
        Car myCar = new Car();
        myCar.setBrand("honda");
        myCar.start();
        myCar.drive();
    }
}
