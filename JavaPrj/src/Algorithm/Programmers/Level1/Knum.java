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
        
        //array1�� commands�� ���Һ��� ����� ���� ������� ����
        //array2�� array1�� ����� ������ k�� �ش�Ǵ� ���� ������� ����
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

//ArrayList�� ����� �ش�Ǵ� �迭�� �ִ� ���� �������
