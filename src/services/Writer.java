package services;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import data.DataOut;

public class Writer extends Directory {
	
	public static void getWriter() {		
		loadingWriter(Reader.getReader());
	}
	
	public static void loadingWriter(Reader reader) {
		File dirOut = new File(getHome() + getDirOut());
		if (!dirOut.exists()) {
			dirOut.mkdirs();
		}
				
		DataOut.loadingDataOut(reader);
		
		String[] lines = new String[] {"Quantidade de clientes no arquivo de entrada: " + DataOut.getQuantClient(), "Quantidade de vendedores no arquivo de entrada: " + DataOut.getQuantSalesman(),
				"ID da venda mais cara: " + DataOut.getMaxIdSales(), "O pior vendedor: " + DataOut.getWorstSalesman()};
		
		String path = dirOut + "\\out.txt";
		
		try (BufferedWriter bw = new BufferedWriter(new FileWriter(path))) {
			for (String line : lines) {
				bw.write(line);
				bw.newLine();
			}
		} catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}
	}
}
