package oopsPackage;

interface IBicycle {
	void gearChange(int value);
	 void speedUp(int increment);

	    void applyBrakes(int decrement);

}

class AtlasBicycle implements IBicycle{

	int speed=10;
	int gear=0;
	
	public void gearChange(int value) {
		
	gear=value;	
	}

	public void speedUp(int increment) {
		speed=speed+increment;
		System.out.println("the speed is: "+ speed);

	}

	
	public void applyBrakes(int decrement) {
		int speed=10;
		speed=speed-decrement;
		System.out.println("speed is: "+ speed);
	}
	 
	void details(){
		System.out.println("the gear value is: "+ gear);
	}
}
