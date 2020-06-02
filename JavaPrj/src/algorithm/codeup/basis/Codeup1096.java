package algorithm.codeup.basis;
import java.util.*;
public class Codeup1096 {
	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int[] array1 = new int[n];
		
		for(int i=0; i<n; i++) {
			int m = scn.nextInt();
			array1[i] = m;
		}
		int m = array1[0];
		for(int j=0; j<n; j++) {
			if(m > array1[j]) {
				m = array1[j];
			}
		}
		System.out.println(m);
	}

}
