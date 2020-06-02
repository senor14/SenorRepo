package algorithm.programmers.level1;

import java.util.*;

public class Mock_Exam_42840 {

	public static void main(String[] args) {
		
		First_Place fp = new First_Place();
		int[] answers1 = {1,3,2,4,2};
		// answer1: {1,2,3,4,5} / {1,3,2,4,2}
		
		int[] result = fp.solution(answers1);
		
		for(int i=0; i<result.length; i++)
		{
			if(i==0)
			System.out.print("[" + result[i]);
			else if(i!=result.length-1)
			System.out.print(", " + result[i]);
			else
			System.out.println(", " + result[i] + "]");
		}
	}

}

class First_Place {
    public int[] solution(int[] answers) {
        int[] sp1 = {1,2,3,4,5};
        int[] sp2 = {2,1,2,3,2,4,2,5};
        int[] sp3 = {3,3,1,1,2,2,4,4,5,5};
        
        int[] cnt = new int[3];
        
        for(int i = 0; i < answers.length; i++) {
            if(answers[i] == sp1[i%5]) {
                cnt[0]++;
            }
            if(answers[i] == sp2[i%8]) {
                cnt[1]++;
            }
            if(answers[i] == sp3[i%10]) {
                cnt[2]++;
            }
        }
        
        int winner = cnt[0];
        
        for(int i = 0; i < cnt.length; i++) {
            if(winner < cnt[i]) {
                winner = cnt[i];
            }
        }
        
        List <Integer> win = new ArrayList<>();
        
        for(int i = 0; i < cnt.length; i++)
        {
            if(winner == cnt[i]) {
                win.add(i+1);
            }
        }
        
        int[] answer = {};
        answer = new int[win.size()];
        
        for(int i=0; i<win.size(); i++)
        {
            answer[i] = win.get(i);
        }
        return answer;
    }
}