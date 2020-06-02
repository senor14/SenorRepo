package Algorithm.Programmers.Level1;

public class Two_Sum {

	public static void main(String[] args) {

		Twosum ts = new Twosum();
		int a1 = 3;
		int b1 = 5;
		long result = ts.solution(a1, b1);
		System.out.println(result);

	}

}

class Twosum {
	  public long solution(int a, int b) {
	      long answer = 0;
	      if(a<b){
	          for(int i = a; a<=b;a++) {
	              answer += a;
	          }
	      }
	      else if(a>b) {
	          for(int i = b; b<=a; b++) {
	              answer += b;
	          }
	      }
	      else {
	          return a; 
	      }
	      return answer;
	  }
	}