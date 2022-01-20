package Cafeteria;

import utils.SizeUtils;

public class CheeseBread implements ISnack {
    String size;

    public CheeseBread(String size) {
        if (!new SizeUtils().isValidSize(size)) {
            throw new IllegalArgumentException("Invalid size!");
        }

        this.size = size;
    }

    @Override
    public void setSize(String size) {
        if (new SizeUtils().isValidSize(size)) {
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
