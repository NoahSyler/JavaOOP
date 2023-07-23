/**
 * 
 * @author noahsyler
 * 07/22/2023
 * 
 *This class extends Arthropod, which implements Attributes
 */

public class Insect extends Arthropod{
	private String exoskeleton;
	
	/**
	 * Constructor with no arguments
	 * 
	 */
	public Insect() {
	}
	
	/**
	 * Constructor with one argument
	 * 
	 * @param exoskeleton
	 */
	public Insect(String exoskeleton) {
		this.exoskeleton = exoskeleton;
	}

	/**
	 * Setter for the variable exoskeleton
	 * 
	 * @param exoskeleton
	 */
	public void setExoskeleton(String skeleton) {
		skeleton = this.exoskeleton;
	}
	
	/**
	 * Getter for the variable exoskeleton
	 * 
	 * @return exoskeleton
	 */
	public String getExoskeleton() {
		return this.exoskeleton;
	}

	@Override
	public String speak() {
		return null;
	}
}
