package extends1.super2;

public class ClassC extends ClassB {

    public ClassC() {
        super(10, 20); //생성자는 밑에 둘 중에 하나만 호출 가능
                            //ClassB(int a)  or ClassB(int a, int b)
                            //ClassC의 부모인 ClassB에는 기본생성자가 없어서 기본생성자를 호출하는 super사용 or생략 불가능
        System.out.println("ClassC 생성자");
    }
}
