package application;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
// leitura de arquivo comum
public class program {
	public static void main(String[] args) {
		File file = new File("C:\\Everthing\\Java\\Arquivos em Java\\leitura.txt");
		Scanner sc = null;
		try {
			sc = new Scanner(file);
			while (sc.hasNextLine()) {
				System.out.println(sc.nextLine());
			}
		} catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		} finally {
			if (sc != null) {
				sc.close();
			}
		}
	}
}