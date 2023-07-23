
/**
 * @author noahsyler
 *
 */
public class Ant extends Insect{

	
	/**
	 * Empty constructor for Ant
	 */
	public Ant() {
	}

	/**
	 * Sets the exoskeleton String for the Ant
	 * 
	 * @param exoskeleton
	 */
	public Ant(String exoskeleton) {
		super(exoskeleton);
	}
	

	/**
	 * Sets the food the ant will feed to the queen
	 * 
	 * @param food
	 * @return
	 */
	public String feedQueen(String food) {
		return String.format("Feeding the queen %s", food);
	}
	
	/**
	 *Provides the Ant sound
	 * 
	 *@return Sound the Ant makes
	 *@Override
	 */
	public String speak() {
		return "Protect the queen!";
	}	
}
