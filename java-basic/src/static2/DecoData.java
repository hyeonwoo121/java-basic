package static2;

public class DecoData {

   private int instanceValue;
   private static int staticValue;


   //static내에서 자기자신의 내부를 호출할 때에는 static은 static만 호출할 수 있다.
   public static void staticCall() {
       //instanceValue++; //인스턴스 변수 접근, compile error
       //instanceMethod(); //인스턴스 메서드 접근, compile error

       staticValue++; //정적 변수 접근
       staticMethod(); //인스턴스 메서드 접근
   }
    //외부에서 참조값을 넘겨오는 경우에는 static이라도 instance에 접근가능
    //하지만 static 내부에서는 인스턴스에 접근할 수 없다! 왜냐면 주소를 모르니깐!! 11행참고 할것!
   public static void staticCall(DecoData data){
       data.instanceValue++; //호출가능
       data.instanceMethod();
   }

    //instanceCall은 static,인스턴스 둘다 호출 가능!
   public void instanceCall(){
       instanceValue++; //인스턴스 변수 접근
       instanceMethod(); //인스턴스 메서드 접근

       staticValue++; //정적 변수 접근
       staticMethod(); //정적 메서드 접근
   }

   private void instanceMethod(){
       System.out.println("instanceValue=" + instanceValue);
   }

   private static void staticMethod(){
       System.out.println("staticValue=" + staticValue);
   }
}
