package report;

public class Number1 {
    //버스 객체만 만들어지면 될것같다. 객체는 어떻게 만들지?
    //참조변수로 불러와서 객체만들어줌. >객체 만드는법 찾는중 요소가 포함된
    // 객체를 어떻게 만들지
    // 탑승 승객수랑 잔여 승객수 input / output
    //
    public static void main(String[] args) { //메인은 반드시 있어야 한다.
        Bus bus1 = new Bus(); // 버스1이라는 객체 하나 생성
        Bus bus2 = new Bus(); // 버스2이라는 객체 하나 생성

        bus1.number = 1004; //1004번 버스
        bus1.refuelingAmount = 100; //1004번 버스 주유량
        bus1.speed = 0; //1004번 버스의 속도 초기화 0
        bus1.passengers = 0; //1004번 버스 승객 0명

        bus2.number = 990; //1004번 버스
        bus2.refuelingAmount = 100; //주유량 초기화
        bus2.speed = 0; //버스의 속도 초기화 0
        bus2.passengers = 0; //버스의 속도 초기화 0

        System.out.println("1단계");
        System.out.println("버스1 생성 완료");
        System.out.println("버스2 생성 완료");
        System.out.println("2단계 버스 번호 다른지 확인");
        System.out.println("1번 버스번호 "+bus1.number+"번 "+"2번 버스번호 "+bus2.number+"번 ");
        //버스 번호가 다른건 어떻게 해야하지? > 하나씩 입력해서 해결 > 한줄로 만드는 법이 있을것 같은데

            System.out.println("버스 1번으로 진행");

//        bus1.passengers = 2;
//            System.out.println("2-1. 버스 1번에 승객"+bus1.passengers+"명 탑승"); //버스1번에 승객 2명 탑승
        bus1.inPassengers(2); //현재 탑승인원 적음
            System.out.println("2-1. 현재 탑승 인원 "+bus1.inPassengers+"명");
        bus1.restPeople(); //2명 탑승
            System.out.println("2-2. 추가 탑승 가능한 인원 "+bus1.restPeoples+"명"); //restPeople의 변수를 받아오지 못함. 0으로 뜸. >>>>>>>>>>>>>>
        bus1.busFare(); //받아오는 매개변수를 어떻게 해야하는가
            System.out.println("2-3. 버스비 수익 = "+bus1.busfare); //탑승인원 자체가 지금 바뀐것 같음.

        bus1.refuel(-50); //4.연료 50소비
            System.out.println("3번4. 남은 연료량 = " +bus1.refuelingAmount);
        //5 버스 상태변경 어떻게 하는지 모름
            System.out.println("5. 못풀음 차고지행을 어떻게 하는가");

        bus1.refuel(10); //6-a.주유량 +10
            System.out.println("7-2.현재 주유상태 "+bus1.refuelingAmount); //7 출력

        //8 상태변경 어떻게 하는지 모름
        bus1.inPassengers(45);//9. 버스 승객 45명 추가
        bus1.inPassengers(5); //10. 승객 5명 탑승
            System.out.println("12-1. 현재 탑승 인원 "+bus1.inPassengers+"명");

        //11번 알럿 띄우는 방법 모름
//        PrintWriter out = response.getWriter();
//        out.println("<script>alert('경고~!~!~!'); self.close();</script>");
//        out.flush();


        bus1.restPeople(); //잔여승객수
            System.out.println("12-2. 추가 탑승 가능한 인원 "+bus1.restPeoples+"명"); //restPeople의 변수를 받아오지 못함. 0으로 뜸. >>>>>>>>>>>>>>
        bus1.busFare(); //받아오는 매개변수를 어떻게 해야하는가
            System.out.println("12-3. 버스비 수익 = "+bus1.busfare); //탑승인원 자체가 지금 바뀐것 같음.

        bus1.refuel(-55); //4.연료 50소비
        System.out.println("14. 남은 연료량 = " +bus1.refuelingAmount);
    }

}

