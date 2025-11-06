public class MyInfo {
    public static void main(String[] args) {
            Car myCar = new Car();
            myCar.setBrand("Toyota");
            myCar.setSpeed(100);
            myCar.displayInfo();
        } 
}

class Car {
    private String brand;
    private int speed;
    public String getBrand() {
        return brand;
    }
    public void setBrand(String newBrand) {
        brand = newBrand;
    }
    public int getSpeed() {
        return speed;
    }
    public void setSpeed(int newSpeed) {
        speed = newSpeed;
    }

    public void displayInfo() {
        System.out.println("Car brand: " + brand + ", Speed: " + speed + " km/h");
    }
}
