public class Exercise6_2 {
    // 문제 6-2, 6-3번 답안지
    // info()를 추가해서 실행결과와 같은 결과를 얻도록 하세요.
    public static void main(String args[]) {

        Student s = new Student();
        s.name = "홍길동";
        s.ban = 1;
        s.no = 1;
        s.kor = 100;
        s.eng = 60;
        s.math = 76;
        System.out.println("이름:" + s.name);
        System.out.println("총점:" + s.getTotal());
        System.out.println("평균:" + s.getAverage());
    }
}

class Student {
    String name;
    int ban;
    int no;
    int kor;
    int eng;
    int math;

    int getTotal() {  //메서드 선언할 때도 타입이 같아야 한다.
        return kor + eng + math; //return 값을 반환한다.
    }

    float getAverage() {
        return (int)(getTotal()/3f*10+0.5)/10f;
    }
}

//소수 둘째자리에서 반올림 하는 공식 (잘 눈으로 익혀두고 연습하기)

//236/3 →78
//236 / 3f → 78.666664
//236 / 3f * 10 → 786.66664
//236 / 3f * 10 + 0.5 → 787.16664
//(int)(236 / 3f * 10 + 0.5) → (int)787.16664 → 787 (int)(236 / 3f * 10 + 0.5) / 10 → 78
//(int)(236 / 3f * 10 + 0.5) / 10f → 78.7

