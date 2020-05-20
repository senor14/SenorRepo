import java.util.*;
public class Codeup1078 {
	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		long a = scn.nextInt();
		long b = 1;
		long total = 0;
		do {
			if(b%2==0) {
			total += b; 
			}
			b++;
		}while(b<=a);
		System.out.println(total);
	}

}

