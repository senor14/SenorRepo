package Algorithm.Programmers.Level1;
import java.util.*;

public class Marathon_42576 {

	public static void main(String[] args) {
		
		Straggler sol = new Straggler();
		String[] participant1 = {"leo", "kiki", "eden"};
		String[] completion1 = {"eden", "kiki"};
		// participant: "leo", "kiki", "eden" 
		//				/ "marina", "josipa", "nikola", "vinko", "filipa"
		//				/ "mislav", "stanko", "mislav", "ana"
		// completion: "eden", "kiki" 
		//				/ "josipa", "filipa", "marina", "nikola"
		//				/ "stanko", "ana", "mislav"
		// return: "leo"  / "vinko" / "vinko"
		String result = sol.solution(participant1, completion1);
		System.out.println(result);

		
	}

}

class Straggler {
    public String solution(String[] participant, String[] completion) {
        Arrays.sort(participant);
        Arrays.sort(completion);
        int i;
        for(i=0; i < completion.length; i++)
        {
            if(!participant[i].equals(completion[i]))
            {
                return participant[i];
            }     
        }
        return participant[i];
    }
}