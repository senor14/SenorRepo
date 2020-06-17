package algorithm.programmers.level1;

import java.util.Arrays;

public class Gcd_Lcm {

	public static void main(String[] args) {

		Gcdlcm gl = new Gcdlcm();
		int n1 = 3;
		int m1 = 12;
		int[] result = gl.solution(n1, m1);
		System.out.println(Arrays.toString(result));

	}

}

class Gcdlcm {
    public int[] solution(int n, int m) {
        int[] sol = new int[2];
        int a=0;

        for(int i = (n <= m) ? n : m; i >= 1; i--)
        {
            if(n % i == 0 && m % i == 0)
            {
                sol[0] = i;
                a=i;
                break;
            }
            else if(i == 1)
            {
                sol[0] = 1;
                a=1;
                break;
            }    
        }
        sol[1]=n*m/a;
        // for(int i = (n >= m) ? n : m; i <= n * m; i++)
        // {
        //     if(i % n == 0 && i % m == 0)
        //     {
        //         sol[1] = i;
        //         break;
        //     }
        // }
        return sol;
    }
}