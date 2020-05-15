import java.util.*;
public class Codeup1035 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String a = scn.nextLine();
		int b = Integer.valueOf(a, 16);
		String c = Integer.toOctalString(b);
		System.out.println(c);

	}

}

