package buffer;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import data.DataOut;

public class Writer extends Buffer {
	
	public static void getWriter() {
		Writer writer = new Writer();
		
		writer.loadingWriter(Reader.getReader());
	}
	
	public void loadingWriter(Reader reader) {
		File dirOut = new File(getHome() + "\\data\\out");
		if (!dirOut.exists()) {
			dirOut.mkdirs();
		}
		
		DataOut dataOp = new DataOut();
		
		dataOp.loadingDataOut(reader);
		
		String[] lines = new String[] {"Quantidade de clientes no arquivo de entrada: " + dataOp.getQuantClient(), "Quantidade de vendedores no arquivo de entrada: " + dataOp.getQuantSalesman(),
				"ID da venda mais cara: " + dataOp.getMaxIdSales(), "O pior vendedor: " + dataOp.getWorstSalesman()};
		
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
