package InheritanceWithFood;

public class Apples {
	
	public static void main(String[] args){
		Food[] someFood = new Food[2];
		
		someFood[0] = new Tuna();
		someFood[1] = new Potpie();
		
		for(int i=0;i<2;i++){
			someFood[i].eat();
		}
	}
}
