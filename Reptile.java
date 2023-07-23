
/**
 * @author noahsyler
 *
 *Reptile class will be extended by child classes of Reptile
 */
public class Reptile extends Animal {


	private int legs;
	private String color;
	private String species;

	
	/**
	 * Empty Constructor
	 */
	public Reptile() {
	}
	
	/**
	 * Constructor displaying overloading. 
	 * 	The class can be instantiated with all the parameters, or none of them.
	 * 
	 * @param legs
	 * @param color
	 * @param species
	 */
	public Reptile(int legs, String color, String species) {
		this.legs = legs;
		this.color = color;
		this.species = species;
	}

	/**
	 * getLegs provides the number of legs the reptile has
	 *
	 *@return legs
	 */
	public int getLegs() {
		return this.legs;
	}

	/**
	 * Sets the number of legs for the reptile
	 *
	 *@param legs
	 */
	public void setLegs(int legs) {
		this.legs = legs;
	}

	/**
	 *Provides the color of the reptile
	 *
	 *@return color
	 */
	public String getColor() {
		return this.getColor();
	}

	/**
	 * Sets the color of the reptile
	 *
	 *@param color
	 */
	public void setColor(String color) {
		this.color = color;
	}

	/**
	 *Sets the species of the reptile
	 *
	 *@return species
	 */
	public String getSpecies() {
		return this.species;
	}

	/**
	 * Returns the species of the reptile
	 *
	 *@param species
	 */
	public void setSpecies(String species) {
		this.species = species;
	}

	
	/**
	 * Implementing the speak method from Attributes
	 * 	This needs to be set by the child classes
	 * 
	 * @return null
	 *@Override
	 */
	public String speak() {
		return null;
	}
}
