import java.util.Scanner;

public class CalculateMPG {

	/**
	 * Prompts user for the amount of miles their vehicle traveled and returns the amount of miles
	 * @param input - the Scanner object to read keyboard for amount of miles
	 * @return - the amount of miles traveled by the vehicle
	 */
	public static double distanceTraveled(Scanner input){
		System.out.println("How many miles are traveled? Enter miles traveled, then press enter");
		double milesTraveled = input.nextDouble();
		return milesTraveled;
	}

	/**
	 * Prompts user for the amount of gasoline used on a drive by the vehicle
	 * @param input - the Scanner object to read keyboard for amount of gasoline used
	 * @return - the amount of gallons consumed by the vehicle
	 */
	public static double gallonsConsumed(Scanner input){
		System.out.println("How many gallons have been consumed? Enter gallons consumed, then press enter");
		double gallonsConsumed = input.nextDouble();
		return gallonsConsumed;
	}

	/**
	 * Returns the fuel economy based on dividing the miles by the amt of fuel consumed
	 * @param miles - the amount of miles driven by the vehicle
	 * @param fuelConsumed - the amount of gasoline used by the vehicle
	 * @return - return the fuel economy of the car rounded to two decimals
	 */
	public static double fuelEconomy(double miles, double fuelConsumed){
		return miles / fuelConsumed;
	}

	public static void main(String[] args) {
		boolean correctInput = false; //correctInput is a flag for my while control loop.
		while (correctInput == false){ //this while loop exits if the user enters in correct information
			try { //handling exceptions of input mismatch
				Scanner input = new Scanner(System.in); //create scanner object to take input from user
				double milesTraveled = distanceTraveled(input); //store miles traveled
				double gallonsConsumed = gallonsConsumed(input); //store gallons consumed

				//PROGRAM OUTPUT
				System.out.println("Miles Traveled: ");
				System.out.println(milesTraveled);
				System.out.println("Gallons Consumed: ");
				System.out.println(gallonsConsumed);
				System.out.println("Average MPG " + fuelEconomy(milesTraveled, gallonsConsumed));
				correctInput = true; //flip flag if everything is executed properly and exit while loop
				input.close();
			} catch (Exception e) {
				System.out.println("Enter a double or an integer please...");
				correctInput = false; //keep the flag false and loop back to give it another shot
			}
		}
	}

}
