package oopsPackage;

public class Bicycle {
	int speed;
	int gear;
	int increment;
	int decrement;
	Bicycle(int speed,int gear,int increment,int decrement){
		this.speed=speed;
		this.gear=gear;
		this.increment=increment;
		this.decrement=decrement;
	}
	  void speedUp(int increment) {
	         speed = speed + increment;   
	    }

	    void applyBrakes(int decrement) {
	         speed = speed - decrement;
	    }
	    void info(){
	    	System.out.println("number of gears :" + gear + "speed is:" + speed);
	    }

}
  class MountainBike extends Bicycle{

	
	
	public MountainBike(int speed, int gear, int increment, int decrement) {
		super(speed, gear, increment, decrement);
		
	}

	void info(){
		 super.speedUp(increment);
		 
		 System.out.println("this a Mountain bike");
	    	System.out.println("number of gears :" + gear + " speed is: " + speed);
	    }

	}
 class RoadBike extends Bicycle{

	
	 RoadBike(int speed, int gear, int increment, int decrement) {
		super(speed, gear, increment, decrement);
		
	}

	void info(){
		super.applyBrakes(decrement);
		 System.out.println("this is a road bike");
	    	System.out.println("number of gears : " + gear + " speed is: " + speed);
	    }

	}
 class TandemBike extends Bicycle{

	
	 TandemBike(int speed, int gear, int increment, int decrement) {
		super(speed, gear, increment, decrement);
		
	}

	void info(){
		 System.out.println("ths is a tandem bike");
	    	System.out.println("number of gears : " + gear + " speed is: " + speed);
}
}
