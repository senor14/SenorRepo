import java.util.*;
public class Codeup1097 {
	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		int[][] array1 = new int[19][19];
		
		for(int i=0; i<19; i++) {
			for(int j=0; j<19; j++) {
				int m = scn.nextInt();
				array1[i][j] = m;
			}
		}
		int l = scn.nextInt();
		for(int i=0; i<l; i++) {
			int ver = scn.nextInt();
			int hor = scn.nextInt();
			for(int j=1; j<=19; j++) {
				if(array1[ver-1][j-1]==0) {
					array1[ver-1][j-1]=1;
				}else {
					array1[ver-1][j-1]=0;
				}
			}
			for(int j=1; j<=19; j++) {
				if(array1[j-1][hor-1]==0) {
					array1[j-1][hor-1]=1;
				}else {
					array1[j-1][hor-1]=0;
				}
			}
		}
		for(int i=0; i<19; i++) {
			for(int j=0; j<19; j++) {
				System.out.print(array1[i][j]+" ");
			}
			System.out.println();
		}
		
	}

}

