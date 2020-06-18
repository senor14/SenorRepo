package algorithm.programmers.level1;

public class Average {

	public static void main(String[] args) {
		Aver av = new Aver();
		int[] arr1 = {1,2,3,4};
		double result = av.solution(arr1);
		System.out.println(result);

	}

}

class Aver {
    public double solution(int[] arr) {
        double answer = 0;
        int sum = 0;
        for(int i=0; i<arr.length; i++)
        {
            sum += arr[i];
        }
        answer = (double)sum / arr.length;
        return answer;
    }
}