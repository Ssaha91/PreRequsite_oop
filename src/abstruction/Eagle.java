package abstruction;

public abstract class Eagle implements Bird  {
	
	int numberOfLegs;
	
	public abstract void sleep();
	
	public void makeNoise() {
		System.out.println("Eagle makes noise EEEEE ");
	}

}
