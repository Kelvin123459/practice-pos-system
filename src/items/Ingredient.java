package items;

import abstracts.Item;

public class Ingredient extends Item{

	public Ingredient(int itemID, String itemName, double itemPrice, boolean veganTag, boolean dishTag) {
		super(itemID, itemName, itemPrice, veganTag, dishTag);
	}
	
}
