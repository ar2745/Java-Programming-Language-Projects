
public class Player {
	
	private String name;
	private int number;
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getNumber() {
		return number;
	}
	
	public void setNumber(int number) {
		this.number = number;
	}

	public static void main(String[] args) {
		Player write = new Player();
		write.setName("Christiano Ronaldo");
		write.setNumber(7);
		
		System.out.println("His name is " + write.getName() + " and his number is " + write.getNumber());

	}

}
