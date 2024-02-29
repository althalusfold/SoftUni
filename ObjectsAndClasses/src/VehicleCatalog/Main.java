package VehicleCatalog;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        List<Vehicle> automobiles =  new ArrayList<>();
        int carsPower = 0;
        int trucksPower = 0;
        int countCars = 0;
        int countTrucks = 0;

        while (!input.equals("End")){
            String vehicleType = input.split(" ")[0];
            String vehicleMake = input.split(" ")[1];
            String vehicleColor = input.split(" ")[2];
            int vehicleHP = Integer.parseInt(input.split(" ")[3]);
            Vehicle vehicle = new Vehicle(vehicleType, vehicleMake, vehicleColor, vehicleHP);
            automobiles.add(vehicle);
            input = scanner.nextLine();
        }
        while (!input.equals("Close the Catalogue")) {
            for (Vehicle vehicle : automobiles) {
                if(vehicle.getTypeOfVehicle().equals("car")){
                    vehicle.setTypeOfVehicle("Car");
                    carsPower += vehicle.getHorsePower();
                    countCars++;
                }else if(vehicle.getTypeOfVehicle().equals("truck")) {
                    vehicle.setTypeOfVehicle("Truck");
                    trucksPower += vehicle.getHorsePower();
                    countTrucks++;
                }
                    if (input.equals(vehicle.getModel())) {
                        System.out.printf("Type: %s%n", vehicle.getTypeOfVehicle());
                        System.out.printf("Model: %s%n", input);
                        System.out.printf("Color: %s%n", vehicle.getColor());
                        System.out.printf("Horsepower: %s%n", vehicle.getHorsePower());
                    }
            }
            input = scanner.nextLine();
        }
        if(countCars > 0) {
            System.out.printf("Cars have average horsepower of: %.2f.%n", (carsPower * 1.0 / countCars));
        }else{
            System.out.printf("Cars have average horsepower of: 0.00.%n");
        }
        if(countTrucks > 0) {
            System.out.printf("Trucks have average horsepower of: %.2f.%n", (trucksPower * 1.0 / countTrucks));
        }else {
            System.out.printf("Trucks have average horsepower of: 0.00.%n");
        }
    }
}
