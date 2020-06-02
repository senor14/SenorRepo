package algorithm.programmers.level1;

public class Arraypynum {

	public static void main(String[] args) {
		
		Pynum pyn = new Pynum();
		String s1 = "pPoooyY";
		boolean result = pyn.solution(s1);
		System.out.println(result);

	}

}

class Pynum {
    boolean solution(String s) {
        boolean answer = true;
        int pnum=0;
        int ynum=0;
        s=s.toLowerCase();
        for(int i=0; i<s.length(); i++) {
            if(s.charAt(i)=='p') {
                pnum++;
            }
            else if(s.charAt(i)=='y') {
                ynum++;
            }
        }
        if(pnum!=ynum) {
            answer = false;
        }
        

        return answer;
    }
}