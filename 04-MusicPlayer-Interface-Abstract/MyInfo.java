interface Playable {
    void play();
}

abstract class MusicDevice implements Playable {
    String brand;

    void info() {
        System.out.println("Brand: " + brand);
    }

    MusicDevice(String newBrand) {
        this.brand = newBrand;
    }

    abstract void connect();
}

class CDPlayer extends MusicDevice implements Playable {
    CDPlayer(String newBrand) {
        super(newBrand);
    }

    void connect() {
        System.out.println(brand + " is connected cd player");
    }

    public void play() {
        System.out.println(brand + " is playing cd player");
    }
}

class SmartPhone extends MusicDevice implements Playable {
    SmartPhone(String newBrand) {
        super(newBrand);
    }

    void connect() {
        System.out.println(brand + " is connected Bluetooth");
    }

    public void play() {
        System.out.println(brand + " is playing Spotify");
    }
}

public class MyInfo {
    public static void main(String[] args) {
        CDPlayer cd = new CDPlayer("Sony");
        cd.info();
        cd.connect();
        cd.play();

        SmartPhone Iphone = new SmartPhone("Apple");
        Iphone  .info();
        Iphone.connect();
        Iphone.play();
    }

}
