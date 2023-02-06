package com.app.combustivel;

public class Combustivel {
    // Atributos
	public String tipo;
	
	// Método
	public String calcular(double gasolina, double etanol) {
		if ((etanol/gasolina)>= 0.7)
			return "Melhor abastecer com gasolina.";
		else
			return "Melhor abastecer com etanol.";
	}
}
