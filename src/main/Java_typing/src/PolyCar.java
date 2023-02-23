public class PolyCar {
    public static void main(String[] args) {

        System.out.println("자동차 생산 시작");




    }


}

class Gv80 extends Car {

    //알트엔터 단축키로 만든다.
    //상위 클래스를 하위클래스가 상속을 받는다.
    //생성자가 아무도 없다면 오류가 안뜰것이다.
    //오버로드된 생성자가 하나라도 있으면 기본 생성자를 만들어주지 않는다.
    public Gv80(String brand, int price, int gasMileage, Tier tier) {
        super(brand, price, gasMileage, tier); //수퍼를 통해서 초기화
    }
}

class R8 extends Car {

    public R8(String brand, int price, int gasMileage, Tier tier) {
        super(brand, price, gasMileage, tier); //수퍼를 통해서 초기화 부모클래스의 속성을 불러옴.
    }
}

class SF9 extends Car {

    public SF9(String brand, int price, int gasMileage, Tier tier) {
        super(brand, price, gasMileage, tier); //수퍼를 통해서 초기화 부모클래스의 속성을 불러옴.
    }
}

// 차는 타이어를 포함하고 있어야 한다.
abstract class Car implements CarFunction{
    String brand;
    int price;
    int gasMileage;

    @Override
    public void breakPedal() {
        System.out.println("브레이크!");
    }

    @Override
    public void gasPedal() {
        System.out.println("가속중!");

    }

    @Override
    public void leftSignal() {
        System.out.println("좌회전 깜박이");

    }

    @Override
    public void rightSignal() {
        System.out.println("우회전 깜박이");

    }

    //하드코딩 : 가변적으로 안하고 정적으로 했다. (유연하지 못한 코드)
    //필드로 준다는게 무슨 말인가?
    //생성자를 통해서 만들면 무슨값이 무조건 들어온다.

    //타이어를 어떻게 포함시켜야 할까?
    // 차에 타이어를 포함시킬건데 여러 종류의 브랜드의 차를 만들려고 한다.
    //각각의 차마다 타이어의 종류가 다를 수 있다.

    Tier tier; //약한 관계의 이름으로 참조변수를 만들어 준다. 이름을 항상 고민한다.

    public Car(String brand, int price, int gasMileage, Tier tier) {
        this.brand = brand;
        this.price = price;
        this.gasMileage = gasMileage;
        this.tier =tier;
        //객체를 만들어준다.
    }

}

// 자동차의 부속품중 필수적인것 Tier
//자동차와 느슨한 관계 유지하도록 ,다형성을 사용하기 위해 설정(코드를 유연하게 사용하기 위해 사용한다.)
abstract class Tier {
    //타이어의 공통적인 부분
    int price;
    int windage;

}

class HankookTier extends Tier {
    // 상속관계
    // new 한국타이어를 통해서 객체를 만든다.
    final String BRAND = "HANKOOK";
    public HankookTier() {
        super.price = 550000;
        super.windage = 36;

    }
}

class KiaTier extends Tier {
    // 상속관계
    // new 한국타이어를 통해서 객체를 만든다.
    final String BRAND = "KIA";
    public KiaTier() {
        super.price = 460000;
        super.windage = 32;

    }
}
// 포함관계의 상속
// 설계를 할때 상속을 할지 포함을 할지 잘 고민해야 한다. 상속도 모든걸 상속하는게 아니라 calss간의 관계를 고민해야 한다.

interface CarFunction {
    // 브레이크, 악셀, 깜박이
    // 인터페이스를 사용해서 쓰는 유연함을 볼 수 있다.
    void breakPedal();
    void gasPedal();
    void leftSignal();
    void rightSignal();
}