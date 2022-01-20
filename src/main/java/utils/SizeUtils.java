package utils;

public class SizeUtils {
    public SizeUtils() {}

    public boolean isValidSize(String size) {
        return size == "sm" || size == "md" || size == "lg";
    }
}