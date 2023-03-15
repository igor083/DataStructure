package ordenação;

public class Ordenar {
	public static int[] bubbleSort(int array[]) {
		int aux=0;
		boolean troca=true;
		while(troca) {
			troca=false;
		for (int i = 0 ; i<array.length-1;i++) {
			if (array[i+1]<array[i]) {
				aux=array[i];
				array[i]=array[i+1];
				array[i+1]=aux;
				troca=true;
				
			}}
			
		}
		
		
		
		return array;
		
	}
	
	public static int[] insertionSort(int[] array) {
		 int n = array.length;  
	        for (int j = 1; j < n; j++) {  
	            int i = j-1;  
	            while ( (i > -1) && ( array [i] > array[j]) ) {  
	                array [i+1] = array [i];  
	                i--;  
	            }  
	            array[i+1] = array[j];  
	        }  
	        return array;
	    }  
	
	public static int[] selectionSort(int array[]) {
		
		for(int i=0;i<array.length-1;i++) {
			int menor = i;
			for (int j = i + 1; j < array.length; j++)
				if (array[j] < array[menor])
					menor = j;
			
			int aux = array[i];
			array[i] = array[menor];
			array[menor] = aux;
		}
		return array;
		
	}
	
	
	
	}
