package com.stef.zookeeper1;



//Create a separate class Gorilla that can throwSomething(), eatBananas(), and climb()

//static means to not go outside the class
public class Gorilla extends Mammal {
	

			

	//method
	public void throwSomething() {
	   this.setEnergyLevel(this.getEnergyLevel() -5);
	   System.out.println("acabei de jogar algo em voce ");
	   System.out.println("energy level: " + this.getEnergyLevel());
	    }
	public void eatBananas() {
		this.setEnergyLevel(this.getEnergyLevel() +10 );
	System.out.println("eu amo banana ");
	System.out.println("energy level: " + this.getEnergyLevel());
	}
	public void climb() {
		this.setEnergyLevel(this.getEnergyLevel() -10 );
		System.out.println("i climbed ");
		System.out.println("nivel de energia: " + this.getEnergyLevel());
	}
		
	
}


