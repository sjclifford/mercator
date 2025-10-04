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

}
