package data;
import action.SaleAction;
import services.Reader;

public class DataOut {
	
	private static Integer quantClient;
	private static Integer quantSalesman;
	private static Integer maxIdSales;
	private static String worstSalesman;
	
	public static void loadingDataOut(Reader reader) {
		quantClient = reader.getListClient().size();
		quantSalesman = reader.getListSalesman().size();
		maxIdSales = SaleAction.getMaxIdSales(reader.getListSale());
		worstSalesman = SaleAction.getWorstSalesman(reader.getListSale());
	}
	
	public static Integer getQuantClient() {
		return quantClient;
	}

	public static Integer getQuantSalesman() {
		return quantSalesman;
	}
	
	public static Integer getMaxIdSales() {
		return maxIdSales;
	}
	
	public static String getWorstSalesman() {
		return worstSalesman;
	}
}
