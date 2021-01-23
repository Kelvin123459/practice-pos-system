package items;

import java.util.ArrayList;
import java.util.Iterator;

import abstracts.Item;

public class Dish extends Item implements Iterable<Ingredient>{

	public Dish(int itemID, String itemName, double itemPrice, boolean veganTag, boolean vegetarianTag, boolean dishTag) {
		super(itemID, itemName, itemPrice, veganTag, vegetarianTag, dishTag);
		
	}

	private ArrayList<Ingredient> ingredients = new ArrayList<Ingredient>();
	private String type; //dessert, main dish, etc. 
	
	
	public boolean veganDish() { //iterates over ingredients to check if dish is vegan
		for (Item ing: this.ingredients){
			if(ing.isVeganTag()!=true) {
				return false;
			}
		}
		return true;
	}

	public ArrayList<Ingredient> getIngredients() {
		return ingredients;
	}


	public void addIngredients(Ingredient ingredient) {
		ingredients.add(ingredient);
	}


	public String getType() {
		return type;
	}


	public void setType(String type) {
		this.type = type;
	}


	@Override
	public Iterator<Ingredient> iterator() {
		return ingredients.iterator();
	}
}
