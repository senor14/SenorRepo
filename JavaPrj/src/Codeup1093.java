import java.util.*;
public class Codeup1093 {
	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int[] array1 = new int[23];
		for(int i=0; i<23; i++) {
			array1[i] = 0;
		}
		for(int i=0; i<n; i++) {
			int a = scn.nextInt();
			array1[a-1] += 1;
		}
		for(int j=0; j<23; j++) {
			System.out.print(array1[j]+" ");
		}
	}

}
