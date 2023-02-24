public class Practice_0223_01 {
    //코딩테스트 연습용 기본 폼으로 이용 가능. 어떻게 구현되는지는 나중에 깨닫는 날이 오겠지-
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
//charAt(i)에 대해서 좀 더 알아보기
