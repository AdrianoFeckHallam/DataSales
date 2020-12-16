package entities;

import java.util.List;

public class Sale {
	private Integer saleId;
	private List<Item> items;
	private String salesmanName;
	
	public Sale() {
		
	}

	public Sale(Integer saleId, List<Item> items, String salesmanName) {
		this.saleId = saleId;
		this.items = items;
		this.salesmanName = salesmanName;
	}

	public Integer getSaleId() {
		return saleId;
	}

	public void setSaleId(Integer saleId) {
		this.saleId = saleId;
	}

	public List<Item> getItems() {
		return items;
	}

	public void addItems(Item item) {
		items.add(item);
	}

	public String getSalesmanName() {
		return salesmanName;
	}

	public void setSalesmanName(String salesmanName) {
		this.salesmanName = salesmanName;
	}

	@Override
	public String toString() {
		return "Sale [saleId=" + saleId + ", items=" + items + ", salesmanName=" + salesmanName + "]";
	}
}
