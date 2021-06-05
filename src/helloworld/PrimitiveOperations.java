package helloworld;

public class PrimitiveOperations {
	public static void main (String[] args) {
		int number1 = 5;
		float number2 = 5;
		System.out.println(number1);
		System.out.println(number2);
		double number3 = (double)number1;
		System.out.println(number3);
		int number4 = (int)number2;
		System.out.println(number4);
		char digit1 = 'M';
		System.out.println(digit1);
		System.out.println ((char)(digit1 + 32));
	}
}