package algorithm.codeup.basis;
import java.util.*;
public class Codeup1068 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		long a = scn.nextInt();
		if(a>=90 && a<=100) {
			System.out.println("A");
		}else if(a>=70 && a<90) {
			System.out.println("B");
		}else if(a>=40 && a<70) {
			System.out.println("C");
		}else {
			System.out.println("D");
		}
	}

}

