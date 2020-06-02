package algorithm.codeup.basis;
import java.util.*;
public class Codeup1088 {
	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		long n = scn.nextLong();
		for(int i=1; i<=n; i++) {
			if(i%3==0) {
				continue;
			}
			System.out.println(i);
		}
	}

}

