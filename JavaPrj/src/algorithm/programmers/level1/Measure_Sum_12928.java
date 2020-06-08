package algorithm.programmers.level1;

public class Measure_Sum_12928 {

	public static void main(String[] args) {

		Measuresum ms = new Measuresum();
		int n1 = 12;
		int result = ms.solution(n1);
		System.out.println(result);

	}

}

class Measuresum {
	  public int solution(int n) {
	      int answer = 0;
	      for(int i=1; i<=n; i++) {
	          if(n%i==0) {
	              answer += i;
	          }
	      }
	      return answer;
	  }
}