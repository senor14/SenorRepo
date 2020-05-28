package Algorithm.Codeup.Basis;
import java.util.*;
public class Codeup1093 {
	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int[][] array1 = new int[19][19];
		
		for(int i=0; i<19; i++) {
			for(int j=0; j<19; j++) {
				array1[i][j] = 0;
			}
		}
		for(int i=0; i<n; i++) {
			int ver = scn.nextInt();
			int hor = scn.nextInt();
			array1[ver-1][hor-1] = 1;
		}
		for(int i=0; i<19; i++) {
			for(int j=0; j<19; j++) {
				System.out.print(array1[i][j]+" ");
			}
			System.out.println();
		}
	}

}
