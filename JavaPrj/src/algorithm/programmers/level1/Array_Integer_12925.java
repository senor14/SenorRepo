package algorithm.programmers.level1;

public class Array_Integer_12925 {

	public static void main(String[] args) {
		Arrayinteger ai = new Arrayinteger();
		String s1 = "1234";
		String s2 = "-1234";
		int result1 = ai.solution(s1);
		int result2 = ai.solution(s2);
		System.out.println(s1 + " " + s2);

	}

}

class Arrayinteger {
    public int solution(String s) {
        int answer = 0;
        for(int i = 0; i < s.length(); i++)
        {
            if(s.charAt(0) == '-')
            {
                answer = Integer.parseInt(s.substring(1))*-1;
            }
            else if(s.charAt(0) == '+')
            {
                answer = Integer.parseInt(s.substring(1));
            }
            else
            {
                answer = Integer.parseInt(s);
            }
        }
        return answer;
    }
}