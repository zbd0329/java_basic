public class Practice_0219_02 {
    public static void main(String[] args) {
        // 별 뒤에서부터 찍히게 하기
//        for(int i =7; i > 0; i--){
//            for(int j = 0; j<i; j++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }

        //주석 처리하리하고 2번째 연습
//        for(int i =5 ; i > 0; i--){ //별의 갯수가 위에서 한줄씩 줄어들기. 기준이 별의 갯수
//            for(int j = 0; j < i ; j++){ //한줄씩 늘어나기 . 어디까지 늘어날 것인가. i의 갯수만큼 줄어들어야 한다.
//                System.out.print("*");
//            }
//            System.out.println();
//        }

        //주석 처리하고 3번째 연습

//        for (int i = 5; i>0; i--){ //별부터 세기
//            for(int j = 0; j <i ; j++){ //그 다음줄에 대한 정보.
//                System.out.print("*");
//            }
//            System.out.println();// 별이 있는 줄 바꾸기.
//        }

        //별 그리기 4번째 연습 순서대로 써넣기
//        for (int i =0; i<8; i++){
//            for(int j= 0; j < i; j++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }
        //졸린건 왜 내가 졸리냐

        //왼쪽부터 늘어나는 공백 구현해보기
//        for(int i = 0; i<5; i++){
//            for(int j =0; j<i; j++){ //공백 늘어나는 것 구현
//                System.out.print(" ");
//            }
//            for(int j = 5; j>i; j--){ //별 줄어드는 것 구현
//                System.out.print("*");
//            }
//            System.out.println();
//        }

        //오른쪽 정렬로 하나씩 별 늘어나는거 만들어보기(공백을 사용해서 만든다.)
        //사고의 유연함이 필요한 문제. 공백대신 .을 찍어서 어떻게 나오는지 확인 가능
//        for(int i = 0; i<= 8; i++){ //행열을 몇줄 만들지 정하는 포문
//            for(int j = 8; j>i; j--){
//                System.out.print("."); // 공백을 만드는 포문,i는 .의 갯수 결정
//                //for문은 조건이 맞으면 반복해서 실행한다. 안맞으면 거기서 빠져나온다.
//                //빠져나온뒤에는 다음 for문으로 이동.
//            }
//
//            for(int j = 0; j<i; j++){ //별을 찍는 포문 i는 별의 갯수를 제한한다
//                System.out.print("*");
//            }
//
//            System.out.println();
//        }
//
//    for (int i = 0; i<=5; i++){  //한줄씩 늘어나기
//        for (int j =0; j <i; j++){ //줄에 따라 별이 늘어나기
//            System.out.print("*");
//        }
//        System.out.println();
//    }

//        //  별이 갈수록 줄어들음
//        for(int i = 0; i < 5; i++){
//            for(int j = 5; j > i; j--){
//                System.out.print("*");
//            }
//            System.out.println();
//
//        }


        //별이 늘어났다가 줄어들기

//        for(int i = 1; i<=5; i++ ){ // 늘어나는 동안의 줄 갯수
//            for(int j=0; j < i; j++) { // 늘어나는 동안의 별 갯수
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//        for(int i = 0; i < 5; i++) { //줄어드는 줄 갯수
//                for(int j = 4; j >i; j--){ //줄어드는 별 갯수
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//    }

        // 별 줄어들다 다시 늘어나기
        // 만들려는 모양
        //    *****
        //    ****
        //    ***
        //    **
        //    *
        //    **
        //    ***
        //    ****
        //    *****

//        for (int i = 0; i < 5; i++) {
//            for (int j = 5; j > i ; j--) {  //j는 i보다 크다. 이 부분을 설정하는게 어렵다.
//                //j와 i는 왜 정해주는가?
//                System.out.print("*");
//            }
//
//            System.out.println();
//        }
//        for ( int i = 1; i < 5; i++){ // 2부터 시작해서 줄을 3개만 만든다.  별은 5개까지 찍어야 하기 때문에 5를 써준다.
//            for (int j = 0; j<=i; j++){ //변수 i를 이용해 별 2개 찍음
//                System.out.print("*");
//            }
//            System.out.println();
//        }

        // 오른쪽 정렬로 별 늘어났나 줄어들기.
        //1. 공백 만들어주기(4개부터 시작)
        //2. 별 1개부터 5개까지 늘어나면서 반복
        //3. 공백 1개부터 시작
        //4. 별 4개부터 줄어드는 코드 만들기  총 4개의 포문이 필요함.
        //5. 2중포문으로 2개. 4개의 포문 만들기.

//        for (int i = 0; i <= 5; i++) {
//            for(int j=5; j>i; j-- ){
//                System.out.print(".");
//            }
//            for (int j = 0; j < i; j++) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//        for(int i = 1; i < 5; i++){
//            for(int j = 0; j < i; j++){
//                System.out.print(".");
//            }
//            for (int j = 5; j>i; j--){
//                System.out.print("*");
//            }
//            System.out.println();
//        }
        // 별 줄어들다 다시 늘어나기
        // 만들려는 모양
        //        .....
        //        ....*
        //        ...**
        //        ..***
        //        .****
        //        *****
        //        .****
        //        ..***
        //        ...**
        //        ....*






// ------------여기 아래로 중괄호 두개 필요--------
    }
} //줄변경을 하고 줄을 맞출때 많이 신경쓰도록 하자. 새로운 문법에 들어갈 때는 탭키, 괄호는 시작한 매서드와 줄맞추기.

