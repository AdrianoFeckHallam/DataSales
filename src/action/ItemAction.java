package action;

import java.util.ArrayList;
import java.util.List;

import entities.Item;

public class ItemAction {
	
	public static List<Item> getList(String line){
		String[] collumn = line.split("ç");
		
		String[] collumnAux = collumn[2].replace("[", "").replace("]", "").split(",");
		
		List<Item> items = new ArrayList<>();
		
		for (int i = 0; i < collumnAux.length; i++) {
			String[] itemV = collumnAux[i].split("-");
			
			Integer itemID = Integer.parseInt(itemV[0]);
			Integer itemQuantity = Integer.parseInt(itemV[1]);
			Double itemPrice = Double.parseDouble(itemV[2]);
			
			Item item = new Item(itemID, itemQuantity, itemPrice);
			
			items.add(item);
		}
		
		return items;
	}
}
