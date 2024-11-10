import java.util.ArrayList;
import java.util.Scanner;

public class VehicleRentalSystem {
    public static void main(String[] args) {
        ArrayList<Vehicle> rentedVehicles = new ArrayList<>();
        int num;
        Scanner scanner = new Scanner(System.in);
        System.out.println("***********************");
        System.out.println("*Vehicle Rental System*");
        System.out.println("***********************");
        do{

            System.out.println("Chose from the menu ...");
            System.out.println("1- Rent a Car .\n" +
                    "2- Rent a Bike .\n" +
                    "3- Rent a Truck .\n" +
                    "4- View Rented Vehicles .\n" +
                    "5- Exit the program.");
            num = scanner.nextInt();

            if(num == 1){
                System.out.print("Enter Car Model: ");
                scanner.nextLine();
                String carModel = scanner.nextLine();
                System.out.print("Enter Rental Day: ");
                int day = scanner.nextInt();
                Vehicle car = new Car(carModel,day);
                rentedVehicles.add(car);
                System.out.println("***Rental Details***");
                car.displayDetails();
            }else if(num == 2){
                System.out.print("Enter Bike Brand: ");
                scanner.nextLine();
                String bikeBrand = scanner.nextLine();
                System.out.print("Enter Rental Hour: ");
                int hours = scanner.nextInt();
                Vehicle bike = new Bike(bikeBrand, hours);
                rentedVehicles.add(bike);
                System.out.println("***Rental Details***");
                bike.displayDetails();
            }else if (num == 3){
                System.out.print("Enter Truck Type: ");
                scanner.nextLine();
                String truckType = scanner.nextLine();
                System.out.print("Enter Rental Week: ");
                int week = scanner.nextInt();
                Vehicle truck = new Truck(truckType,week);
                rentedVehicles.add(truck);
                System.out.println("***Rental Details***");
                truck.displayDetails();
            }else if (num == 4){
                System.out.println("Rented vehicles: ");
                for (Vehicle vehicle : rentedVehicles) {


                    vehicle.displayDetails();
                    System.out.println("*************");
                }
            }

            if(num == 5){
                System.out.println("Thank you for using the Vehicle Rental System!");
            }
        }while(num !=5);


    }
}