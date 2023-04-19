package JAVAO._11;

public record Person(String name, int age, String address) {
    @Override
    public String toString() {
        return "Name: " + name + ", Age: " + age;
    }
}
