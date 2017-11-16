package com.stream.application;

import java.util.Scanner;

import com.stream.main.StreamMain;
import com.stream.stream.Stream;
import com.stream.stream.StreamImpl;

public class Application   {
	
	public static void main(String[] args) throws Exception {

		try {
			
			String caracteres = "aAbBABacafe";
			
			Scanner scanner = new Scanner(System.in);
            System.out.println("Digite uma palavra::");
            caracteres= scanner.next();
            scanner.close(); 
			
            Stream result = new StreamImpl(caracteres);

			char resultado = StreamMain.firstChar(result);

			System.out.println("Resultado: " + resultado);

		} catch (Exception ex) {
			System.out.println("Erro na execução do programa: " + ex.getMessage());
		}

	}
  
}
