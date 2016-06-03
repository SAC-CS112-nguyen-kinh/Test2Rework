package test2Rework;

public class Automobile
{
	private String make; 
 	private String model; 
 	private String color; 
 	private String name;
	private int year; 
	private int numberOfGears; 
	private int operatingCycle; 
	private int currentGear; 
	private int currentSpeed; 
	 
	public Automobile(int year, String make, String model, String color, String name, int numberOfGears)
	{ 
		this.year	= year; 
		this.make 	= make; 
		this.model 	= model; 
	 	this.color 	= color; 
 		this.name 	= name; 
	 	this.numberOfGears = numberOfGears; 
	} 
	
	public void setOperatingCyle(int num) 
	{ 
		operatingCycle = num; 
	} 
	 	 
	public void currentGear(int num) 
	{ 
		currentGear = num; 
	} 
	 	 
	public int currentSpeed() 
	{ 
		currentSpeed = currentGear * 10; 
		return currentSpeed; 
	} 
	 	 
	public int distanceTravel() 
	{ 
		return operatingCycle * (currentSpeed/60); 
	} 
	 	 
	public void displayAuto()
	{ 
	 	System.out.printf( "Year: " + year + "\nMake: " + make + "\nModel: " + model + "\nColor: " 
	 			+ color + "\nName: " + name + "\nGears: " + numberOfGears + "\n"); 
	} 
} 


