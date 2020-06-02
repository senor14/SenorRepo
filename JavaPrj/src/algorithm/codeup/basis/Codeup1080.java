package algorithm.codeup.basis;
import java.util.*;
public class Codeup1080 {
	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		long a = scn.nextLong();
		long total = 0;
		int b=0;
		for(int i=1; i<=1000; i++) {
			total += i;
			if(total>=a) {
				b=i;
				break;
			}
		}
		System.out.println(b);
		
	}

}
