import java.util.Scanner;

public class Practice_0219_01 {
    public static void main(String[] args) {
        // 별 뒤에서부터 찍히게 하기
        for (int i = 0; i <= 7; i++) {  //입력한 숫자만큼 줄이 나오게 하려면 =을 반드시 붙여줘야 한다.
            for (int j = 0; j < i; j++) { // 한줄이 내려갈수록 별의 갯수도 늘어나므로 같이 증가시켜 주면된다.
                System.out.print("*"); //옆으로 별이 생기는 것을 인쇄 해준다.
            }
            System.out.println(); // 바깥쪽 for문에 대한 명령문으로 줄변경을 해준다.
        }

    }
} //줄변경을 하고 줄을 맞출때 많이 신경쓰도록 하자. 새로운 문법에 들어갈 때는 탭키, 괄호는 시작한 매서드와 줄맞추기.

