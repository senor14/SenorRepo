package algorithm.programmers.level1;

public class Harshad_Num_12947 {

	public static void main(String[] args) {

		Harshadnum hn = new Harshadnum();
		int x1 = 10;
		int x2 = 11;
		int x3 = 12;
		int x4 = 13;
		boolean result = hn.solution(x1);
		System.out.println(result);
		result = hn.solution(x2);
		System.out.println(result);
		result = hn.solution(x3);
		System.out.println(result);
		result = hn.solution(x4);
		System.out.println(result);

	}

}

class Harshadnum {
    public boolean solution(int x) {
        boolean answer = true;
        String xleng = x + "";
        int arr = 0;
        for(int i=1; i<=xleng.length(); i++)
        {
            arr += (x / (int)Math.pow(10, i-1)) % 10;  
        }
        if(x % arr != 0)
        {
            answer = false;
        }
        return answer;
    }
}