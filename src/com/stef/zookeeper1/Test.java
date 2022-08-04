package com.stef.zookeeper1;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//create a instance declaring data type 
		Mammal m1 = new Mammal();//instance named M1
		m1.displayEnergy();
		
		Gorilla g = new Gorilla();
		
		Bat batbat = new Bat();
		
		g.throwSomething();
		g.throwSomething();
		g.throwSomething();
		g.eatBananas();
		g.eatBananas();
		g.climb();
		
		
		batbat.attackTown();
		batbat.attackTown();
		batbat.attackTown();
		batbat.eatHumans();
		batbat.eatHumans();
		batbat.fly();
		batbat.fly();
		batbat.displayEnergy();
		
	}
	
	
		
}
