package Algorithm.Programmers.Level1;
import java.util.*;

public class Knum {

	public static void main(String[] args) {
		
		Karry kry = new Karry();
		int[] array1 = {1, 5, 2, 6, 3, 7, 4};
		int[][] commands1 = {{2, 5, 3}, {4, 4, 1}, {1, 7, 3}};
		int[] result = kry.solution(array1, commands1);

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



class Karry {
    public int[] solution(int[] array, int[][] commands) {
        
        //array1은 commands의 원소별로 저장될 값을 순서대로 담음
        //array2는 array1에 저장된 값에서 k에 해당되는 값을 순서대로 담음
        List<Integer> array1 = new ArrayList<>();
        List<Integer> array2 = new ArrayList<>();
        
        for(int i = 0; i < commands.length; i++)
        {
            for(int j = commands[i][0]-1; j < commands[i][1]; j++)
            {
                array1.add(array[j]);
                if(j == commands[i][1]-1)
                {
                    array1.sort(null);
                    array2.add(array1.get(commands[i][2]-1));
                    array1.clear();
                }    
            }        
        }
        int[] answer = new int[array2.size()];
        int size = 0;
        
        for(int a : array2)
        {
            answer[size++] = a;
        }   
        return answer;
    }
}

//ArrayList를 만들고 해당되는 배열에 있는 값을 집어넣음
