package abstracts;

import java.util.Iterator;

public abstract class Item{
	private int itemID;
	private String itemName;
	private double itemPrice;
	private boolean veganTag;
	private boolean vegetarianTag;
	private boolean dishTag;

	public Item(int itemID, String itemName, double itemPrice, boolean veganTag, boolean vegetarianTag, boolean dishTag) {
		super();
		this.itemID = itemID;
		this.itemName = itemName;
		this.itemPrice = itemPrice;
		this.veganTag = veganTag;
		this.dishTag = dishTag;
		this.vegetarianTag = vegetarianTag;
	}
	
	public boolean isVeganTag() {
		return veganTag;
	}
	public void setVeganTag(boolean veganTag) {
		this.veganTag = veganTag;
	}
	public int getItemID() {
		return itemID;
	}
	public void setItemID(int itemID) {
		this.itemID = itemID;
	}
	public String getItemName() {
		return itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	public double getItemPrice() {
		return itemPrice;
	}
	public void setItemPrice(double itemPrice) {
		this.itemPrice = itemPrice;
	}
	public boolean isDishTag() {
		return dishTag;
	}

	public void setDishTag(boolean dishTag) {
		this.dishTag = dishTag;
	}

	public boolean isVegetarianTag() {
		return vegetarianTag;
	}

	public void setVegetarianTag(boolean vegetarianTag) {
		this.vegetarianTag = vegetarianTag;
	}
}
