package ordenação;

public class Ordenar {
	public static int[] bubbleSort(int array[]) {
		int aux=0;
		boolean tr=true;
		while(tr) {
			tr=false;
		for (int i = 0 ; i<array.length-1;i++) {
			if (array[i+1]<array[i]) {
				aux=array[i];
				array[i]=array[i+1];
				array[i+1]=aux;
				tr=true;
				
			}}
			
		}
		
		
		
		return array;
		
	}
}
