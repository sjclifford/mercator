package shoppingCart;

import java.math.BigDecimal;

public class shoppingCart {
	
	private BigDecimal total = new BigDecimal(0.00);
	private BigDecimal apple = new BigDecimal("0.60");
	private BigDecimal orange = new BigDecimal("0.25");
	
	shoppingCart(){}
	
	public BigDecimal total_cost(String[] items) {
		for (int i = 0; i < items.length; i++) {
			switch(items[i]) {
				case "Apple":
					total = total.add(apple);
					break;
				case "Orange":
					total = total.add(orange);
					break;
				default:
					break;
			}
		}		
		return total;
	}
}
