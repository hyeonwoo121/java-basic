package static2;

public class DecoMain2 {

    public static void main(String[] args) {
        String s = "hello java";
        String deco = DecoUtil2.deco(s);// DecoUtil2클래스가 static이면 객체생성 없이 바로 클래스에 점찍어서 부를수있다.
                                        // 왜냐면 static은 클래스 영역에 소속되기때문.
                                        // -> 불필요한 객체생성 필요없이 편리하게 메서드를 사용할 수 있다.
        System.out.println("before: " + s);
        System.out.println("after: " + deco);
    }
       //static이 붙지 않은 메서드는 인스턴스를 생성해야 호출할 수 있다. -> 인스턴스 메서드라고 부름.
}
