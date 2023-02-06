package com.app.combustivel;

import javax.swing.JOptionPane;

public class AppCombustivel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Instanciando os objetos
		Combustivel combustivel = new Combustivel();
				
		// DEclaração de variáveis
		String valorGasolina;
		String valorEtanol;
		String msg;
		
		// Declaração de array
		Object[] continuar = {"Continuar", "Sair"};
		Object desejaContinuar;
		
		// Algoritmo
		do {
			// Recebe os valores dos combustíveis pelo usuário
			valorGasolina = JOptionPane.showInputDialog("Valor da gasolina:");
			valorEtanol = JOptionPane.showInputDialog("Valor do etanol:");
			
			// Converte vírgula para ponto
			valorGasolina = valorGasolina.replace(",", ".");
			valorEtanol = valorEtanol.replace(",", ".");
			
			// Converte os valores para double e repassa para o método
			msg = combustivel.calcular(Double.parseDouble(valorGasolina), Double.parseDouble(valorEtanol));
			
			// Exibe a resposta na tela
			JOptionPane.showMessageDialog(null, msg);
			
			// Exibe as opções de continuar ou não
			desejaContinuar = JOptionPane.showInputDialog(null, "Deseja continuar?", "Continuar", JOptionPane.INFORMATION_MESSAGE, null, continuar, continuar[0]);
		} while (desejaContinuar == "Continuar");
		
		// Encerrar o programa
		System.exit(0);
	}

}
