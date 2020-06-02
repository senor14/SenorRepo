package algorithm.codeup.basis;
import java.util.*;

public class Codeup1025 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String a = scn.next();
		String[] b = a.split("");
		for(int i=0; i<b.length; i++) {
			System.out.println("[" + Integer.parseInt(b[i])*10000/(int)Math.pow(10, i) + "]");	
		}
		
	}

}

