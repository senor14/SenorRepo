package algorithm.programmers.level1;

public class Even_Odd_12937 {

	public static void main(String[] args) {
		Evenodd eo = new Evenodd();
		int num1 = 3;
		String result = eo.solution(num1);
		System.out.println(result);

	}

}

class Evenodd {
    public String solution(int num) {
        String answer = "";
        if(num%2==0)
        {
            answer = "Even";
        }
        else
        {
            answer = "Odd";
        }
        return answer;
    }
}