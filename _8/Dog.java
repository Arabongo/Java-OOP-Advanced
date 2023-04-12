package JAVAO._8;

public class Dog extends Animal{
    private String breed;
    public Dog(double height, double weight, String breed) {
        super(height, weight);
        this.breed = breed;
    }
    public String getBreed() {
        return breed;
    }
    public void setBreed(String breed) {
        this.breed = breed;
    }
   // runSpeedMetersPerSecond() that returns the Dog's Height * 2
public double runSpeedMetersPerSecond(){
    return getHeight()*2;
}
}
