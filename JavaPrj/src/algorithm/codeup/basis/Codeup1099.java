package algorithm.codeup.basis;
import java.util.Scanner;

public class Codeup1099 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int[][] array = new int[10][10];
        for(int i=0; i<10; i++) {
        	for(int j=0; j<10; j++) {
        		array[i][j] = scn.nextInt();
        	}
        }
        int k=1;
        loop:
        for(int i=1; i<9; i++) {
        	for(int j=1; j<=9; j++) {
        		if(array[i][k]==0) {
        			array[i][k]=9;
        		}else if(array[i][k]==1) {
        			k--;
        			break;
        		}else if(array[i][k]==2) {
        			array[i][k]=9;
        			break loop;
        		}
        		k++;
        	}
        	
        }
        	
        for(int i=0; i<10; i++) {
        	for(int j=0; j<10; j++) {
        		System.out.print(array[i][j]+" ");
        	}
        	System.out.println();
        }

    }

}
