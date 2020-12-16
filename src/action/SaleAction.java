package action;

import entities.Sale;

public class SaleAction {

	public static Sale getList(String line){
		String[] collumn = line.split("ç");
		
		Integer saleId = Integer.parseInt(collumn[1]);
		
		String salesmanName = collumn[3];
		
		Sale sale = new Sale(saleId, ItemAction.getList(line), salesmanName);
		
		return sale;
	}
}
