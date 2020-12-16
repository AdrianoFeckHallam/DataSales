package buffer;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Writer extends Buffer {
	
	public static void getWriter() {
		Writer writer = new Writer();
		
		writer.getWriter(Reader.getReader());
	}
	
	public void getWriter(Reader reader) {
		File dirOut = new File(getHome() + "\\data\\out");
		if (!dirOut.exists()) {
			dirOut.mkdirs();
		}
		
		Integer quantClient = reader.getListClient().size();
		Integer quantSalesman = reader.getListSalesman().size();
		Integer maxIdSales = 0;
		String worstSalesman = "Adriano";
		
		String[] lines = new String[] {"Quantidade de clientes no arquivo de entrada: " + quantClient, "Quantidade de vendedores no arquivo de entrada: " + quantSalesman,
				"ID da venda mais cara: " + maxIdSales, "O pior vendedor: " + worstSalesman};
		
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
