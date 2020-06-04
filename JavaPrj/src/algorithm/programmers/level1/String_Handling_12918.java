package algorithm.programmers.level1;

public class String_Handling_12918 {

	public static void main(String[] args) {
		
		StringHandling sh = new StringHandling();
		String s1 = "a234";
		boolean result = sh.solution(s1);
		System.out.println(result);
	}

}

class StringHandling {
    public boolean solution(String s) {
        boolean answer = true;
        for(int i = 0 ; i < s.length() ; i++)
        {
            char ch = s.charAt(i);
            if(s.length() != 4 && s.length() !=6)
                answer = false;
            if((int)ch >= 65 )
                answer = false;
        }
        return answer;
    }
}