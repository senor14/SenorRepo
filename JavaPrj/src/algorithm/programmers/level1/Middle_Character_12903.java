package algorithm.programmers.level1;

public class Middle_Character_12903 {

	public static void main(String[] args) {
		
		MidChar mc = new MidChar();
		String s1 = "abcde";
		String result = mc.solution(s1);
		
		System.out.println(result);

	}

}

class MidChar {
	  public String solution(String s) {
	     String answer = "";
	     int leng = s.length();
	     int a = leng/2;
	     if(leng%2==1){
	         answer = s.substring(a,a+1);
	     }else{
	         answer = s.substring(a-1,a+1);
	     }
	     return answer;
	  }
	}