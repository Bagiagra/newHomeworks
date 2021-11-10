package by.overone;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class Garage {
    HashMap<Object, Integer> parkingCars = new HashMap<>();
    public Object Minivan;
    public Object PassengerCar;
    public Object Truck;

    public HashMap<Object, Integer> Parking(Car <?extends Car> car) {
       switch (car) {
           case 1 (Minivan):
           parkingCars.put(Minivan, new Integer (+1));
           break;
           case 2 (PassengerCar):
           parkingCars.put(PassengerCar, new Integer(+1));
           break;
           case 3 (Truck):
           parkingCars.put(Truck, new Integer(+1));
            break;
           default:
               break;
       }

    }
    public HashMap<Object, Integer> UnParking(Car <?extends Car> car) {
        switch (car) {
            case 1 (Minivan):
            parkingCars.put(Minivan, new Integer (-1));
            break;
            case 2 (PassengerCar):
            parkingCars.put(PassengerCar, new Integer(-1));
            break;
            case 3 (Truck):
            parkingCars.put(Truck, new Integer(-1));
            break;
            default:
                break;
        }


    }

    public Garage(Minivan minivan, PassengerCar passengercar, Truck truck) {
        parkingCars.put(minivan, 0);
        parkingCars.put(passengercar, 0);
        parkingCars.put(truck, 0);
    }


}
