package mobilePackage;

public class Mobile {
	//fields
	private String mobileName;
	public int storageCapacity;
	private String memoryCardSlot_SDHC;
	private String memoryCardSlot_SD;
	MemoryCard memorycard;
	//default constructor
	public Mobile(){
		
	}
	//parameterized constructor 
	public Mobile(String mobileName, int storageCapacity, String memoryCardSlot_SDHC, String memoryCardSlot_SD) {
		this.mobileName = mobileName;
		this.storageCapacity = storageCapacity;
		this.memoryCardSlot_SDHC = memoryCardSlot_SDHC;
		this.memoryCardSlot_SD = memoryCardSlot_SD;
	}

	int getStorageCapacity() {
		return storageCapacity;
	}
	public void setStorageCapacity(int storageCapacity) {
		this.storageCapacity = storageCapacity;
	}
	public String getMemoryCardSlot_SDHC() {
		return memoryCardSlot_SDHC;
	}
	public void setMemoryCardSloT_SDHC(String memoryCardSlot_SDHC) {
		this.memoryCardSlot_SDHC = memoryCardSlot_SDHC;
	}
	public String getMemoryCardSlot_SD() {
		return memoryCardSlot_SD;
	}
	public void setMemoryCardSlot_SD(String memoryCardSlot_SD) {
		this.memoryCardSlot_SD = memoryCardSlot_SD;
	}
	String getMobileName() {
		return mobileName;
	}
	public void setMobileName(String mobileName) {
		this.mobileName = mobileName;
	}
}
