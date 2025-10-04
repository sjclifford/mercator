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
			System.out.println("Offer1");
			int ap = this.apples/2;
			int mod = this.apples%2;
			System.out.println("Apples/2 = " + ap + " Modulus = " + mod);
			BigDecimal subTotal = apple.multiply(BigDecimal.valueOf(ap+mod));
			System.out.println("Sub Total: " + subTotal);
			total = total.add(subTotal);
		}
		else {
			System.out.println("Offer1 else" + apples);
			BigDecimal subTotal = apple.multiply(BigDecimal.valueOf(apples));
			System.out.println("Sub Total: " + subTotal);
			total = total.add(subTotal);
		}
		
		if(this.offer2 && this.oranges >=3) {
			System.out.println("Offer2");
			int or = this.oranges/3;
			int mod = this.oranges%3;
			System.out.println("Oranges/3 = " + or + " Modulus = " + mod);
			BigDecimal subTotal = orange.multiply(BigDecimal.valueOf((or*2)+mod));
			System.out.println("Sub Total: " + subTotal);
			total = total.add(subTotal);
		}
		else {
			System.out.println("Offer2 else" + oranges);
			BigDecimal subTotal = orange.multiply(BigDecimal.valueOf(oranges));
			System.out.println("Sub Total: " + subTotal);
			total = total.add(subTotal);
		}
		System.out.println("total: " + total);
		return total;
	}
}
