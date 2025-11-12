package practice.ex6;

public class ShoppingCart {
    private Item[] items = new Item[10]; //크기 10짜리 장바구니
    private int itemCount; //지금까지 장바구니에 담긴 상품 개수


   /* 1️.정상 로직을 “밑에만 존재”하도록 두고,
      2️.위쪽에서는 예외 케이스를 전부 걸러냄.
    이런 걸 흔히 “가드 클라우즈(Guard Clauses)” 패턴 이라고함*/
    public void addItem(Item item) {
        //검증 로직
        if (itemCount >= items.length){
            System.out.println("장바구니가 가득 찼습니다.");
            return;
        }
        //정상 로직
        items[itemCount] = item;
        itemCount++;
    }

    public void displayItems() {
        System.out.println("장바구니 상품 출력");
        for (int i = 0; i < itemCount; i++){
            Item item = items[i];
            System.out.println("상품명: " + item.getName() + ", 합계:" + item.getTotalPrice());
        }
        System.out.println("전체 가격 합:" + calculateTotalPrice());
    }

    private int calculateTotalPrice(){
        int totalPrice = 0;
        for (int i = 0; i < itemCount; i++) {
            Item item = items[i];
            totalPrice += item.getTotalPrice();
        }
        return totalPrice;
    }
}
