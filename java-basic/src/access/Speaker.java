package access;

public class Speaker {
    private int volume;//private이 붙은 경우에는 다른 외부 클래스에서 접근이 불가능하다.
                       //한마디로 해당 클래스내에서만 사용가능!
                       //접근제어자는 지역변수에는 쓸 수 없다!
                       //클래스,필드(멤버변수),생성자,메서드에만 사용 가능!
    Speaker(int volume) {
        this.volume = volume;
    }

    void volumeUp() {
        if (volume >= 100) {
            System.out.println("음량을 증가할 수 없습니다. 최대 음량입니다.");
        } else {
            volume += 10;
            System.out.println("음량을 10 증가합니다.");
        }
    }

    void volumeDown() {
        volume -= 10;
        System.out.println("volumeDown 호출");
    }

    void showVolume() {
        System.out.println("현재 음량: " + volume);
    }
}
