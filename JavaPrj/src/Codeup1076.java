import java.util.*;
public class Codeup1076 {
	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		char a = scn.next().charAt(0);
		int b = 'a';
		do {
			System.out.println((char)b);
			b++;
		}while(b<=(int)a);
		
	}

}

