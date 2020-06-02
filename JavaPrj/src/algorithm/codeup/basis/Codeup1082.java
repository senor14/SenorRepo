package algorithm.codeup.basis;
import java.util.*;
public class Codeup1082 {
	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		String a = scn.next();
		int b = Integer.valueOf(a, 16);
		for(int i=1; i<16; i++) {
			System.out.printf("%s*%H=%H\n",a,i,b*i);
		}
	}

}

