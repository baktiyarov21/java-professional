public class Animal{
    String breed;
    int speed;
    int weight;
    int price;

    public Animal(String breed, int speed, int weight, int price) {
        this.breed = breed;
        this.speed = speed;
        this.weight = weight;
        this.price = price;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "breed='" + breed + '\'' +
                ", speed=" + speed +
                ", weight=" + weight +
                ", price=" + price +
                '}';
    }
}
