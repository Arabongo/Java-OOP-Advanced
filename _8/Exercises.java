package JAVAO._8;

public class Exercises {
    public static void main(String[] args) {
        exercise1();
        exercise2();
        exercise3();
    }

    /**
     * 1:
     *
     *
     * Create a class called "Dog" that extends the Animal class.
     *
     * Add a new field called "breed" to the Dog class.
     *
     * Write a constructor for the Dog class that takes in a breed, height, and weight as parameters, and passes the height and weight to the superclass constructor.
     *
     * Write getters and setters for the breed field.
     */
    private static void exercise1() {
        System.out.println("\nExercise 1: ");
      Dog bello = new Dog(1.2,50,"labrador");
        System.out.println(bello.getBreed());
        bello.runSpeedMetersPerSecond();
    }

    /**
     * 2:
     *
     *
     * Create new classes called "Fish" and "Bird" that extends the Animal class.
     *
     * Add a new field called "species" to the Fish class and "wingSpan" to the Bird class.
     *
     * Also create constructors, getters and setters
     *
     */
    private static void exercise2() {
        System.out.println("\nExercise 2: ");
        // Your code here
    }


    /**
     * 3:
     *
     * In the dog class create a method called runSpeedMetersPerSecond() that returns the Dog's Height * 2
     * In the fish class create a method called swimSpeedMetersPerSecond() that returns the Fish's Weight * 2
     * In the bird class create a method called flySpeedMetersPerSecond() that returns the Bird's Wingspan * 4
     *
     * Create instances of each Animal: Dog, Fish and Bird. Fill the constructors with values of your choice
     * and print out which of the animals has the fastest movement speed in MetersPerSecond
     */
    private static void exercise3() {
        System.out.println("\nExercise 3: ");
        // Your code here
        Dog myDog = new Dog(1.4, 25, "Labrador");
        Fish myFish = new Fish(0.5, 2, "Tonno");
        Bird myBird = new Bird(1.0, 7, 5);
        myDog.runSpeedMetersPerSecond();
        myFish.swimSpeedMetersPerSecond();
        myBird.flySpeedMetersPerSecond();
        double dogSpeed = myDog.runSpeedMetersPerSecond();
        double fishSpeed = myFish.swimSpeedMetersPerSecond();
        double birdSpeed = myBird.flySpeedMetersPerSecond();

        // print out the fastest animal
        if (dogSpeed > fishSpeed && dogSpeed > birdSpeed) {
            System.out.println("Il cane ha la velocità di movimento maggiore a " + dogSpeed + " metri per secondo!");
        } else if (fishSpeed > dogSpeed && fishSpeed > birdSpeed) {
            System.out.println("Il pesce ha la velocità di movimento maggiore a " + fishSpeed + " metri per secondo!");
        } else {
            System.out.println("L'uccello ha la velocità di movimento maggiore a " + birdSpeed + " metri per secondo!");
        }
    }
}


