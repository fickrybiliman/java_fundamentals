package labs_examples.objects_classes_methods.labs.objects.Ex_04;

public class PowerPlant {
    String model; //Propeller, Piston Engine, Jet Engine, Turbo Prop

    public PowerPlant(String model) {
        this.model = model;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public String toString() {
        return "Model = '" + model + '\'';
    }
}
