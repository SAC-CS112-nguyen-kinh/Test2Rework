package test2Rework;
import java.util.Scanner;

public class Test 
{
	public static void main(String[] args) 
	{ 
		Scanner input = new Scanner(System.in); 
		int numberOfDice; 
	  
	 	
	 	boolean again = true; 
	 	
	 	Dice game = new Dice(); 
	 	while (again) 
	 	{ 
	 		System.out.printf("Enter number of dice: "); 
			numberOfDice = input.nextInt(); 
			
	 		int diceRolled = game.rollDice(numberOfDice); 
	
	 		Automobile auto1 = new Automobile(2016, "Ford", "Truck", "white", "Trucky", 3); 
	 		Automobile auto2 = new Automobile(2016, "Toyota", "Van", "green", "Vany", 4); 
	 		Automobile auto3 = new Automobile(2016, "Honda", "Sport Car", "red", "Sporty", 6); 
	 
	 		int counter = 0; 
	 		while (counter != diceRolled) { 
				auto1.setOperatingCyle(diceRolled); 
	 			auto1.currentGear(3); 
	 			
	 			auto2.setOperatingCyle(diceRolled); 
				auto2.currentGear(4); 
				
				auto3.setOperatingCyle(diceRolled); 
	 			auto3.currentGear(5); 
	 			
	 			counter++; 
	 			} 
	 
	 		auto1.displayAuto(); 
	 		System.out.printf("Current speed: %d\n", auto1.currentSpeed()); 
	 		System.out.printf("Distance traveled: %d\n\n", auto1.distanceTravel()); 
	 
	 		auto2.displayAuto(); 
	 		System.out.printf("Current speed: %d\n", auto2.currentSpeed()); 
	 		System.out.printf("Distance traveled: %d\n\n", auto2.distanceTravel()); 
	 
	 		auto3.displayAuto(); 
	 		System.out.printf("Current speed: %d\n", auto3.currentSpeed()); 
	 		System.out.printf("Distance traveled: %d\n\n", auto3.distanceTravel()); 
	 
	 		System.out.printf("\nEnter 1 to run again: "); 
	 		int playAgain = input.nextInt(); 
	 		if (playAgain != 1) 
	 			again = false; 
	 	} 
	 } 
} 



