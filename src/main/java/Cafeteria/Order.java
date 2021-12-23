package Cafeteria;

public class Order implements IOrder {
    ISnack snack;

    public Order() {
        this.snack = null;
    }

    @Override
    public void addSnack(ISnack snack) {
        this.snack = snack;
    }

    @Override
    public String parseOrderToText() {
        return snack.getSizeAndType();
    }
}
