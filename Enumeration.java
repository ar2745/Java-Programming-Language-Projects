
	class Shoes {
		enum ShoeType{Male, Female, Kids}
		ShoeType type;
	}
	
public class Enumeration {

	public static void main(String[] args) {
		Shoes niceshoes = new Shoes();
		niceshoes.type = Shoes.ShoeType.Male;
		System.out.println("Type: " + niceshoes.type);

	}

}
