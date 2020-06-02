package algorithm.codeup.basis;
import java.util.*;
public class Codeup1087 {
	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		long n = scn.nextLong();
		long s = 0;
		for(int i=1;;i++) {
			s += i;
			if(s>=n) {
				break;
			}
				
		}
		System.out.println(s);
	}

}

