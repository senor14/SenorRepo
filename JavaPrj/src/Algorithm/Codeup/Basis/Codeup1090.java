package Algorithm.Codeup.Basis;
import java.util.*;
public class Codeup1090 {
	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		long a = scn.nextLong();
		long r = scn.nextLong();
		long n = scn.nextLong();
		long num = a;
		for(int i=1; i<n; i++) {
			num *= r;
		}
		System.out.println(num);
	}

}

