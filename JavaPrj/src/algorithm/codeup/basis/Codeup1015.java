package algorithm.codeup.basis;
import java.util.Scanner;

public class Codeup1015 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		double a = scn.nextDouble();
		double b = (Math.round(a*100))/100.0;
		System.out.printf("%.2f", b);
	}
}

