public class Employee{
    private String name;
    private int age;
    private double salary;

    public Employee(String name, int age, double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }
    

    public String getName() {
        return name;
    }
    
    public int getAge() {
        return age;
    }
    
    public double getSalary() {
        return salary;
    }
    

    public void setName(String name) {
        this.name = name;
    }
    
    public void setAge(int age) {
        this.age = age;
    }
    
    public void setSalary(double salary) {
        this.salary = salary;
    }
    
    public static void main(String[] args) {
    
        Employee emp = new Employee("Michael Khan", 50, 55000.0);
        
    
        System.out.println("Name: " + emp.getName());
        System.out.println("Age: " + emp.getAge());
        System.out.println("Salary: $" + emp.getSalary());
        
    
        emp.setSalary(60000.0);
        System.out.println("Updated Salary: $" + emp.getSalary());
    }
}
