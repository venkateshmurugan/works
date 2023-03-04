import javax.lang.model.util.ElementScanner6;

public class VehicleFactory {
    public static Vehicle createVehicle(String type){
        if(type.equals("car")){
            return new Car();
            }
        else  if(type.equals("bus")){
            return new Bus();
        }
        else
        {
            return null;
        }
    }
}
