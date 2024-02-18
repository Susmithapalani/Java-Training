
class Vehicle {
    private String make;
    private String model;
    

    public Vehicle(String make, String model) {
        this.make = make;
        this.model = model;
    }
    
    
    public String getMake() {
        return make;
    }
    
    public String getModel() {
        return model;
    }
}

class Car extends Vehicle {

    public Car(String make, String model) {
        super(make, model);
    }
}

public class NewCar {
    public static void main(String[] args) {

        Car myCar = new Car("Toyota", "Corolla");

        System.out.println("Make: " + myCar.getMake());
        System.out.println("Model: " + myCar.getModel());
    }
}
