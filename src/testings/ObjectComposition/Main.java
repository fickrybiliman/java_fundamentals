package testings.ObjectComposition;

public class Main {
    public static void main(String[] args) {
        Engine engine = new Engine(400);
        Stereo stereo = new Stereo("Panasonic");
        Car car = new Car(engine, stereo, "CRV", "Black");

        // Output: "I drive a Blue XTerra with a sweet Panasonic stereo, and a 400.0 horse power engine"
        System.out.println("I drive a " + car.color + " " + car.model + " with a sweet " + car.stereo.brand + " stereo, " + "and a " + car.engine.horsePower + " horse power engine.");
    }
}
