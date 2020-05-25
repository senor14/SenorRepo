import java.util.*;
public class Codeup1094 {
	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int[] array1 = new int[n];
		for(int i=0; i<n; i++) {
			int num = scn.nextInt();
			array1[i] = num;
		}
		for(int i=n-1; i>=0; i--) {
			System.out.print(array1[i]+" ");
		}
	}

}

