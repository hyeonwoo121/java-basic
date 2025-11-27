package memory;

public class JavaMemoryMain2 {

    public static void main(String[] args) {
        System.out.println("main start");
        method1();
        System.out.println("main end");
    }

    static void method1() {
        System.out.println("method1 start");
        Data data1 = new Data(10);
        method2(data1);
        System.out.println("method1 end");
    }

    //data1이 갖고 있던 객체의 주소값을 그대로 복사해서 data2에 넣기 때문에
    //결국 data2도 value=10을 보유한 Data 객체를 가리키게 되는 것.
    static void method2(Data data2) {
        System.out.println("method2 start");
        System.out.println("data.value=" + data2.getValue());
        System.out.println("method2 end");
    }

}
