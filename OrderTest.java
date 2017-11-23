package oopsPackage;

public class OrderTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Order order = new Order("Shashank Reddy","IPhone",1000,50);
		System.out.println(order.CustomerName+" has ordered an "+order.ItemName);
		order.calPrice(1000);
		order.calPrice(1000,50);
		order.orderProcess(true);
	}
}

