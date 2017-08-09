package polymorphism;

public class SahaArea extends Area {
	public double calcuArea(double lenght, double width) {
		double answer = lenght * width - 2;
		System.out.println("The are of your rectangle is " + answer);
		return answer;
	}
	

}
