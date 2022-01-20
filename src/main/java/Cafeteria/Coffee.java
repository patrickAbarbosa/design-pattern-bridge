package Cafeteria;

import utils.SizeUtils;

public class Coffee implements ISnack {
    String size;

    public Coffee(String size) {
        if (!new SizeUtils().isValidSize(size)) {
            throw new IllegalArgumentException("Invalid size!");
        }

        this.size = size;
    }


    @Override
    public void setSize(String size) {
        if (!new SizeUtils().isValidSize(size)) {
            throw new IllegalArgumentException("Invalid size!");
        }

        this.size = size;
    }

    @Override
    public String getSize() {
        return this.size;
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
