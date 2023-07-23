/**
 * @author noahsyler
 * 04/05/2023
 * CPSC 1110 25722
 * 
 *This class demonstrates the usage of an interface class
 */

public abstract class Animal implements Attributes
{
	public Animal() {
	}
	
	abstract public int getLegs();

	abstract public void setLegs(int legs);

	abstract public String getColor();

	abstract public void setColor(String color);

	abstract public String getSpecies();

	abstract public void setSpecies(String species);
}
