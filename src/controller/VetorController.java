package controller;

public class VetorController {

	public VetorController() {
		super();
	}
	
	public int quantidadePares(int[] vet, int tamanho, int pares) {
		if (tamanho < 1) {
			return pares;
		} else {
			if (vet[tamanho - 1] % 2 == 0) {
				pares++;
			}
			return quantidadePares(vet, tamanho - 1, pares);
		}
	}
}
