package mobilePackage;

public class TestMemoryCard {

	public static void main(String[] args) {
		Mobile Objref1 = new Mobile("Samsung s8",256,"in Memory Card Slot1","Memory Card Slot2");
		MemoryCard Objref2 = new MemoryCard(64,128);
		Objref1.memorycard = Objref2;
		System.out.println(Objref1.getMobileName()+" with "+Objref1.getStorageCapacity()+"GB default storage comes with bonus offer either:");
		System.out.println();
		System.out.println("Offer 1: "+Objref1.memorycard.getMemoryCard1()+"GB memory card to use in "+Objref1.getMemoryCardSlot1());
		System.out.println(" ---------------- or ----------------- ");
		System.out.println("Offer 2: "+Objref1.memorycard.getMemoryCard2()+"GB memory card to use in "+Objref1.getMemoryCardSlot2());
	}

}
