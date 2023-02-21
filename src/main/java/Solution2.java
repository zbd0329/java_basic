public class Solution2 {
    public static String solution(String s) {
        String answer = "";
        String[] str = s.split("");

        int idx = 0;
        for (int i = 0; i < str.length; i++) {
            if (str[i].equals(" ")) {
                idx = 0;
            } else if (idx % 2 == 0) {
                str[i] = str[i].toUpperCase();
                idx++;
            } else if (idx % 2 != 0) {
                str[i] = str[i].toLowerCase();
                idx++;
            }
            answer += str[i];
        }

        return answer;
    }

    public static void main(String[] args) {
        Solution2 s = new Solution2();
        System.out.println(s.solution("live the Lidio"));
    }
}



