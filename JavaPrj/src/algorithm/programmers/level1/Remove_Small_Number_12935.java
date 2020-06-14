package algorithm.programmers.level1;

import java.util.ArrayList;
import java.util.Arrays;

public class Remove_Small_Number_12935 {

	public static void main(String[] args) {
		
		Removesmallnumber rsn = new Removesmallnumber();
		int[] arr1 = {4,3,2,1};
		int[] result = rsn.solution(arr1);
		System.out.println(Arrays.toString(result));
	}

}

class Removesmallnumber {
    public int[] solution(int[] arr) {
        ArrayList<Integer> li = new ArrayList<Integer>();
        int min = 0;
        if(arr.length == 1)
        {
            int[] answer = {-1};
            return answer;
        }
        else
        {
            for(int i=0; i<arr.length; i++)
            {
                if(i==0)
                {
                    min = arr[0];
                    li.add(arr[0]);
                }
                else if(min < arr[i])
                {
                    li.add(arr[i]);
                }
                else //if(min > arr[i])
                {
                    min = arr[i];
                    li.add(arr[i]);                  
                }
                // else
                // {
                //     li.add(arr[i]);
                //     min = arr[i];
                // }
                // if(i==arr.length-1)
                // {
                //     while(li.contains(min))
                //     {
                //         li.remove(min);
                //     }
                // }
            }
            // for(int i = 0; i<li.size(); i++)
            // {
            //     System.out.println(li.get(i));
            // }

            while(li.contains(min))
            {
                li.remove((Integer)min);
            }

            int[] answer = new int[li.size()];
            for(int i=0; i<li.size(); i++)
            {
                answer[i] = li.get(i);
                //System.out.println(answer[i]);
            }
            return answer;
        }
       
    }
}
