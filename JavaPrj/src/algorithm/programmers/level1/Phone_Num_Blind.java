package algorithm.programmers.level1;

public class Phone_Num_Blind {

	public static void main(String[] args) {
		
		Phonenumblind pnb = new Phonenumblind();
		String phone_number1 = "01033334444";
		String result = pnb.solution(phone_number1);
		System.out.println(result);

	}

}

class Phonenumblind {
    public String solution(String phone_number) {
        String answer = "";
        int pnl = phone_number.length();
        StringBuilder sb = new StringBuilder();
        
        for(int i=0; i<pnl-4; i++)
        {
            sb.append("*");
        }
        sb.append(phone_number.substring(pnl-4));
        answer = sb.toString();
        return answer;
    }
}