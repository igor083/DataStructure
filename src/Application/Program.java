package Application;
import buscas.Buscar;
public class Program {

	public static void main(String[] args) {
		int[] array = {0,1,2,3,4,5,6,7,8,9,10};
		int num=10;
		System.out.println(Buscar.buscaLinear(array,num));
		System.out.println(Buscar.buscaLinearRecursiva(array,num ));
		System.out.println(Buscar.buscaBinaria(array, num));
		System.out.println(Buscar.buscaBinariaRecursiva(array, num,0,array.length-1));
		
	}

}
