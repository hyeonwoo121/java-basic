package construct;

public class MemberInit {
    String name;
    int age;
    int grade;

    //추가
    void initMember(String name, int age, int grade) {
        this.name = name; //this를 붙이는 이유 -> MemberInit에 있는 String name을 쓰고싶을때 구분하기위해!
        this.age = age;   //name = name 이면 어떤것을 가르키는지 확인불가 -> 보통 근처에있는 name을 우선적으로 인식하기때문에
        this.grade = grade; // name둘다 매개변수를 뜻하게됨 따라서 파라미터값 name안에 name을 넣는것이라 아무의미없게됨
    }                       //물론 this를 생략할 수도 있지만 this를 쓰면 멤버변수를 가르키는것을 바로 알 수 있다.

}
