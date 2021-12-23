package Cafeteria;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OrderTest {
    @Test
    public void shouldReturnMediumSizeCoffee() {
        Coffee coffee = new Coffee("md");

        Order order = new Order();
        order.addSnack(coffee);

        assertEquals("300 ml", order.parseOrderToText());
    }

    public void shouldReturnMediumSizeCheeseBun() {
        CheeseBread cheeseBread = new CheeseBread("md");

        Order order = new Order();
        order.addSnack(cheeseBread);

        assertEquals("300 g", order.parseOrderToText());
    }
}