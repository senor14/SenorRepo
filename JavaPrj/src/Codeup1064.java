import java.util.*;

public class Codeup1064 {

	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		
		long a = scn.nextInt();
		long b = scn.nextInt();
		long c = scn.nextInt();
		
		System.out.println((a<b ? a:b)<c ? (a<b ? a:b):c);

	}

}

