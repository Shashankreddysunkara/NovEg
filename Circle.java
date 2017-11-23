package oopsPackage;

public abstract class Circle {
	 protected double circleRadius;
	    protected double rectangle;
	    protected double circleArea;
	    
	    public Circle(double newRadius) {
	    	circleRadius = newRadius;
		}
		
	    abstract void calcRectangle();
	    abstract void calcCircleArea();
	    public String values() {
	    	return("Circumference = " + rectangle + "Area = " + circleArea);
	    	}
}

class Cylinder extends Circle {
	private double cylinderHeight;
   
   private double cylinderArea;
   private double circleArea;
   private double rectangle;
   public Cylinder(double newRad, double newHeight) {
   	super(newRad);
	cylinderHeight = newHeight;
	}
	
	void calcRectangle() {
		
		rectangle = 2.0f*Math.PI*circleRadius;	
	}
	public double getRectangle() {
   	return(rectangle);
	}   
	
	
	void calcCircleArea() {
		
		circleArea = Math.PI*circleRadius*circleRadius;	
	}
	public double getCircleArea() {
   	return(circleArea);
	}  
	
	public void calcCylinderArea() {
   	calcCircleArea();
	calcRectangle();
	cylinderArea = (2*circleArea)+(rectangle*cylinderHeight);
   	}
	public double getCylinderArea() {
   	return(cylinderArea);
}
}