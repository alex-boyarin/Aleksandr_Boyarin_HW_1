package task4.car;

public abstract class Car {
    private final String typeBody;
    private final String brand;
    private final String modelCar;
    private final String typeFuel;
    private final double fuelConsumption;
    private final int maxSpeed;
    private final double price;

    public Car(String typeBody, String brand, String modelCar, String typeFuel, double fuelConsumption, int maxSpeed, double price) {
        this.typeBody = typeBody;
        this.brand = brand;
        this.modelCar = modelCar;
        this.typeFuel = typeFuel;
        this.fuelConsumption = fuelConsumption;
        this.maxSpeed = maxSpeed;
        this.price = price;
    }

    public double getFuelConsumption() {
        return fuelConsumption;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "typeBody=" + typeBody +
                ", brand=" + brand +
                ", model=" + modelCar +
                ", fuel=" + typeFuel +
                ", fuelConsumption=" + fuelConsumption +
                ", maxSpeed=" + maxSpeed +
                ", price=" + price + "\n";
    }
}
