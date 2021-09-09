package edu.eci.cvds.ecibook.model;

public class DiscountException extends Exception{
	public static final String MENOR = "No puede ser menor de 1";
	public static final String MAYOR = "No puede ser mayor a 30";
	
	public DiscountException (String o ) {
		super(o);
	}

}