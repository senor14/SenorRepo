import java.util.*;
public class Codeup1091 {
	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		long a = scn.nextLong();
		long m = scn.nextLong();
		long d = scn.nextLong();
		long n = scn.nextLong();
		long num = a;
		for(int i=1; i<n; i++) {
			num = num*m+d;
		}
		System.out.println(num);
	}

}

