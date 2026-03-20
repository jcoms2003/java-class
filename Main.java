import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		
		System.out.println("Hello");
		int x = 120;
		int y = 10;
		if (x > y) {
			System.out.println("X is greater than Y");
		}
		else if (y > x) {
			System.out.println("Y is greater than X");
		}
		else {
			System.out.println("X is equal to Y");
		}
		int result = add(x, y);
		System.out.println("The result of adding X and Y is: " + result);
	}
	public static int add(int a, int b) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the first number: ");
		a = input.nextInt();
		System.out.print("Enter the second number: ");
		b = input.nextInt();
		int sum = a + b;
		System.out.println("The sum of " + a + " and " + b + " is: " + sum);
		return sum;
	}

}