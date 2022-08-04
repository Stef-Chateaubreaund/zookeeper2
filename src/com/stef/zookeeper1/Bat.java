package com.stef.zookeeper1;

	public class Bat extends Mammal {
		
		protected int energyLevel;
		
		
		public Bat() {
			super.energyLevel = 300;
		}
		//methods
		
		public void fly() {
			System.out.println("vrummmmm");
			this.setEnergyLevel(this.getEnergyLevel() - 50);
			   System.out.println("energy level hehehhe: " + this.getEnergyLevel());
		}
		public void eatHumans() {
			System.out.println("inhaiiiiiiii");
			this.setEnergyLevel(this.getEnergyLevel() + 25);
		}
		public void attackTown() {
			System.out.println("I am batman");
			this.setEnergyLevel(this.getEnergyLevel() - 100);
		}

	}



