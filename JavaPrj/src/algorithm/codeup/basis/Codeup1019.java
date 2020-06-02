package algorithm.codeup.basis;
import java.util.Scanner;

public class Codeup1019 {

	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		String str = scn.next();
		String[] arr = str.split("\\.");
		int A = Integer.valueOf(arr[0]);
		int B = Integer.valueOf(arr[1]);
		int C = Integer.valueOf(arr[2]);
		System.out.printf("%04d.%02d.%02d", A, B, C);
	}

}

