package com.acn.designPattern;

public class DebitcardPayment implements StrategyPattern{
	private String cardNo;
	private String cvv;
	private String expiry;
	
	public DebitcardPayment(String cardNo, String cvv, String expiry) {		
		this.cardNo = cardNo;
		this.cvv = cvv;
		this.expiry = expiry;
	}

	@Override
	public void pay(int amount) {
		System.out.println(amount+" amount Paid using debitCard");
		
	}
	
	
}
