package extends1.ex2;

public class ElectricCar extends Car {
                         //extends는 화살표와 같다 -> 자식은 부모를 알지만 부모는 물려줄대상(자식)을 모름.
                         //자바는 다중상속이 안됨. 자식은 부모를 하나만 선택할 수 있다.
    public void charge() {
        System.out.println("충전합니다.");
    }
}
