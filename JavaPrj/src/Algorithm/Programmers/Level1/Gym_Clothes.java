package Algorithm.Programmers.Level1;

import java.util.ArrayList;
import java.util.List;

public class Gym_Clothes {

	public static void main(String[] args) {

		PEnum pen = new PEnum();
		int n1 = 5;
		int[] lost1 = {2, 4};
		int[] reserve1 = {1, 3, 5};
		int result = pen.solution(n1, lost1, reserve1);
		System.out.println(result);
	}

}

class PEnum {
    public int solution(int n, int[] lost, int[] reserve) {
        
        int answer = 0;
        int lostLen = lost.length;
        List<Integer> losts = new ArrayList<>();
        List<Integer> res = new ArrayList<>();
        
        for(int a : lost) {
            losts.add(a);
        }
        for(int a : reserve) {
            res.add(a);
        }
        
        answer = n - lostLen;
        //answer = 5 - 2
        
        //���ϸ��� ���
        for(int i = 0; i < losts.size(); i++) {
            for(int j = 0; j < res.size(); j++) {
                if(res.get(j) == losts.get(i)) {
                    res.remove(j);
                    losts.remove(i);
                    i--;
                    //i=0�϶� �����Ǹ� index���� �ϳ��� ������⶧����
                    //�ٲ� ù index������ �˻��Ϸ��� i�� �ϳ� �ٿ������
                    answer += 1;
                    break;
                    //���� ������ �л��� ���ϸ��� ��� ����
                }
            }
        }
        //�����ִ� ���
        for(int i = 0; i < losts.size(); i++) {
            for(int j = 0; j < res.size(); j++) {
                if(losts.get(i) - 1 == res.get(j)
                   || losts.get(i) + 1 == res.get(j)) {
                    res.remove(j);
                    answer += 1;
                    break;
                }
            }
        }
        
    return answer;    
    }
    
}