package buscas;

public class Buscar {
	private static int iterador = 0;

	public static int buscaLinear(int[] array, int num) {
		for (int i = 0; i < array.length; i++) {
			if (array[i] == num)
				return 1;
		}
		return 0;
	}

	public static int buscaLinearRecursiva(int[] array, int num) {
		if (iterador >= array.length) { 
			return 0; 
		} else if (array[iterador] == num)
			return 1;
		else {
			iterador++;
			return buscaLinearRecursiva(array, num);
		}
	}

	public static int buscaBinaria(int[] array, int num) {
		int esquerda = 0;
		int direita = array.length - 1;

		while (esquerda <= direita) {
			int meio = (esquerda + direita) / 2;
			if (array[meio] == num) {
				return 1;
			} else if (array[meio] < num) {
				esquerda = meio + 1;
			} else {
				direita = meio - 1;
			}
		}

		return 0;
	}

	public static int buscaBinariaRecursiva(int[] array, int num, int esquerda, int direita) {
		if (esquerda > direita) { 
			return 0;
		}

		int meio = (esquerda + direita) / 2;
		if (array[meio] == num) { 
			return 1;
		} else if (array[meio] < num) {
			return buscaBinariaRecursiva(array, num, meio + 1, direita);
		} else { 
			return buscaBinariaRecursiva(array, num, esquerda, meio - 1);
		}
	}
}
