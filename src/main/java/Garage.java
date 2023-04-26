package main.java;

import main.java.exceptions.CarNotFoundException;

public class Garage {

    public static Car[] carsList = new Car[100];

    public static void signUp(Car car) {

        for (int i = 0; i < carsList.length; i++) {
            if (carsList[i] == null) {
                carsList[i] = car;
                return;
            }
        }
    }

    public static void signOut(Car car) throws CarNotFoundException {
        for (int i = 0; i < carsList.length; i++) {
            if (carsList[i] == car) {
                carsList[i] = null;
                return;
            }
        }
        throw new CarNotFoundException("This car " + car.getVin() + " does not exist.");
    }

    public static void getVehiclesList() {
        System.out.println("");
        System.out.println("The garage context looks like below:");
        for (int i = 0; i < carsList.length; i++) {
            if (carsList[i] != null) {
                System.out.println(carsList[i].getVin());
            }
        }
    }


}
