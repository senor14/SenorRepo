package algorithm.programmers.level1;

public class Caesar_Password {

	public static void main(String[] args) {
		
		Caesar cs = new Caesar();
		String s1 = "AB";
		int n1 = 1;
		String result = cs.solution(s1, n1);
		System.out.println(result);

	}

}

class Caesar 
{
    public String solution(String s, int n) 
    {
        StringBuffer sb = new StringBuffer();
        
        for(int i = 0 ; i < s.length() ; i++ ) 
        {
            if(Character.isUpperCase(s.charAt(i))) 
            {
                char ch = (char)(((int)s.charAt(i) + n - 65) % 26 + 65);
                
                sb.append(ch);
            }
            else if(Character.isLowerCase(s.charAt(i)))
            {
                char ch = (char)(((int)s.charAt(i) + n - 97) % 26 + 97);
                
                sb.append(ch);
            }
            else
            {
                char ch = s.charAt(i);
                
                sb.append(ch);
            }
        }
        return sb.toString();
    }
}