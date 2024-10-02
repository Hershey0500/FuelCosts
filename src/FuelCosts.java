import java.util.Scanner;

public class FuelCosts {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double gallons = 0, mpg = 0, pricePerGallon = 0;
        String trash = "";
        boolean validInput = false;

        // Gallons of gas
        do {
            System.out.print("Enter gallons of gas in the tank: ");
            if (in.hasNextDouble()) {
                gallons = in.nextDouble();
                in.nextLine(); // clear buffer
                validInput = true;
            } else {
                trash = in.nextLine();
                System.out.println("Invalid input: " + trash);
                System.out.println("Please enter a valid number.");
            }
        } while (!validInput);

        // Fuel efficiency
        validInput = false;
        do {
            System.out.print("Enter fuel efficiency (mpg): ");
            if (in.hasNextDouble()) {
                mpg = in.nextDouble();
                in.nextLine(); // clear buffer
                validInput = true;
            } else {
                trash = in.nextLine();
                System.out.println("Invalid input: " + trash);
                System.out.println("Please enter a valid number.");
            }
        } while (!validInput);

        // Price per gallon
        validInput = false;
        do {
            System.out.print("Enter price of gas per gallon: ");
            if (in.hasNextDouble()) {
                pricePerGallon = in.nextDouble();
                in.nextLine(); // clear buffer
                validInput = true;
            } else {
                trash = in.nextLine();
                System.out.println("Invalid input: " + trash);
                System.out.println("Please enter a valid number.");
            }
        } while (!validInput);

        // Calculations
        double costFor100Miles = (100 / mpg) * pricePerGallon;
        double distanceWithFullTank = gallons * mpg;

        System.out.printf("Cost to drive 100 miles: $%.2f\n", costFor100Miles);
        System.out.printf("Distance you can drive with a full tank: %.2f miles\n", distanceWithFullTank);
    }
}
