package Cafeteria;

public class Coffee implements ISnack {
    String size;

    public Coffee(String size) {
        if (size != "sm" && size != "md" && size != "lg") {
            throw new IllegalArgumentException("Invalid size!");
        }

        this.size = size;
    }

    @Override
    public String getSizeAndType() {
        String quantity;

        switch (size) {
            case "sm":
                quantity = "150";
                break;
            case "md":
                quantity = "300";
                break;
            case "lg":
                quantity = "600";
                break;
            default:
                quantity = "0";
        }

        return quantity.concat(" ml");
    }
}
