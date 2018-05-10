
public class Animals {

	private String name = "Animal";
	
	//accessible to any class
	public String favFood = "Food";
	
	//could also be setter (setName)
	protected final void changeName(String name){
		this.name = name;
	}
	
	protected final String getName(){
		return this.name;
	}
	
	public void eatStuff(){
		System.out.println("Yum" + favFood);
	}
	
	public void walkAround(){
		System.out.println(this.name + " walks around");
	}
	
	public Animals(String name, String favFood){
		this.changeName(name);
		this.favFood = favFood;
	}

	public Animals() {}
}
