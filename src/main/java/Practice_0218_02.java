import java.util.Scanner;
public class Practice_0218_02 {
    //코딩테스트 연습용 기본 폼으로 이용 가능. 어떻게 구현되는지는 나중에 깨닫는 날이 오겠지-
    public static void main(String[] args) {
        // 별찍기 문제
        System.out.println("*을 출력할 라인의 수를 입력하세요.>");
        Scanner scanner = new Scanner(System.in);
        String tmp = scanner.nextLine();
        int num = Integer.parseInt(tmp); //scanner로 들어온 정보는 string 형태이다. 그러므로 int로 형변환해줘야한다.
        //int로 형변환하는 매서드 Integer.parseInt(변수)를 사용하여 형 변환해줌.



        for (int j = 0; j <= num - 1; j++) { //몇줄을 만들것인지 결정하는 1번 for문이다.
            {
                for (int i = 0; i <= j; i++) //거기에 별을 몇개 넣을 것인지 결정하는 2번 for문이다.
                    System.out.print("*"); // 별을 프린트한다. 이때 ln은 쓰지 않는다.
            }
            System.out.println(); //1번 for문을 만들고 줄바꿈을 해준다. 1번 for문은 아직 끝나지 않았다.
        }
    }
}

// index는 0부터 시작한다는 것을 기억해야 한다. 내가 원하는 결과물이 6개라면 코드에서는 -1을 해줘야 한다.
// 0부터 시작이기 때문에 내가 원하는 숫자를 그대로 입력하면 +1된 결과물이 나온다.

//1. 별 하나씩 5줄 만들기


