package oopsPackage;

public class AreaTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cylinder c = new Cylinder(2,6);
		c.calcCylinderArea();
		System.out.println("circle area = " + c.getCircleArea());
		System.out.println("circumference of circle = "+ c.getRectangle());
		System.out.println("Cylinder area = " + c.getCylinderArea());
	}

}
