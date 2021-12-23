package Cafeteria;

public class CheeseBread implements ISnack {
    String size;
    public CheeseBread(String size) {
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
                quantity = "50";
                break;
            case "md":
                quantity = "100";
                break;
            case "lg":
                quantity = "200";
                break;
            default:
                quantity = "0";
        }

        return quantity.concat(" g");
    }
}
