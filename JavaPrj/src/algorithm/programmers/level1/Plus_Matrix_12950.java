package algorithm.programmers.level1;

import java.util.Arrays;

public class Plus_Matrix_12950 {

	public static void main(String[] args) {

		Plusmatrix pm = new Plusmatrix();
		int[][] arr11 = {{1,2},{2,3}};
		int[][] arr22 = {{3,4},{5,6}};
		int[][] result = pm.solution(arr11, arr22);

	}

}

class Plusmatrix {
    public int[][] solution(int[][] arr1, int[][] arr2) {
        int[][] answer = new int[arr1.length][arr1[0].length];
        for(int i = 0; i < arr1.length; i++)
        {
            for(int j = 0; j < arr1[0].length; j++)
            {
                answer[i][j] = arr1[i][j] + arr2[i][j];
            }
        }
        return answer;
    }
}