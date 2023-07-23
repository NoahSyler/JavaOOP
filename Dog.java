
/**
 * @author noahsyler
 *
 *This class extends Mammal
 *	Mammal extends Animal
 *		Animal implements Attribute
 */
public class Dog extends Mammal
{
	//Unique attribute for a dog, not shared by other animals
	private boolean isStray;
	
	/**
	 * Empty method
	 */
	public Dog()
	{
	}
	
	/**
	 * Constructor with all the arguments as options form the super class
	 * 
	 * @param legs
	 * @param color
	 * @param species
	 */
	public Dog(int legs, String color, String species)
	{
		super(legs, color, species);
	}
	
	/**
	 * Constructor with all the arguments as options
	 * 
	 * @param legs
	 * @param color
	 * @param species
	 * @param isStray
	 */
	public Dog(int legs, String color, String species, boolean isStray)
	{
		super(legs, color, species);
		this.isStray = isStray;
	}
	
	/**
	 * Provides isStray
	 * 
	 * @return isStray
	 */
	public boolean isStray() {
		return isStray;
	}
	
	/**
	 * Sets isStray
	 * 
	 * @param isStray
	 */
	public void setStray(boolean isStray) {
		this.isStray = isStray;
	}
	

	/**
	 * Provides the animal sound
	 * 
	 *@return Sound of the animal
	 *@Override
	 */
	public String speak() {
		return "Bark, bark!";
	}	
}
