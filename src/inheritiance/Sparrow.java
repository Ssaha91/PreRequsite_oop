package inheritiance;

public class Sparrow extends Chicken {
	
	String sounds;
	int numberOfScales;
	
	public int high(int numberOfScales ) {
		System.out.println("It has " + numberOfScales + " scales");
		return numberOfScales;
	
	}
	public String noise(String sounds) {
		System.out.println("This bird make " + sounds);
		return sounds;
		
	}
	public String getSounds() {
		return sounds;
	}
	public int getNumberOfScales() {
		return numberOfScales;
	}
	public void setSounds(String sounds) {
		this.sounds = sounds;
	}
	public void setNumberOfScales(int numberOfScales) {
		this.numberOfScales = numberOfScales;
	}
	

}
