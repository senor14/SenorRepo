package algorithm.programmers.level1;

import java.util.Arrays;

public class Natural_Number_Array_12932 {

	public static void main(String[] args) {

		NaturalNumberArray nna = new NaturalNumberArray();
		long n1 = 12345;
		int[] result = nna.solution(n1);
		System.out.println(Arrays.toString(result));

	}

}

class NaturalNumberArray {
    public int[] solution(long n) {
        
        String a = "" + n;
        String[] nat = a.split("");
        int[] answer = new int[nat.length];
        int k = nat.length;
        
        for(int i = 0; i < nat.length; i++)
        {
            answer[i] = Integer.parseInt(nat[k-1]);
            k--;
        }
        return answer;
    }
}