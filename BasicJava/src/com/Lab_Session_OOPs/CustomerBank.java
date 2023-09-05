package com.Lab_Session_OOPs;

public class CustomerBank {

	private int custId;
	private String custName;
	private float cheackBalance;
	private float creditMoney1;
	private float deditMoney1;
	
	
	public int getCustId() {
		return custId;
	}
	public void setCustId(int custId) {
		this.custId = custId;
	}
	public String getCustName() {
		return custName;
	}
	public void setCustName(String custName) {
		this.custName = custName;
	}
	public float getCheackBalance() {
		return cheackBalance;
	}
	public void setCheackBalance(float cheackBalance) {
		this.cheackBalance = cheackBalance;
	}
	@Override
	public String toString() {
		return "CustomerBank [custId=" + custId + ", custName=" + custName + ", cheackBalance=" + cheackBalance
				+ ", creditMoney1=" + creditMoney1 + ", deditMoney1=" + deditMoney1 + "]";
	}
	
	

	


}
