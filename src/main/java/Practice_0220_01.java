import java.util.Scanner;

public class Practice_0220_01 {
    //코딩테스트 연습용 기본 폼으로 이용 가능. 어떻게 구현되는지는 나중에 깨닫는 날이 오겠지-
    public static void main(String[] args) {
        System.out.println("계산할 물건값을 넣으세요");
        Scanner scanner = new Scanner(System.in);
        String tmp = scanner.nextLine();

        int num = Integer.parseInt(tmp);

        int don4 = 0;
        int sum = 0;

        int don = 1000 - num;
        int don2 = don / (int)100;
        int don3 = don - 100*don2;
        if(don3 > 50){
           don4 = 1+((don3-50)/10);
        } else{
            don4 = don3/10;
        }
        sum = don2 + don4;

        System.out.println("거슬러 받을 동전의 갯수 = "+sum);

    }
}

