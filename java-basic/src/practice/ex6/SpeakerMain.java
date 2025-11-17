package practice.ex6;

public class SpeakerMain {
    public static void main(String[] args) {
        Speaker speaker = new Speaker(90);
        speaker.showVolume();

        speaker.volumeUp();
        speaker.showVolume();

        speaker.volumeUp();
        speaker.showVolume();

        //필드에 직접 접근
        System.out.println("volume 필드 직접 접근 수정");
        //speaker.volume = 200; -> Speaker 클래스안에 볼륨데이터를 private로 설정해놔서 해당 클래스
        //바깥에서는 volume 데이터안으로는 접근할 수 없다.
        speaker.showVolume();
    }
}
