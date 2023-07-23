public class TestConcepts {

	public static void main(String[] args) {
		Attributes[] creatures = new Attributes[5];
		//The arguments passed here are for color, species, and isVenomous		
		creatures[0] = new Snake("brown", "corn snake", false);
		creatures[1] = new Snake("black", "king snake", false);
		
		//The arguments passed here are for legs, color, species, and isStray 
		creatures[2] = new Dog(4, "black", "lab", false);
		creatures[3] = new Dog(4, "blonde", "retriever", false);
		
		
		//The only constructor for Ant is empty
		creatures[4] = new Ant();
		//creatures[5] = new Ant();
		for(Attributes creature : creatures) {
			if(creature instanceof Animal) {
				System.out.print(((Animal) creature).getSpecies()+" ");
			}
			else {
				System.out.print(creature.getClass()+" ");
			}
			System.out.println(creature.speak());
		}
	}

}
