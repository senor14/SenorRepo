package algorithm.programmers.level1;

public class Seoul_Kim_12919 {

	public static void main(String[] args) {

		SeoulKim sk = new SeoulKim();
		String[] seoul = {"Jane", "Kim"};
		String result = sk.solution(seoul);
		System.out.println(result);
	}

}

class SeoulKim {
    public String solution(String[] seoul) {
        String answer = "";
        int a=0;
        for(int i=0;i<seoul.length;i++) {
      if(seoul[i].equals("Kim")) {
      a=i;
      }
   }
        String s="김서방은 ";
   StringBuilder sb =new StringBuilder(s);
   sb.append(a);
   sb.append("에 있다");
   answer=sb.toString();
        return answer;
    }
}