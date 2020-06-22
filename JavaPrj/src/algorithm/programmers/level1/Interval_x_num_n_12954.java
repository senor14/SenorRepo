package algorithm.programmers.level1;

import java.util.Arrays;

public class Interval_x_num_n_12954 {

	public static void main(String[] args) {
		
		Intervalxnumn ixvn = new Intervalxnumn();
		int x1 = 2;
		int n1 = 5;
		long[] result = ixvn.solution(x1, n1);
		System.out.println(Arrays.toString(result));

	}

}

class Intervalxnumn {
	 public long[] solution(int x, int n) {
	        
	        if(x == 0)
	        {
	            return new long[n];
	        }

	        long[] answer = new long[n];
	        
	        for (long i = 0; i < n; i++)
	        {
	            answer[(int)i] = (i + 1) * x;
	        }

	        return answer;
	    }
	}