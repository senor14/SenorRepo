package algorithm.programmers.level1;

public class Collatz_Conjecture_12943 {

	public static void main(String[] args) {
		Collatzconjecture cc = new Collatzconjecture();
		int num1 = 626331;
		int num2 = 6;
		int num3 = 16;
		int result = cc.solution(num1);
		System.out.println(result);
		result = cc.solution(num2);
		System.out.println(result);
		result = cc.solution(num3);
		System.out.println(result);

	}

}

class Collatzconjecture {
    public int solution(int num) {
        long n = num;
        int count = 0;
        while(true)
        {
            if(n != 1)
            {
                if(n % 2 == 0)
                {
                    n /= 2;
                    count++;
                }
                else
                {
                    n = n * 3 + 1;
                    count++;
                }
            }
            else
            {
                return count;
            }
            
            if(count == 500)
            {
                return -1;
            }
            else if(n == 1)
            {
                break;
            }
                
        }
        return count;
    }
}