package Algorithm.Codeup.Basis;
import java.util.*;
public class Codeup1098 {
	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		int w = scn.nextInt();
		int h = scn.nextInt();
		int[][] array1 = new int[w][h];
		int n = scn.nextInt();
		for(int i=0; i<w; i++) {
			for(int j=0; j<h; j++) {
				array1[i][j] = 0;
			}
		}
		for(int i=0; i<n; i++) {
			int l = scn.nextInt();
			int d = scn.nextInt();
			int x = scn.nextInt();
			int y = scn.nextInt();
			if(d==0) {
				for(int j=y; j<y+l; j++){
					array1[x-1][j-1]=1;
					}
	
			}else{
				for(int j=x; j<x+l; j++) {
					array1[j-1][y-1]=1;
					}
				}
		}
		for(int i=0; i<w; i++) {
			for(int j=0; j<h; j++) {
				System.out.print(array1[i][j]+" ");
			}
			System.out.println();
		}
	
	}
}

