package oopsPackage;

public class TestBicycle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
MountainBike m= new MountainBike(100, 3, 20, 50);
		
		m.info();
		RoadBike r= new RoadBike(80,3,35,67);
		r.info();
		TandemBike t= new TandemBike(90,2,66,34);
		t.info();
	}

}
