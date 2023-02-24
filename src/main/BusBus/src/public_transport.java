class public_transport { //대중교통


    public static void main(String[] args) {
        System.out.println("버스 운행 시작!");

    }


}



abstract class Car implements CarFunction{
    String type; //대중교통 종류 버스,택시,지하철 등등
    int number; //번호
    int refueling_amount =100; //주유량(초기화:기본값)
    int speed = 0; //속도 (초기화:기본값)
    int speed_Change; //속도변경
    int max_passengers; //최대승객수


}

interface CarFunction{ //사실 이게 뭔지 몰라
    void start_operation() ; //공통 클래스 메서드들 시작
    void setSpeed_Change(); //속도변경 뒤에 중괄호는 왜 넣어야하는가
    void setOperation(); // 운행상태변경(시작,중지)
    void setPassengers(); //승택탑승
}