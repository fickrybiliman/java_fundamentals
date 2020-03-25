package labs_examples.objects_classes_methods.labs.methods.Exer_02;

public class Wings {
    String position; //High Wing, Middle Wing, Low Wing
    String sets; //Monoplanes, Biplanes

    public Wings(String position, String sets) {
        this.position = position;
        this.sets = sets;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getSets() {
        return sets;
    }

    public void setSets(String sets) {
        this.sets = sets;
    }

    @Override
    public String toString() {
        return "Position = '" + position + '\'' +
                ", Wings Sets='" + sets + '\'';
    }
}
