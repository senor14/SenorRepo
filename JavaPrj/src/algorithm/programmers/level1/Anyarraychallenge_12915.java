package algorithm.programmers.level1;
import java.util.*;

public class Anyarraychallenge_12915 {

	public static void main(String[] args) {
		
		Anyarrch aac = new Anyarrch();
		String[] strings1 = {"sun", "bed", "car"};
		int n1 = 1;
		String[] result = aac.solution(strings1, n1);
		
		for(int i=0; i<result.length; i++)
		{
			if(i==0)
			System.out.print("[" + result[i]);
			else if(i!=result.length-1)
			System.out.print(", " + result[i]);
			else
			System.out.println(", " + result[i] + "]");
		}
	}

}


class Anyarrch {
  public String[] solution(String[] strings, int n) {
      
      for(int i = 0; i < strings.length; i++) {
          strings[i] = strings[i].charAt(n) + strings[i];
      }
      Arrays.sort(strings);
      String[] ans = new String[strings.length];
      for(int i = 0; i < strings.length; i++) {
          ans[i] = strings[i].substring(1);
      }
      return ans;
      
  }
}