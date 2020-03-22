package testings.ObjectComposition;

public class Car {
    Engine engine;
    Stereo stereo;
    String model;
    String color;

    public Car (Engine e, Stereo s, String model, String color) {
        this.engine = e;
        this.stereo = s;
        this.model = model;
        this.color = color;
    }

}
