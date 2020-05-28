package Algorithm.Programmers.Level1;

public class KAKAO_Claw_Crane_Game {

	public static void main(String[] args) {
		
		Solution sol = new Solution();
		int[][] board1 = {{0,0,0,0,0},{0,0,1,0,3},{0,2,5,0,1},{4,2,4,4,2},{3,5,1,3,1}};
		int[] moves1 = {1,5,3,5,1,2,1,4}; 
		int result = sol.solution(board1, moves1);
		System.out.println(result);
	}

}

class Solution {
	public int solution(int[][] board, int[] moves) {
        
        int result = 0;
        int k = 0;
        int[] basket = new int[moves.length];
        
        for(int i=0; i<moves.length; i++)
        {
            for(int j=0; j<board.length; j++)
            {
                if(board[j][moves[i]-1]!=0)
                {
                    basket[k]=board[j][moves[i]-1];
                    board[j][moves[i]-1]=0;
                    
                    if(k>0 && basket[k]==basket[k-1])
                    {
                        basket[k-1]=0;
                        basket[k]=0;
                        k -= 2;
                        result += 2;
                    }   
                k++;
                break;
                } 
            }  
        }
        return result;
    }
}
