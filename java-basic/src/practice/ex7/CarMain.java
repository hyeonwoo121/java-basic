package practice.ex7;

public class CarMain {

    public static void main(String[] args) {

        Car car1 = new Car("K3");
        Car car2 = new Car("G80");
        Car car3 = new Car("Model Y");

        Car.showTotalCars(); //구매한 차량 수를 출력하는 static메서드
                             //객체생성없이 메소드에 접근할때는 static써야함
                             //static안쓰고싶으면 객체생성해서 접근해야함
    }
}
