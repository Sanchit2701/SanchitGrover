public class Vehicle {
    void fuel(){
        System.out.println("fuel efficiency is maximum of this vehicle");
    }
    void start(){
        System.out.println("Started");
    }
}
class Bike extends Vehicle{
    @Override
    void start(){
        System.out.println("bike started");
    }
    void brake(){
        System.out.println("Automatic Braking system is involved");
    }
    public static void main(String[] args){
        Vehicle obj = new Vehicle();
        Bike obj1 = new Bike();

        obj.fuel();
        obj.start();
        obj1.start();
        obj1.brake();

    }
}