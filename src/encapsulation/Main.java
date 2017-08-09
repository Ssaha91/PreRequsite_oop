package encapsulation;

public class Main {

	public static void main(String[] args) {
		Person saha = new Person();
		saha.setEthnicity("Bangladesh");
		System.out.println(saha.getEthnicity());
		saha.setEyeColor("Brown");
		System.out.println("Saha has eye color " + saha.getEyeColor());
	}

}
