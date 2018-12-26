/**
 * 
 * @author frank
 *
 */

import java.io.Serializable;

public abstract class Building implements Consumer, Serializable {

	private String name;
	private int power;
	
	public Building(String name, int power) {//Constructor
		this.name = name;
		this.power = power;
	}
	
	public String getName() {// Function to get name
		return name;
	}
	
	public int getPower() {// Function to get power
		return power;
	}
	
	public abstract void morePower(int amount) throws NotAPowerGeneratorException;// function to set more power
	
	protected void setPower(int amount) {// Function to set power
		this.power = amount;
	}
	
	public static void testBuilding() {
		//leave it blank
	}
}