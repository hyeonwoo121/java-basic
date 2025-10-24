package practice.ex1;

public class MovieReviewMain {
    public static void main(String[] args) {

        MovieReview movieInfo = new MovieReview();
        movieInfo.title = "인셉션";
        movieInfo.review = "인생은 무한 루프";

        MovieReview movieInfo2 = new MovieReview();
        movieInfo2.title = "어바웃 타임";
        movieInfo2.review = "인생 시간 영화!";

        System.out.println("영화 제목: " + movieInfo.title + " 리뷰: " + movieInfo.review);
        System.out.println("영화 제목: " + movieInfo2.title + " 리뷰: " + movieInfo2.review);
    }
}
