public class NewCarPolymorphism {
    public static void main(String[] args) {

        Vehicle[] vehicles = new Vehicle[2];

        Vehicle vehicle1 = new Vehicle("Ford", "Focus");
        Car car1 = new Car("Toyota", "Corolla");
    
        vehicles[0] = vehicle1;
        vehicles[1] = car1;
        
    
        for (Vehicle vehicle : vehicles) {
            vehicle.drive();
        }
    }
}


class Vehicle {
    
    private String make;
    private String model;
    

    public Vehicle(String make, String model) {
        this.make = make;
        this.model = model;
    }
    
    public void drive() {
        System.out.println("Vehicle is being driven.");
    }
}


class Car extends Vehicle {
    
    public Car(String make, String model) {

        super(make, model);
    }
    

    @Override
    public void drive() {
        System.out.println("Car is being driven.");
    }
}
