package algorithm.programmers.level1;
import java.util.*;

public class Hate_Same_Number {

	public static void main(String[] args) {
		
		Distinct dis = new Distinct();
		int[] arr = {1,1,3,3,0,1,1};
		int[] result = dis.solution(arr);
		
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

class Distinct {
    public int[] solution(int []arr) {
        List<Integer> list1 = new ArrayList<>();
        for(int i=0; i<arr.length; i++){
            list1.add(arr[i]);
            for(;;){
                if(i==arr.length-1) {
                    break;
                }
                if(arr[i]==arr[i+1]) {
                    if(i==arr.length-1){
                        break;
                    }
                    i++;
                }
                else{
                    break;
                }
            }
            
        }
		int[] answer = new int[list1.size()];
        for(int i=0; i<list1.size(); i++) {
        	answer[i]=list1.get(i);
        }
        return answer;
    }
}