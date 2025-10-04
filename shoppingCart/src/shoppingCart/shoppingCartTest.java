package shoppingCart;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.*;

import java.math.BigDecimal;

import org.junit.jupiter.api.Test;

class shoppingCartTest {

	@Test
	void test() {
		String[] cart = {"Apple", "Apple", "Orange", "Apple"};
		BigDecimal expected = new BigDecimal("2.05");
		shoppingCart x = new shoppingCart();	
		assertTrue(expected.compareTo(x.total_cost(cart)) == 0);
	}

	@Test
	void test2() {
		String[] cart = {"Offer1", "Offer2", "Apple", "Apple", "Orange", "Orange", "Orange", "Orange", "Apple", "Apple", "Apple"};
		BigDecimal expected = new BigDecimal("2.55");
		shoppingCart x = new shoppingCart();	
		assertTrue(expected.compareTo(x.total_cost(cart)) == 0);
	}
	
}
