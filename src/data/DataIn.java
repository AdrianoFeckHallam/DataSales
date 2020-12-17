package data;

import action.ClientAction;
import action.SaleAction;
import action.SalesmanAction;

public class DataIn {

	private static SalesmanAction salesmanAction = new SalesmanAction();
	private static ClientAction clientAction = new ClientAction();
	private static SaleAction saleAction = new SaleAction();
	
	public static SalesmanAction getSalesmanAction() {
		return salesmanAction;
	}

	public static ClientAction getClientAction() {
		return clientAction;
	}

	public static SaleAction getSaleAction() {
		return saleAction;
	}	
}
