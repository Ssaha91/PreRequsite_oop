package inheritiance;

public class Main {

	public static void main(String[] args) {
		Chicken ch = new Chicken();
		System.out.println(ch.legs);
		
		ch.setName("Mou");
		System.out.println(ch.name);
		
		Sparrow sp = new Sparrow();
		sp.setName("Sompa");
		System.out.println(sp.getName());
		//Bird br = new Bird();
		sp.setNumberOfScales(2);
		System.out.println(sp.getNumberOfScales());

	}

}
