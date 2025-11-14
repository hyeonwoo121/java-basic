package static1;

public class Data3 {
    public String name;
    public static int count; //static 변수는 여러인스턴스들에서 공용으로 쓴다(static은 메서드영역에서관리)
                             //클래스 안에 소속되어있는 느낌

    public Data3(String name) {
        this.name = name;
        count++;
    }
}
