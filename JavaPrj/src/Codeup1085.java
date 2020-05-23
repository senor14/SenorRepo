import java.util.*;
public class Codeup1085 {
	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		double h = scn.nextDouble();
		double b = scn.nextDouble();
		double c = scn.nextDouble();
		double s = scn.nextDouble();
		double B = h*b*c*s/8;
		double KB = B/1024;
		double MB = KB/1024;
		System.out.printf("%.1f MB",MB);
	}

}

