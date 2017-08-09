package polymorphism;

public class Main {

	public static void main(String[] args) {
		Area area1 = new Area();
		System.out.println(area1.calcuArea(3));
		area1.calcuArea(5, 5);
		area1.calcuArea(5, 5, 1.5);
		SahaArea area2 = new SahaArea();
		area2.calcuArea(5, 5);
		
	}

}
