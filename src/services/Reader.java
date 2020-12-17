package services;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import data.DataIn;
import entities.Client;
import entities.Sale;
import entities.Salesman;

public class Reader extends Directory {
	
	private List<Salesman> listSalesman = new ArrayList<>();
	private List<Client> listClient = new ArrayList<>();
	private List<Sale> listSale = new ArrayList<>();
	
	public static Reader getReader() {
		Reader reader = new Reader();
		
		reader.loadingReader();
		
		return reader;
	}
	
	public void loadingReader() {
		File dirIn = new File(getHome() + getDirIn());
		if (!dirIn.exists()) {
			dirIn.mkdirs();
		}
		
		File[] files = dirIn.listFiles(File::isFile);
		for (File file : files) {
			if(file.toString().endsWith(".txt")) {
				try (BufferedReader br = new BufferedReader(new FileReader(file))) {
					String line = br.readLine();
					
					while (line != null) {
						if(line.contains("001ç")) {
							listSalesman.add(DataIn.getSalesmanAction().getList(line));
							
							line = br.readLine();
						} else if (line.contains("002ç")) {
							listClient.add(DataIn.getClientAction().getList(line));
						
							line = br.readLine();
						} else if (line.contains("003ç")) {
							listSale.add(DataIn.getSaleAction().getList(line));
							
							line = br.readLine();
						}
					}
				} catch (IOException e) {
					System.out.println("Error: " + e.getMessage());
				}
			}
		}
	}

	public List<Salesman> getListSalesman() {
		return listSalesman;
	}

	public List<Client> getListClient() {
		return listClient;
	}

	public List<Sale> getListSale() {
		return listSale;
	}
}
