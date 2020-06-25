package algorithm.programmers.level1;

import java.util.Arrays;

public class Budget_12982 {

	public static void main(String[] args) {

		Budget bg = new Budget();
		int[] d1 = {1,3,2,5,4};
		int budget1 = 9;
		int result = bg.solution(d1, budget1);
		System.out.println(result);

	}

}

class Budget {
    public int solution(int[] d, int budget) {
        int count = 0;
        
        Arrays.sort(d);
        
        for(int i = 0; i < d.length; i++)
        {
            if(budget >= d[i])
            {
                budget -= d[i];
                count++;
            }
            else
            {
               break; 
            }
        }
        return count;
    }
}