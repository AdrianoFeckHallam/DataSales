package action;

import entities.Salesman;

public class SalesmanAction implements Action {
	@Override
	public Salesman getList(String line) {
		String[] collumn = line.split("ç");
		
		Long cpf = Long.parseLong(collumn[1]);
		String name = collumn[2];
		Double salary = Double.parseDouble(collumn[3]);
		
		Salesman salesman = new Salesman(cpf, name, salary);
		
		return salesman;
	}
}
