package entities;

public class Item {
	private Integer itemID;
	private Integer itemQuantity;
	private Double itemPrice;
	
	public Item() {
		
	}

	public Item(Integer itemID, Integer itemQuantity, Double itemPrice) {
		this.itemID = itemID;
		this.itemQuantity = itemQuantity;
		this.itemPrice = itemPrice;
	}

	public Integer getItemID() {
		return itemID;
	}

	public void setItemID(Integer itemID) {
		this.itemID = itemID;
	}

	public Integer getItemQuantity() {
		return itemQuantity;
	}

	public void setItemQuantity(Integer itemQuantity) {
		this.itemQuantity = itemQuantity;
	}

	public Double getItemPrice() {
		return itemPrice;
	}

	public void setItemPrice(Double itemPrice) {
		this.itemPrice = itemPrice;
	}

	@Override
	public String toString() {
		return "Item [itemID=" + itemID + ", itemQuantity=" + itemQuantity + ", itemPrice=" + itemPrice + "]";
	}
}
