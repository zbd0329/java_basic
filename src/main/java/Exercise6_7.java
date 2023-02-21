//6-7. 다음은 컴퓨터 게임의 병사(marine)를 클래스로 정의한 것이다.
//이 클래스의 멤버 중에 static을 붙여야 하는 것은 어떤 것들이고 그 이유는 무엇인가?
//(단, 모든 병사의 공격력과 방어력은 같아야 한다.)
//class Marine {
//    int x=0, y=0; //Marine의 위치좌표 (x,y)
//    int hp = 60; //현재 체력
//    static int weapon = 6; //공격력 //공통속성이 클래스 변수이다. static이 붙어야한다.
//    static int armor = 0; //방어력 //공통속성이 클래스 변수이다. static이 붙어야한다.
//    void weaponUp() {
//        static weapon++; //static 변수에 대한 작업을 하는 메서드이기 때문에 타입을 똑같이 해줘야 한다.
//    }
//    void armorUp() {
//        static armor++; //static 변수에 대한 작업을 하는 메서드이기 때문에 타입을 똑같이 해줘야 한다.
//    }
//    void move(int x, int y) {
//        this.x = x;
//        this.y = y;
//    }
//}