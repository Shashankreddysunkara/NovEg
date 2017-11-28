package mobilePackage;

public class MemoryCard {
	private int memoryCard1;
	private int memoryCard2;
	//default constructor
	public MemoryCard(){
		
	}
	public MemoryCard(int memoryCard1, int memoryCard2) {
		
		this.memoryCard1 = memoryCard1;
		this.memoryCard2 = memoryCard2;
	}
	public int getMemoryCard1() {
		return memoryCard1;
	}
	public void setMemoryCard1(int memoryCard1) {
		this.memoryCard1 = memoryCard1;
	}
	public int getMemoryCard2() {
		return memoryCard2;
	}
	public void setMemoryCard2(int memoryCard2) {
		this.memoryCard2 = memoryCard2;
	}
	
}
