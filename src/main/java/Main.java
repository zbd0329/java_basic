//public class Main {
//    public int solution(int num) {
//        int answer = 0;
//        int don4 = 0;
//
//        int don = 1000 - num;
//        int don2 = don / (int)100;
//        int don3 = don - 100*don2;
//        if(don3 > 50){
//            don4 = 1+((don3-50)/10);
//        } else{
//            don4 = don3/10;
//        }
//        answer = don2 + don4;
//
//
//        return answer;
//    }
//
//    public static void main(String[] args) {
//        Main method = new Main();
//        int num1 = 160;
//        System.out.println(method.solution(num1));
//    }
//}

////////2번/////
public class Main {
    public int solution(String s) {
        int answer = 0;
        int num = 0; //answer에 넣어주기 위해 for문 밖에 변수를 선언
            for (int i = 0; i < s.length(); i++){
            if(s.charAt(i) == 'O'){ //charAt은 i번째 문자열을 받아올 수 있다.
                num = num+1; // num++; //실수하지 않게 조심하기
            } else {
                num = 0; //문자열 'O'가 아니면 x. 숫자를 계속 더하면 앞에것까지 더해지기 때문에 0으로 만든다.
            }
            answer += num;
        }
        return answer;
    }

    public static void main(String[] args) {
        Main method = new Main();
        String s = "OXOOOXXXOXOOXOOOOOXO";
        System.out.println(method.solution(s));
    }
}














