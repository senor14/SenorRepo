package algorithm.programmers.level1;

public class Strange_Character_12930 {

	public static void main(String[] args) {
		Strangecharacter sc = new Strangecharacter();
		String s1 = "try hello world";
		String result = sc.solution(s1);
		System.out.println(result);

	}

}

class Strangecharacter {
	  public String solution(String s) {
	      String answer = "";
	      String[] str = s.split("");
	      int cnt = 0;
	      
	      for(int i=0; i<str.length; i++)
	      {
	          if(str[i].equals(" "))
	          {
	              answer += str[i];
	              cnt = 0;
	          }
	          else
	          {
	              if(cnt % 2 == 0)
	              {
	                  answer += str[i].toUpperCase();
	                  cnt++;
	              }
	              else
	              {
	                  answer += str[i].toLowerCase();
	                  cnt++;
	              }
	          }
	      }
	      return answer;
	  }
	}