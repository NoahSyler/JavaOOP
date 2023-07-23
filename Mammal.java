
/**
 * @author noahsyler
 *
 *The class Mammal will be extended by child classes of Mammal
 */
public class Mammal extends Animal{
	

	private int legs;
	private String color;
	private String species;
	
	/**
	 * 
	 */
	public Mammal() {
	}

	/**
	 * @param legs
	 * @param color
	 * @param species
	 */
	public Mammal(int legs, String color, String species) 
	{
		this.legs = legs;
		this.color = color;
		this.species = species;
		
	}
	

	/**
	 *
	 */
	public int getLegs() {
		return this.getLegs();
	}

	/**
	 *
	 */
	public void setLegs(int legs) {
		this.legs = legs;
	}

	/**
	 *
	 */
	public String getColor() {
		return this.getColor();
	}

	/**
	 *
	 */
	public void setColor(String color) {
		this.color = color;
	}

	/**
	 *
	 */
	public String getSpecies() {
		return this.species;
	}

	/**
	 *
	 */
	public void setSpecies(String species) {
		this.species = species;
	}

	
	/**
	 *
	 *@Override
	 */
	public String speak() {
		return null;
	}

}
