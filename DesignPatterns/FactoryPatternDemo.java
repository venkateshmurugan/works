public class FactoryPatternDemo {
    public static void main(String[] args){
        Vehicle vehicle = VehicleFactory.createVehicle("car");
        vehicle.drive();
    }   
}
