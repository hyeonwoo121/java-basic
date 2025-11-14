package static1;

public class DataCountMain3 {

    public static void main(String[] args) {
        Data3 data1 = new Data3("A");
        System.out.println("A count=" + Data3.count);

        Data3 data2 = new Data3("B");
        System.out.println("B count=" + Data3.count);

        Data3 data3 = new Data3("C");
        System.out.println("C count=" + Data3.count);

        /*static 변수 count는 모든 인스턴스가 공유
        생성자에서 count++ 실행
        클래스로 접근하는 것이 정석(Data3.count)
        인스턴스로 접근(data4.count)은 가능하지만 오해를 부르므로 비추천*/
        Data3 data4 = new Data3("D");
        System.out.println(data4.count);

        //클래스를 통한 접근
        //보는사람이 바로 한눈에 static이네 공용변수에 접근하네라고 알 수 있음
        System.out.println(Data3.count);
    }
}
