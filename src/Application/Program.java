package Application;
import buscas.Buscar;
import ordenação.Ordenar;
public class Program {

	public static void main(String[] args) {
		
		
		
		int[] arrayO = {0,1,2,3,4,5,6,7,8,9,10};
		int[] arrayD = {0,2,31,1,324,2,1,123,54,3,7};
		
		int num=10;
		//buscas
		System.out.println(Buscar.buscaLinear(arrayO,num));
		System.out.println(Buscar.buscaLinearRecursiva(arrayO,num ));
		System.out.println(Buscar.buscaBinaria(arrayO, num));
		System.out.println(Buscar.buscaBinariaRecursiva(arrayO, num,0,arrayO.length-1));
		
		//ordenação
		printArray(Ordenar.bubbleSort(arrayD));
		printArray(Ordenar.insertionSort(arrayD));
		printArray(Ordenar.selectionSort(arrayD));
		
	}
	public static void printArray(int array[]) {
		System.out.print("{");
		for(int num:array) {
			System.out.print(num);
			System.out.print(",");
		}System.out.print("}\n");
	}

}
