package practice.ex7;

public class Car {

    private static int totalCars; //static을 써서 공통변수
    private String name; //인스턴스 변수


    public Car(String name) {
        System.out.println("차량 구입, 이름: " +name);
        this.name = name;
        totalCars++;
    }

    public static void showTotalCars() {
        System.out.println("구매한 차량 수:" + totalCars);
    }
}
