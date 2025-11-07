package practice.ex2;

public class ProductOrderMain {

    public static void main(String[] args) {
            ProductOrder[] orders = new ProductOrder[3];//new 를 쓴다는 건 메모리상에 만드는것을 의미

            ProductOrder tofu = new ProductOrder();//ProductOrder 클래스를 기반으로 tofu 객체의 참조변수를 만듬
            tofu.productName = "두부";
            tofu.price = 2000;
            tofu.quantity = 2;
            orders[0] = tofu;

            ProductOrder kimchi = new ProductOrder();
            kimchi.productName = "김치";
            kimchi.price = 5000;
            kimchi.quantity = 1;
            orders[1] = kimchi;

            ProductOrder coke = new ProductOrder();
            coke.productName = "콜라";
            coke.price = 1500;
            coke.quantity = 2;
            orders[2] = coke;

            int totalAmount = 0;
        for (ProductOrder order : orders) {
            totalAmount += order.price * order.quantity;
        }
        System.out.println("합계금액 : " +totalAmount);
    }
}
