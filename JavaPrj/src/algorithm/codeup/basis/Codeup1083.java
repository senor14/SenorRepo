package algorithm.codeup.basis;
import java.util.*;
public class Codeup1083 {
	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		int a = scn.nextInt();
		for(int i=1; i<=a; i++) {
			if(i%3==0) {
				System.out.println("X");
				continue;
			}
			System.out.println(i);
		}
	}

}

