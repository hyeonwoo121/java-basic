package practice.ex6;

public class Item {
    private String name;
    private int price;
    private int quantity;

    public Item(String name, int price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }


    //name은 금고 속의 데이터,
    //getName()은 금고를 여는 공식적인 열쇠
    //이것이 바로 캡슐화(encapsulation)
    // →중요한 Data는 private로 외부에서 접근막고 getName메소드로 값을 외부로전달
    public String getName() {
        return name;
    }

    public int getTotalPrice() {
        return price * quantity;
    }

}
