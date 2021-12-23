package Cafeteria;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CheeseBreadTest {
    @Test
    public void shouldReturnInvalidSize() {
        try {
            CheeseBread cheeseBread = new CheeseBread("xl");
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Invalid size!", e.getMessage());
        }
    }

    public void shouldReturnSizeAndType() {
        CheeseBread cheeseBread = new CheeseBread("md");

        assertEquals("100 g", cheeseBread.getSizeAndType());
    }
}