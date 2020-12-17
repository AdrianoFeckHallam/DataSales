package data;
import action.SaleAction;
import services.Reader;

public class DataOut {
	
	private Integer quantClient;
	private Integer quantSalesman;
	private Integer maxIdSales;
	private String worstSalesman;
	
	public void loadingDataOut(Reader reader) {
		quantClient = reader.getListClient().size();
		quantSalesman = reader.getListSalesman().size();
		maxIdSales = SaleAction.getMaxIdSales(reader.getListSale());
		worstSalesman = SaleAction.getWorstSalesman(reader.getListSale());
	}
	
	public Integer getQuantClient() {
		return quantClient;
	}

	public Integer getQuantSalesman() {
		return quantSalesman;
	}
	
	public Integer getMaxIdSales() {
		return maxIdSales;
	}
	
	public String getWorstSalesman() {
		return worstSalesman;
	}
}
