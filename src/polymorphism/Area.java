package polymorphism;

public class Area {
	// squre
	public double calcuArea(double num) {
		double answer = num * num;
		return answer;	
	}
	//rectangle
	public double calcuArea(double lenght, double width) {
		double answer = lenght * width;
		System.out.println("The are of your rectangle is " + answer);
		return answer;
	}
	//right triangle
	public double calcuArea(double base, double height, double half) {
		double answer = base * height * .5;
		System.out.println("The are of your triagnle is " + answer);
		return answer;
	}
	

}
