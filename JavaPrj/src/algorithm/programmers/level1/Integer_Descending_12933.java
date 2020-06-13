package algorithm.programmers.level1;

import java.util.*;

public class Integer_Descending_12933 {

	public static void main(String[] args) {

		Integerdescending id = new Integerdescending();
		long n1 = 118372;
		long result = id.solution(n1);
		System.out.println(result);

	}

}

class Integerdescending {
  public long solution(long n) {
      String a = "" + n;
      String[] b = a.split("");
      Arrays.sort(b);
      Collections.reverse(Arrays.asList(b));
      long c = Long.parseLong(String.join("",b));
      return c;
  }
}