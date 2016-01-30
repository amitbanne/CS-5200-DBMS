package com.neu.trash2treasure.beans;

public class AdminSummary {
	private int noItemsUnsold = 0;
	private int noItemsSold = 0;
	private int noItemsPending = 0;
	
	public int getNoItemsUnsold() {
		return noItemsUnsold;
	}
	public void setNoItemsUnsold(int noItemsUnsold) {
		this.noItemsUnsold = noItemsUnsold;
	}
	public int getNoItemsSold() {
		return noItemsSold;
	}
	public void setNoItemsSold(int noItemsSold) {
		this.noItemsSold = noItemsSold;
	}
	public int getNoItemsPending() {
		return noItemsPending;
	}
	public void setNoItemsPending(int noItemsPending) {
		this.noItemsPending = noItemsPending;
	}
	@Override
	public String toString() {
		return "AdminSummary [noItemsUnsold=" + noItemsUnsold + ", noItemsSold=" + noItemsSold + ", noItemsPending="
				+ noItemsPending + "]";
	}
	
	
	
	
}
