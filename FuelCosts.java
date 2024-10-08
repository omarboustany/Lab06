import java.util.Scanner;

public class FuelCosts {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double gallonsInTank = 0, fuelEfficiency = 0, pricePerGallon = 0;
        String trash;
        boolean done = false;

        // Gallons input
        do {
            System.out.print("Enter gallons of gas in the tank: ");
            if (in.hasNextDouble()) {
                gallonsInTank = in.nextDouble();
                in.nextLine();
                done = true;
            } else {
                trash = in.nextLine();
                System.out.println("Invalid input: " + trash);
                System.out.println("Please enter a valid number.");
            }
        } while (!done);

        // Fuel efficiency input
        done = false;
        do {
            System.out.print("Enter fuel efficiency in miles per gallon: ");
            if (in.hasNextDouble()) {
                fuelEfficiency = in.nextDouble();
                in.nextLine();
                done = true;
            } else {
                trash = in.nextLine();
                System.out.println("Invalid input: " + trash);
                System.out.println("Please enter a valid number.");
            }
        } while (!done);

        // Price per gallon input
        done = false;
        do {
            System.out.print("Enter price per gallon of gas: ");
            if (in.hasNextDouble()) {
                pricePerGallon = in.nextDouble();
                in.nextLine();
                done = true;
            } else {
                trash = in.nextLine();
                System.out.println("Invalid input: " + trash);
                System.out.println("Please enter a valid number.");
            }
        } while (!done);

        // Calculations
        double costFor100Miles = (100 / fuelEfficiency) * pricePerGallon;
        double distanceOnFullTank = gallonsInTank * fuelEfficiency;

        // Output
        System.out.println("Cost to drive 100 miles: $" + costFor100Miles);
        System.out.println("Distance the car can go on a full tank: " + distanceOnFullTank + " miles");
    }
}
