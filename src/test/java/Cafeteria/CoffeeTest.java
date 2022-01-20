package Cafeteria;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CoffeeTest {
    @Test
    public void shouldReturnInvalidSize() {
        try {
            Coffee coffee = new Coffee("xl");
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Invalid size!", e.getMessage());
        }
    }

    @Test
    public void shouldReturnSizeAndType() {
        Coffee coffee = new Coffee("md");

        assertEquals("300 ml", coffee.getSizeAndType());
    }
}