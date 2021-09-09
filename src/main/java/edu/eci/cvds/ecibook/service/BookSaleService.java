package edu.eci.cvds.ecibook.service;

import java.math.BigDecimal;

import edu.eci.cvds.ecibook.model.*;

/**
 * Subscription Service class in charge of calculating the monthly subscription.
 */
public class BookSaleService {

	/**
	 * Calculate the cost of a book, depending on the discount category and book category.
	 *
	 * @param bookCategory      The book category
	 * @param discountCategory  The discount category
	 * @return The amount to be charged to the client
	 */
	public BigDecimal calculateCost(final int bookCategory, final DiscountCategory discountCategory)throws DiscountException {
		BigDecimal   total, valor, descuentodos;

		if (bookCategory < 1 ) {
			throw new DiscountException(DiscountException.MENOR);	
		}
		if (bookCategory > 30) {
			throw new DiscountException(DiscountException.MAYOR);	
		}
		
		valor = precioCategoria(bookCategory);
		BigDecimal descuento = null;
		switch(discountCategory) {
			case EMPLOYEE:
				descuento = new BigDecimal(0.10);
				
				
				break;
			case STUDENT:
				descuento = new BigDecimal(0.2);
			
				break;
			case OTHER:
				descuento = new BigDecimal(0);
			
				break;
		}
		descuentodos = valor.multiply(descuento);
		total = valor.subtract(descuentodos);
		
		return total;
		
		
		
		
		
	}
	
	
	public BigDecimal precioCategoria(int num) {
		BigDecimal a = null;
		
		if (1 <=num && num <= 10 ) {
			a = new BigDecimal (25000);
		}
		
		else if (11 <=num && num <= 20) {
			a = new BigDecimal (50000);
			
		}
		
		else if (21 <=num && num <= 30 ) {
			a = new BigDecimal (100000);
			
		}
		return a;
	}

	

}
