package action;

import java.util.List;

import entities.Item;
import entities.Sale;

public class SaleAction {

	public static Sale getList(String line){
		String[] collumn = line.split("ç");
		
		int saleId = Integer.parseInt(collumn[1]);
		
		String salesmanName = collumn[3];
		
		Sale sale = new Sale(saleId, ItemAction.getList(line), salesmanName);
		
		return sale;
	}
	
	public static Integer getMaxIdSales(List<Sale> sales) {	
		double maiorValor = 0.0;
		int maxId = 0;
		
		for (Sale sale : sales) {

			double valorTotal = 0.0;
			
			List<Item> itens = sale.getItems();
			
			for (Item item: itens) {
				valorTotal += item.getItemPrice() * item.getItemQuantity();				
			}
			
			if (valorTotal > maiorValor) {
				maiorValor = valorTotal;
				maxId = sale.getSaleId();
			}
		}
		
		return maxId;
	}
}
