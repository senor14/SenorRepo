import java.util.*;
public class Codeup1092 {
	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		long a = scn.nextLong();
		long b = scn.nextLong();
		long c = scn.nextLong();
		
		for(int day=1; day<=a*b*c; day++) {
			if(day%a==0 && day%b==0 && day%c==0) {
				System.out.println(day);
				break;
			}
		}
	}

}
