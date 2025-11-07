package practice.ex3;

public class ProductOrderMain2 {

    public static void main(String[] args) {
        ProductOrder[] orders = new ProductOrder[3];
        orders[0] = createOrder("두부", 2000, 2);
        orders[1] = createOrder("김치", 5000, 1);
        orders[2] = createOrder("콜라", 1500, 2);

        printOrders(orders);
        int totalAmount = getTotalAmount(orders);
        System.out.println("총 결제 금액: " + totalAmount);
    }
    
    static ProductOrder createOrder (String productName,int price, int quantity){
        ProductOrder order = new ProductOrder(); //order는 여기서 임시변수, 지막에 return 해서 밖으로 보내기 위해 존재하는 변수
        order.productName = productName;
        order.price = price;
        order.quantity = quantity;
        return order;
    }

    //출력만하기때문에 반환타입이 필요없다
    static void printOrders (ProductOrder[]orders){
        for (ProductOrder order : orders) {
            System.out.println("상품명: " + order.productName + ", 가격: " + order.price + ", 수량: " + order.quantity);
        }
    }

    static int getTotalAmount (ProductOrder[]orders){
        int totalAmount = 0;
        for (ProductOrder order : orders) { //order는 여기서 임시변수
            totalAmount += order.price * order.quantity;
        }
        return totalAmount;
        //orders 가 묶음이면
        //order 는 그 묶음에서 하나씩 꺼낸 물건임
    }

}