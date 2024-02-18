
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

public class NewCarOverriding {
    public static void main(String[] args) {
    
        Car myCar = new Car("Toyota", "Corolla");
        
        
        myCar.drive();
    }
}
