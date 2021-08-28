package com.acn.designPattern;

public class PaypalPayment implements StrategyPattern{
	private String email;
	private String pw;
	public PaypalPayment(String email,String pw) {
		this.email=email;
		this.pw=pw;
	}
	@Override
	public void pay(int amount) {
		System.out.println(amount+" amount Paid using Paypal");
		
	}

}
