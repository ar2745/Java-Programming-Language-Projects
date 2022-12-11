
public class House {
	
	void building() {
		System.out.println("The building is a duplex");
	}
}
class Duplex extends House {
	
	void rooms() {
		System.out.println("There are eight rooms in the duplex");
	}
}
class Appliances extends Duplex {
	
	void gadgets()
	{
		System.out.println("The gadgets in the rooms are very beautiful too");
	}
}
class Estate {
	
	public static void main(String[] args) {
		Appliances home = new Appliances();
		home.building();
		home.rooms(); 
		home.gadgets();
	}

}
