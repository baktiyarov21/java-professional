public class BuilderApp {
    public static void main(String[] args) {
//        Car car = new CarBuilder()
//                .buildMake("Audi")
//                .buildTransmission(Transmission.Manual)
//                .buildMaxSpeed(400)
//                .build();
//        System.out.println(car);

        Director director = new Director();
        director.setBuilder(new AudiCarBuilder());
        Car car = director.buildCar();
        System.out.println(car);
    }


}
abstract class CarBuilder {
    Car car;
    void createCar() {
        car = new Car();
    }

    abstract void buildMake();
    abstract void buildTransmission();
    abstract void buildMaxSpeed();

    public Car getCar() {
        return car;
    }
}

class AudiCarBuilder extends CarBuilder {

    @Override
    void createCar() {
        super.createCar();
    }

    @Override
    void buildMake() {
        car.setMake("Audi");
    }

    @Override
    void buildTransmission() {
        car.setTransmission(Transmission.Auto);
    }

    @Override
    void buildMaxSpeed() {
        car.setMaxSpeed(300);
    }
}

class Director {
    CarBuilder builder;
    void setBuilder(CarBuilder b) {
        builder = b;
    }

    Car buildCar() {
        builder.createCar();
        builder.buildMake();
        builder.buildTransmission();
        builder.buildMaxSpeed();
        Car car = builder.getCar();
        return car;
    }
}

//
//class CarBuilder {
//    String m = "Default";
//    Transmission transmission = Transmission.Manual;
//    int s = 100;
//
//    CarBuilder buildMake(String m) {
//        this.m = m;
//        return this;
//    }
//    CarBuilder buildTransmission(Transmission t) {
//        this.transmission = t;
//        return this;
//    }
//
//    CarBuilder buildMaxSpeed(int s) {
//        this.s = s;
//        return this;
//    }
//
//    Car build() {
//        Car car = new Car();
//        car.setMake(m);
//        car.setTransmission(Transmission.Auto);
//        car.setMaxSpeed(200);
//        return car;
//    }
//
//}

enum Transmission {
    Auto, Manual
}

class Car {
    private String make;
    private Transmission transmission;
    private int maxSpeed;

    @Override
    public String toString() {
        return "Car{" +
                "make='" + make + '\'' +
                ", transmission=" + transmission +
                ", maxSpeed=" + maxSpeed +
                '}';
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public Transmission getTransmission() {
        return transmission;
    }

    public void setTransmission(Transmission transmission) {
        this.transmission = transmission;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }
}
