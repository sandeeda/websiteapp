package com.sandeep.websiteapp.entity;

public class Item {
	private int itemId;
	private int itemQuantity;
	private int itemProductId;
	private int productPrice;
	public Item(int itemId, int itemQuantity, int itemProductId, int productPrice) {
		super();
		this.itemId = itemId;
		this.itemQuantity = itemQuantity;
		this.itemProductId = itemProductId;
		this.productPrice = productPrice;
	}
	public Item() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getItemId() {
		return itemId;
	}
	public void setItemId(int itemId) {
		this.itemId = itemId;
	}
	public int getItemQuantity() {
		return itemQuantity;
	}
	public void setItemQuantity(int itemQuantity) {
		this.itemQuantity = itemQuantity;
	}
	public int getItemProductId() {
		return itemProductId;
	}
	public void setItemProductId(int itemProductId) {
		this.itemProductId = itemProductId;
	}
	public int getProductPrice() {
		return productPrice;
	}
	public void setProductPrice(int productPrice) {
		this.productPrice = productPrice;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + itemId;
		result = prime * result + itemProductId;
		result = prime * result + itemQuantity;
		result = prime * result + productPrice;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Item other = (Item) obj;
		if (itemId != other.itemId)
			return false;
		if (itemProductId != other.itemProductId)
			return false;
		if (itemQuantity != other.itemQuantity)
			return false;
		if (productPrice != other.productPrice)
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Item [itemId=" + itemId + ", itemQuantity=" + itemQuantity + ", itemProductId=" + itemProductId
				+ ", productPrice=" + productPrice + "]";
	}
	
}
