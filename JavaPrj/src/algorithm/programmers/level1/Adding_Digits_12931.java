package algorithm.programmers.level1;
import java.util.*;

public class Adding_Digits_12931 {

	public static void main(String[] args) {
		
		AddDigit ad = new AddDigit();
		int n1 = 123;
		int result = ad.solution(n1);
		System.out.println(result);

	}

}

class AddDigit {
    public int solution(int n) {
        
        String nat = "" + n;
        int answer = 0;
        
        for(int i=0; i<nat.length(); i++)
        {
            if(i==nat.length()-1)
            {
                answer += Integer.parseInt(nat.substring(i));
            }
            else
            {
                answer += Integer.parseInt(nat.substring(i,i+1));
            }
        }
        return answer;
    }
}