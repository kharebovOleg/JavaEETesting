package logic;

public class Cart {
    private String name;
    private int quantity;

    public String getName() {
        return name;
    }

    public Cart setName(String name) {
        this.name = name;
        return this;
    }

    public int getQuantity() {
        return quantity;
    }

    public Cart setQuantity(int quantity) {
        this.quantity = quantity;
        return this;
    }
}
