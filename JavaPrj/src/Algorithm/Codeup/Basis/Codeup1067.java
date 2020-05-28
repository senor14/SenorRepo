package Algorithm.Codeup.Basis;
import java.util.*;
public class Codeup1067 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		long a = scn.nextInt();
		if(a<0) {
			System.out.println("minus");
			if(a%2==0) {
				System.out.println("even");
			}else {
				System.out.println("odd");
			}
		}else if(a>0) {
			System.out.println("plus");
			if(a%2==0) {
				System.out.println("even");
			}else {
				System.out.println("odd");
			}
		}
	}

}

