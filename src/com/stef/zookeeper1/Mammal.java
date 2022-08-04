package com.stef.zookeeper1;



//Create a Mammal class that has an energyLevel member variable
// and displayEnergy() method.
// The displayEnergy() method should show the animal's energy level as well as
// return it.


public class Mammal {
    protected int energyLevel;// this is an attribute

    //constructor
    public Mammal() {
        this.energyLevel = 100;
    }
    		//method
    public void displayEnergy() {
        System.out.println("nivel de energia: " + energyLevel);
   
    }//setter
    public void setEnergyLevel(int energyLevel) {
        this.energyLevel = energyLevel;
    }//getter
    public int getEnergyLevel() {
        return energyLevel;
    }
}
