package algorithm.codeup.basis;
import java.util.*;

public class Codeup1027 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String a = scn.next();
		String[] b = a.split("\\.");
		
		System.out.printf("%02d-%02d-%04d",Integer.parseInt(b[2]),Integer.parseInt(b[1]),
				Integer.parseInt(b[0]));

	}

}
