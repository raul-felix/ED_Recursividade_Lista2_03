package view;

import controller.VetorController;

public class Main {
	
	public static void main(String[] args) {
		
		VetorController vetController = new VetorController();
		
		int[] vet = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		int tamanho = vet.length;
		
		int resultado = vetController.quantidadePares(vet, tamanho, 0);
		
		System.out.println("A quantidade de números pares no vetor é: " + resultado);
	}

}
