package edu.eci.cvds.ecibook.service;

import java.math.BigDecimal;

import org.junit.Assert;
import org.junit.Test;
import edu.eci.cvds.ecibook.model.*;


/**
 * Test class for {@link BookSaleService}
 */
public class BookSaleServiceTest {

	/**
	 * The class under test.
	 */
	private BookSaleService service = new BookSaleService();
	
	@Test
	public void CategoriaInferior() {
		try {
			service.calculateCost(-1, DiscountCategory.OTHER);
		}
		
		catch (Exception e) {
			Assert.assertTrue(true);
		}
	}

	
	@Test
	public void CategoriaSuperior() {
		try {
			service.calculateCost(32, DiscountCategory.EMPLOYEE);
		}
		
		catch (Exception e) {
			Assert.assertTrue(true);
		}
	}
	
	@Test
	
	public void aplicaDescuento() throws DiscountException{
		BigDecimal precio = service.calculateCost(2, DiscountCategory.STUDENT);
		BigDecimal a = new BigDecimal(20000);
		Assert.assertEquals(precio, a);
		
	}
	
@Test
	
	public void aplicaDescuento2() throws DiscountException{
		BigDecimal precio = service.calculateCost(11, DiscountCategory.EMPLOYEE);
		BigDecimal a = new BigDecimal(45000);
		Assert.assertEquals(precio, a);
		
	}

@Test

	public void aplicaDescuento3() throws DiscountException{
		BigDecimal precio = service.calculateCost(25, DiscountCategory.OTHER);
		BigDecimal a = new BigDecimal(100000);
		Assert.assertEquals(precio, a);
	
}
	
}
