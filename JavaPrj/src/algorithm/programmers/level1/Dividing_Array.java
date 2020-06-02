package algorithm.programmers.level1;
import java.util.*;

public class Dividing_Array {

	public static void main(String[] args) {
		
		DivArr da = new DivArr();
		int[] arr1 = {5,9,7,10};
		int divisor1 = 5;
		int[] result = da.solution(arr1, divisor1);
		
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


class DivArr {
  public int[] solution(int[] arr, int divisor) {
        
      List<Integer> list1 = new ArrayList<>();
      
      for(int i=0; i<arr.length; i++) {
          if(arr[i]%divisor==0)    {
              list1.add(arr[i]);
          }
      }
      if(list1.isEmpty()){
          list1.add(-1);
      }
      list1.sort(null);
      int[] sol = new int[list1.size()];
      for(int i=0; i<list1.size(); i++) {
          sol[i] = list1.get(i);
      }
      return sol;
      
  }
}