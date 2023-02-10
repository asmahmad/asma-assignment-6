package com.coderscampus;

import java.time.YearMonth;

public class SalesData {
	
	private Integer salePrice;
	private YearMonth saleDate;
	
	
	public SalesData(YearMonth yearMonth, Integer salePrice) {
		this.saleDate = yearMonth;
		this.salePrice = salePrice;		
	}

	public Integer getSalePrice() {
		return salePrice;
	}

	public void setSalePrice(Integer salePrice) {
		this.salePrice = salePrice;
	}

	public YearMonth getSaleDate() {
		return saleDate;
	}

	public void setSaleDate(YearMonth saleDate) {
		this.saleDate = saleDate;
		
	}

	@Override
	public String toString() {
		return "Sales [saleDate=" + saleDate + ", salePrice=" + salePrice + "]";
	}
	
}
