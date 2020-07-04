package algorithm.programmers.level2;

import java.util.Arrays;

public class Top_42588 {

	public static void main(String[] args) {

		Top top = new Top();
		int[] heights1 = {6,9,5,7,4};
		int[] result = top.solution(heights1);
		System.out.println(Arrays.toString(result));

	}

}

class Top {
    public int[] solution(int[] heights) {
        
        int[] answer = new int[heights.length];
        
		for(int i=0; i<heights.length; i++)
		{
			if(i==0)
			{
				answer[i] = 0;
			}
			else
			{
				for(int j=i; j>=0; j--)
				{
					if(heights[i]<heights[j])
					{
						answer[i] = j+1;
						break;
					}
					else
					{
						answer[i] = 0;
					}
				}
			}

		}
        return answer;
    }
}