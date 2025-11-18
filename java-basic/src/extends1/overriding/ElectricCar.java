package extends1.overriding;

public class ElectricCar extends Car {

    @Override //어노테이션 -> 컴퓨터가 읽는 주석같은 것.
              //오버라이드가 정확하게 안되면 컴파일 오류를 내는 어노테이션이다.(Ex.메소드명 오타)
    public void move() {
        System.out.println("전기차를 빠르게 이동합니다.");
    }

    public void charge() {
        System.out.println("충전합니다.");
    }
}
