package practice.ex2;

public class ProductOrderMain {

    public static void main(String[] args) {
            ProductOrder[] orders = new ProductOrder[3];

            ProductOrder tofu = new ProductOrder();
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
