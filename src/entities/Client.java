package entities;

public class Client {
	
	private Integer cnpj;
	private String name;
	private String businessArea;
	
	public Client() {
		
	}

	public Client(Integer cnpj, String name, String businessArea) {
		this.cnpj = cnpj;
		this.name = name;
		this.businessArea = businessArea;
	}

	public Integer getCnpj() {
		return cnpj;
	}

	public void setCnpj(Integer cnpj) {
		this.cnpj = cnpj;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBusinessArea() {
		return businessArea;
	}

	public void setBusinessArea(String businessArea) {
		this.businessArea = businessArea;
	}
}
