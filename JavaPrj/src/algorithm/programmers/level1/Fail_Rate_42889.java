package algorithm.programmers.level1;

import java.util.*;

public class Fail_Rate_42889 {

	public static void main(String[] args) {

		Failrate fr = new Failrate();
		int N1 = 5;
		int[] stages1 = {2,1,2,6,2,4,3,3};
		int[] result = fr.solution(N1, stages1);
		System.out.println(Arrays.toString(result));

	}

}

class Failrate {
    public int[] solution(int N, int[] stages) {
        int count = 0;
		double tot = stages.length;
		double[] fail_rate = new double[N];
		List<Double> fList = new ArrayList<>(); 
		
		for(int i=0; i<N; i++)
		{
			for(int j=0; j<stages.length; j++)
			{
				if(i+1 == stages[j])
				{
					count++;
				}
			}
			if(tot != 0)
			{
				fail_rate[i] = count / tot;
			}
			else
			{
				fail_rate[i] = 0;
			}
			tot -= count;
			count = 0;
			fList.add(fail_rate[i]);
		}
		
		Collections.sort(fList, Collections.reverseOrder());

		int[] answer = new int[N];
		int index = 0;
		count++;
		
		for(int i=0; i<N; i++)
		{
			for(int j=0; j<fList.size(); j++)
			{
				if(fList.get(index) == fail_rate[j])
				{
					
					if(i == 0)
					{
                        fail_rate[j] = -1;
						answer[i] = j + 1;
						break;
					}
					else
					{
						fail_rate[j] = -1;
						answer[i] = j + 1;
						break;
					}
				}
			}

			index++;
		}
        return answer;
    }
}