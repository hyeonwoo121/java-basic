package static1;

public class DataCountMain2 {

    public static void main(String[] args) {
        Counter counter = new Counter();
        Data2 data1 = new Data2("A", counter); //Data2 생성자에 counter참조변수를 넘길 때
        System.out.println("A count=" + counter.count); //‘counter가 가리키던 객체의 주소(참조값)’이 그대로 복사되어 전달

        Data2 data2 = new Data2("B", counter);
        System.out.println("B count=" + counter.count);

        Data2 data3 = new Data2("C", counter);
        System.out.println("C count=" + counter.count);
    }
}
