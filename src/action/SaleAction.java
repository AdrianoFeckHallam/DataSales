package action;

import java.util.List;

import entities.Item;
import entities.Sale;

public class SaleAction implements Action {

	@Override
	public Sale getList(String line) {
		String[] collumn = line.split("ç");
		
		int saleId = Integer.parseInt(collumn[1]);
		
		String salesmanName = collumn[3];
		
		Sale sale = new Sale(saleId, ItemAction.getList(line), salesmanName);
		
		return sale;
	}
	
	public static Integer getMaxIdSales(List<Sale> sales) {	
		double max = 0.0;
		int maxId = 0;
		boolean first = true;
		
		for (Sale sale : sales) {
			double total = 0.0;
			
			List<Item> itens = sale.getItems();
			
			for (Item item: itens) {
				total += item.getItemPrice() * item.getItemQuantity();				
			}
			
			if (first) {
				max = total;
				maxId = sale.getSaleId();
				first = false;
			}else if (total > max) {
				max = total;
				maxId = sale.getSaleId();
			}
		}
		return maxId;
	}
	
	public static String getWorstSalesman(List<Sale> sales) {
		double min = 0.0;
		String worstSalesman = "";
		boolean first = true;
		
		for (Sale sale : sales) {
			double total = 0.0;
			
			List<Item> itens = sale.getItems();
			
			for (Item item: itens) {
				total += item.getItemPrice() * item.getItemQuantity();				
			}
			
			if (first) {
				min = total;
				worstSalesman = sale.getSalesmanName();
				first = false;
			}else if (total < min) {
				min = total;
				worstSalesman = sale.getSalesmanName();
			}
		}
		return worstSalesman;
	}
}
