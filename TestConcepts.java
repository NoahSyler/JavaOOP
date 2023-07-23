public class TestConcepts {

	public static void main(String[] args) {
		
		//The arguments passed here are for color, species, and isVenomous		
		Snake snake1 = new Snake("brown", "corn snake", false);
		Snake snake2 = new Snake("black", "king snake", false);
		
		//The arguments passed here are for legs, color, species, and isStray 
		Dog dog1 = new Dog(4, "black", "lab", false);
		Dog dog2 = new Dog(4, "blonde", "retriever", false);
		
		
		//The only constructor for Ant is empty
		Ant ant1 = new Ant();
		
		
	}

}
