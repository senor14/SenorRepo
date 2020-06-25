package algorithm.programmers.level1;

import java.util.Arrays;

public class Secret_Map_17681 {

	public static void main(String[] args) {
		Secretmap sm = new Secretmap();
		int n1 = 5;
		int[] arr11 = {9,20,28,18,11};
		int[] arr22 = {30,1,21,17,28};
		String[] result = sm.solution(n1, arr11, arr22);
		System.out.println(Arrays.toString(result));
	}

}

class Secretmap {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        
        int[] arr3 = new int[n];
		String[] answer = new String[n];
		
		for(int i = 0; i < n; i++)
		{
			arr3[i] = arr1[i] | arr2[i];
			answer[i] =  Integer.toBinaryString(arr3[i])
                .replace("1", "#")
                .replace("0", " ");
			while(answer[i].length() < n)
			{
				answer[i] = " " + answer[i];
			}
			
		}
        return answer;
    }
}