package oopsPackage;

public class Addition {
	int a;
	int b;
	float a1;
	float b1;
	
	Addition(){
		//default constructor
	}
Addition(int a,int b,float a1, float b1){
	
	//parameterised constructor
this.a=a;
this.b=b;
this.a1=a1;
this.b1=b1;
}

void add(){
	//add method
	System.out.println(a+b);
}

void add(int x, int y){
	//overloading add method
System.out.println(x+y);
}

void add(float x, float y){
	//overloading add method
	System.out.println(x+y);
}
}
