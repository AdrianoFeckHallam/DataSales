package action;

import entities.Client;

public class ClientAction {

	public static Client getList(String line){
		String[] collumn = line.split("ç");
		
		Long cnpj = Long.parseLong(collumn[1]);
		String name = collumn[2];
		String businessArea = collumn[3];
		
		Client client = new Client(cnpj, name, businessArea);
		
		return client;
	}
}
