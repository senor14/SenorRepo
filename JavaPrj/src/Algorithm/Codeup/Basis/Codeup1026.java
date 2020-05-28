package Algorithm.Codeup.Basis;
import java.util.*;

public class Codeup1026 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String a = scn.next();
		String[] b = a.split(":");
		for(int i=0; i<b.length; i++) {
			if(b[i].equals("00")) {
			b[i] = "0";
			}
		}
		System.out.println(b[1]);
	}

}
