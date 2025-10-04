package shoppingCart;

import java.math.BigDecimal;

public class shoppingCart {
	
	private BigDecimal total = new BigDecimal(0.00);
	private BigDecimal apple = new BigDecimal("0.60");
	private BigDecimal orange = new BigDecimal("0.25");
	private boolean offer1 = false;
	private boolean offer2 = false;
	private int apples = 0;
	private int oranges = 0;
	
	shoppingCart(){}
	
	public BigDecimal total_cost(String[] items) {
		for (int i = 0; i < items.length; i++) {
			switch(items[i]) {
				case "Offer1":
					this.offer1 = true;
					break;
				case "Offer2":
					this.offer2 = true;
					break;							
				case "Apple":
					this.apples ++;
					break;
				case "Orange":
					this.oranges ++;
					break;
				default:
					break;
			}
		}
		if(this.offer1 && this.apples >=2) {
			int ap = this.apples/2;
			int mod = this.apples%2;
			BigDecimal subTotal = apple.multiply(BigDecimal.valueOf(ap+mod));
			total = total.add(subTotal);
		}
		else {
			BigDecimal subTotal = apple.multiply(BigDecimal.valueOf(apples));
			total = total.add(subTotal);
		}
		
		if(this.offer2 && this.oranges >=3) {
			int or = this.oranges/3;
			int mod = this.oranges%3;
			BigDecimal subTotal = orange.multiply(BigDecimal.valueOf((or*2)+mod));
			total = total.add(subTotal);
		}
		else {
			BigDecimal subTotal = orange.multiply(BigDecimal.valueOf(oranges));
			total = total.add(subTotal);
		}
		return total;
	}
}
