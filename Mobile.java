package mobilePackage;

public class Mobile {
	//fields
	private String mobileName;
	public int storageCapacity;
	private String memoryCardSlot1;
	private String memoryCardSlot2;
	MemoryCard memorycard;
	//default constructor
	public Mobile(){
		
	}
	//parameterized constructor 
	public Mobile(String mobileName, int storageCapacity, String memoryCardSlot1, String memoryCardSlot2) {
		this.mobileName = mobileName;
		this.storageCapacity = storageCapacity;
		this.memoryCardSlot1 = memoryCardSlot1;
		this.memoryCardSlot2 = memoryCardSlot2;
	}

	int getStorageCapacity() {
		return storageCapacity;
	}
	public void setStorageCapacity(int storageCapacity) {
		this.storageCapacity = storageCapacity;
	}
	public String getMemoryCardSlot1() {
		return memoryCardSlot1;
	}
	public void setMemoryCardSlot1(String memoryCardSlot1) {
		this.memoryCardSlot1 = memoryCardSlot1;
	}
	public String getMemoryCardSlot2() {
		return memoryCardSlot2;
	}
	public void setMemoryCardSlot2(String memoryCardSlot2) {
		this.memoryCardSlot2 = memoryCardSlot2;
	}
	String getMobileName() {
		return mobileName;
	}
	public void setMobileName(String mobileName) {
		this.mobileName = mobileName;
	}
}
