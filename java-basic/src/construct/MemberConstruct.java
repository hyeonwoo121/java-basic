package construct;

public class MemberConstruct {
    String name;
    int age;
    int grade;

    //추가
    MemberConstruct(String name, int age){
        this(name, age, 50);//this(...) 는 같은 클래스 안의 다른 생성자를 호출하는 코드!
    }                             //여기서는 ↓밑에있는 생성자의 파라미터값을 찾고 맞으면 대입


    MemberConstruct(String name, int age, int grade) {
        System.out.println("생성자 호출 name=" + name + ",age=" + age + ",grade=" + grade);
        this.name = name;
        this.age = age;
        this.grade = grade;
    }
}
