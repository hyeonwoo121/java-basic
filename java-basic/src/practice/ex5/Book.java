package practice.ex5;

public class Book {
    String title; //제목
    String author; //저자
    int page; //페이지 수

    //생성자 오버로딩 -> 실무에서는 Builder 패턴 주로 사용 특히 롬복이랑 같이!
    Book() {
        this("", "", 0);//this(...) 는 ‘생성자 호출’
    }

    Book(String title, String author) {
        this(title, author, 0);// 여기서 생성자,메서드를 호출할 때 전달하는 값이 3개라서 밑↓Book 생성자로감
        }

    Book(String title, String author, int page){
        this.title = title;//필드를 실제로 저장하는 최종 본체(마스터 생성자) 역할
        this.author = author;//this(title, author, page); 이렇게 쓰면 NG
        this.page = page;//→ 이 생성자가 자기 자신을 다시 호출하는 꼴 → 무한 루프 → 컴파일 에러
        }

    void displayInfo(){
        System.out.println("제목:" + title + ", 저자:" +author+ ", 페이지: " + page);
    }
}
