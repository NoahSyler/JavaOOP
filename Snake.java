
/**
 * @author noahsyler
 *
 *Class Snake extends Reptile
 *	Reptile extends the abstract class Animal 
 *		Animal implements Attributes 
 */
public class Snake extends Reptile
{
	private boolean isVenomous;
	
	/**
	 * Empty Constructor
	 */
	public Snake()
	{
	}
	
	/**
	 * Constructor displaying overloading with different parameters
	 * 
	 * @param color
	 * @param species
	 */
	public Snake(String color, String species)
	{
		super(0, color, species);
	}
	
	/**
	 *Another constructor displaying overloading. This time, with the isVenomous boolean
	 * 
	 * @param color
	 * @param species
	 * @param isVenomous
	 */
	public Snake(String color, String species, boolean isVenomous)
	{
		super(0, color, species);
		this.isVenomous = isVenomous;
	}
	
	/**
	 * Getter for isVenomous
	 * 
	 * @return isVenomous
	 */
	public boolean getIsVenomous() {
		return isVenomous;
	}
	
	/**
	 * Setter for isVenomous
	 * 
	 * @param isVenomous
	 */
	public void setIsVenomous(boolean isVenomous) {
		this.isVenomous = isVenomous;
	}
	
	
	
	/**
	 *Overriding the speak method for the snake class
	 *
	 *@return Sound of the animal
	 *@Override
	 */
	public String speak() {
		return "Hsss!";
	}	
}
