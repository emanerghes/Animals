public class Dog extends Animal {
    private String breed;

    public Dog(String nume, String sound, String breed) {
        super(nume, sound);
        this.breed = breed;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }
}