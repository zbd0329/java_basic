package report;

public class Bus {
    int number; //번호
    int refuelingAmount; //주유량(초기화:기본값)
    int speed; //속도 (초기화:기본값)
    int passengers = 0; //  탑승한 인원 (최대승객수 제한있음)
    int inPassengers = 0; // 현재 탑승인원
    boolean onOffState; //운행상태
    int restPeoples = 30; //인원제한
    int num = 0; //탑승인원 승객도 함수로 풀어야하는데 큰일이네
    //    int num2= 0 ; //하차인원
    int busfare = 0;
    int fuel = 0; //리필한 기름
    String state;


    //객체값들은 어떻게든 감춰야한다. 접근제어자 private 같은 - 절대 퍼플릭으로 하면 안된다.
    //class 앞에 public을 써주지 않으면 다른데서 접근할 수 없다.
    //패키지 = 디렉토리 (집)
    //접근제어자
    //시리얼 넘버 구현을 어떻게 하는가.


    void refuel(int fuel){
        refuelingAmount = refuelingAmount+fuel;
        if (refuelingAmount<=50) {
            System.out.println("주유가 필요합니다");
            state = "차고지행";
            System.out.println(state);
        }
        else if (refuelingAmount >50) {
            state = "운영중";
            System.out.println(state);
        }

    } //현재 주유량(초기화:기본값)


    void startOperation(){} // 운행상태변경(시작,중지) 불리언타입
    void upSpeed(){++speed;} //속도변경 뒤에 중괄호는 왜 넣어야하는가
    void downSpeed(){--speed;} //속도변경 뒤에 중괄호는 왜 넣어야하는가
    void inPassengers(int num){ inPassengers = inPassengers + num;
        if(inPassengers >=30){
            inPassengers=0; restPeoples = 30; //탑승인원과 탑승제한 인원 모두 초기화
            System.out.println("최대승객수 초과"); //총합인원 30명 넘을시 모두 하차시키고 경고
        }

    } //승택탑승
    //    void outPassengers(int num2){ inPassengers = passengers - num2;} //승택하차
    void onOffState(){ } // >>>>>>>>운행상태를 어떻게 바꿔야하는지 모르겠다.
    void restPeople(){ restPeoples = restPeoples-inPassengers;} // >>>>>>>>>>탑승제한 근데 여기가 에러가나네 //this가 문제였다. 망할놈의 디스!!
    void busFare(){busfare = inPassengers * 1000;} //버스비 함수에 사칙연산이 들어가면 그냥 에러가 나버림
    void state(){String state;}
}

//일단은 정신차려라 사라야
//