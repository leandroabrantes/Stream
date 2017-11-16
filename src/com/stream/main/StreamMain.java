package com.stream.main;

import java.util.ArrayList;
import java.util.List;

import com.stream.stream.Stream;

public class StreamMain {

	public static Character firstChar(Stream input) throws Exception {

		List<Character> caracteresNaoRepetidos = new ArrayList<Character>();
		List<Character> caracteresRepetidos = new ArrayList<Character>();
		List<Character> vogaisRepetidas = new ArrayList<Character>();

		String vogais = "aeiouAEIOU";

		Character letraAnterior = null;
		Character letraAtual = null;

		boolean isCaractereRepetido = false;
		boolean isConsoante = false;

		while (input.hasNext()) {
			letraAtual = input.getNext();
			isCaractereRepetido = false;

			if (!caracteresRepetidos.contains(letraAtual)) {

				if (caracteresNaoRepetidos.contains(letraAtual)) {
					isCaractereRepetido = true;
					caracteresNaoRepetidos.remove(letraAtual);
					caracteresRepetidos.add(letraAtual);

				} else {
					caracteresNaoRepetidos.add(letraAtual);
				}

			} else {
				isCaractereRepetido = true;
			}

			if (!vogais.contains(letraAtual.toString())) {
				if (letraAnterior != null && vogais.contains(letraAnterior.toString()))
					isConsoante = true;

			} else {
				if (isCaractereRepetido == false && isConsoante == true)
					vogaisRepetidas.add(letraAtual);

			}
			letraAnterior = letraAtual;

		}

		if (vogaisRepetidas.size() > 0)
			return vogaisRepetidas.get(0);
		else
			throw new Exception("Caracter não encontrado");

	}

}
