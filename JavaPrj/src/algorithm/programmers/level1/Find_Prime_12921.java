package algorithm.programmers.level1;

public class Find_Prime_12921 {

	public static void main(String[] args) {

		FindPrime fp = new FindPrime();
		int n1 = 10;
		int result = fp.solution(n1);
		System.out.println(result);

	}

}

class FindPrime {
	  public int solution(int n) {
	      int answer = 0;
	      for(int i=2; i<=n; i++)
	      {
	          boolean isPrime = true;
	          for(int j=2; j*j<=i; j++)
	          {
	              if(i%j==0)
	              {
	                  isPrime = false;
	                  break;
	              }
	          }
	          if(isPrime)
	          { 
	              answer++;
	          }
	      }
	      return answer;
	  }
	}