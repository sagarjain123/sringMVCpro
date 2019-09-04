package com.avg.vij.dto;

import java.io.Serializable;
import java.math.BigDecimal;

public class RechargeDTO implements Serializable {
         
	private BigDecimal mobileNo;
	private int amount;
	private String networkProvider;
	private String plan;
	
	public RechargeDTO() {
		System.out.println(this.getClass().getSimpleName()+"created");
	}

	public BigDecimal getMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(BigDecimal mobileNo) {
		this.mobileNo = mobileNo;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	public String getNetworkProvider() {
		return networkProvider;
	}

	public void setNetworkProvider(String networkProvider) {
		this.networkProvider = networkProvider;
	}

	public String getPlan() {
		return plan;
	}

	public void setPlan(String plan) {
		this.plan = plan;
	}
	
}
