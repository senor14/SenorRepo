package Algorithm.Codeup.Basis;
import java.util.*;
public class Codeup1086 {
	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		double w = scn.nextDouble();
		double h = scn.nextDouble();
		double b = scn.nextDouble();
		double whb = w*h*b;
		double whb_1 = w*h*b/8;
		double whb_2 = whb_1/1024;
		double whb_3 = whb_2/1024;
		System.out.printf("%.2f MB",whb_3);
	}

}

