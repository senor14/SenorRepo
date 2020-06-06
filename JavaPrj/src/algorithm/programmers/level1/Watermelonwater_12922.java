package algorithm.programmers.level1;

public class Watermelonwater_12922 {

	public static void main(String[] args) {

		Subak sb = new Subak();
		int n = 3;
		String result = sb.solution(n);
		System.out.println(result);

	}

}

class Subak {
    public String solution(int n) {
        StringBuilder sb = new StringBuilder();
        for(int i=1; i<=n; i++) {
            if(i%2==1){
                sb.append("수");           
            }else {
                sb.append("박");
            }
        }
        String answer = sb.toString();
        return answer;
    }
}
// class Subak {
//     public String solution(int n) {
//         String answer = "";
//         String sb1 = "수";
//         String sb2 = "박";
//         for(int i=1; i<=n; i++) {
//             if(i%2==1){
//                 answer += sb1;             
//             }else {
//                 answer += sb2;
//             }
//         }
//         return answer;
//     }
// }