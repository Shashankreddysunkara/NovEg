package oopsPackage;

public class Order {

String CustomerName;
String ItemName;
int price;
int discount;
 Order(){
	//default constructor
}
   Order(String Customername, String ItemName, int price, int discount){
	   //Parameterized constructor
	   
	  this.CustomerName=Customername;
	  this.ItemName=ItemName;
	  this.price=price;
	  this.discount=discount;
	 
  }
 
  
  public void orderProcess(boolean PlaceOrder){
	  //to continue to purchase the item
	  
	  if(PlaceOrder){
		  
		  System.out.println("order placed successfully");
	  }
	  else
	  {
		  
		  System.out.println("order is not placed");
	  }
	    
  }
 public void calPrice(int ItemPrice){
	 System.out.println("price of the item to be purchased is:$"+ ItemPrice);
	 
 }
 public void calPrice(int ItemPrice, int discount) {
	 ItemPrice= ItemPrice-discount;
	 System.out.println("price of the item after discount is:$"+ ItemPrice);
 }
  
}

