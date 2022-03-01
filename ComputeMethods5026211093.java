import java.util.Random;

public class ComputeMethods5026211093 {
	public static void main(String[] args) {
		Temperature temperature = new Temperature ();
		Random r = new Random();
		int number1 = 1 + r.nextInt(6);
		int number2 = 1 +r.nextInt(6);
		int sum = number1 + number2;
		double fTemp = 100.4;
		double height = 8;
		double base = 6;
		double hypotenuse = Math.sqrt(height * height + base * base);
		double cTemp = temperature.toCelcius (fTemp);
	}	
	
	public double toCelcius(double f) {
		double c;
		c = (f - 32.0) / 1.8;
		return c;
	}

	public static double hypotenuse(int height, int base) {
		double hypotenuse = Math.sqrt(height * height + base * base);
		return hypotenuse;
	}
	
	public int roll(int number1, int number2) {
		int sum = number1 + number2;
		return sum;
	}
}