/**
 * Universidad Del Valle de Guatemala 
 * Algoritmos y Estructura de Datos 
 * Seccion 10 
 * Pedro Joaquin Castillo Coronado     14224
 * Freddy Josue Ruiz Gatica            14592
 * Christopher Antonio Chiroy Miranda  14411
 * Boris Ramiro Cifuentes de Leon	   14150
 * 
 *
 */
public class particion {
  /**
	 *Se declaran los atributos
	 */
	int[] arreglo={9,8,5,3,20,25,31,40,8,10};
/**
* Método: partida
* Funcionalidad:
* Este método es el encargado de "dividir" la lista en 2. Del lado izquierdo al pivote estarán
* los números menores a el y del lado derecho del pivote estarán los números mayores a él. Y
* retornará la posición actual del indicador izquierdo.
* @param izq =Posición incial de la lista/der= posición length-1 del array
* @return izq
*/
public int partida (int izq, int der){
	   int pivot=((izq+der)/2);
		int swapVal=0;
		while(izq < der){ 
			while (arreglo[izq] < arreglo[pivot]){ //Si el valor izquierdo es menor que el pivote
				izq++;} //Mueve el puntero izquierdo
		
		   while (arreglo[der] > arreglo[pivot]){ //Si el valor derecho es mayor que el pivote
			   der--; //Mueve el puntero derecho
		   }
		    if (izq <= der){
		    	swapVal=arreglo[izq]; //Guarda en swapVal el valor izquierdo
		    	arreglo[izq]=arreglo[der]; //Almacena en el lugar izquierdo el valor derecho
		    	arreglo[der]=swapVal; //Almacena en el lugar derecho el valor izquierdo
		    	izq++; //Mueve uno la posición izqueirda
		    	der--; //Mueve uno la posición derecha
		    }  
	}
		  return izq;
}
/**
* Método: quickSort
* Funcionalidad:
* Después que el método "partida" divida la lista en 2. Y del lado izquierdo al pivote estén los números
* menores a el y a la derecha números mayores a él. Se encargará de realizar el sorting para obtener
* una lista ordenanda de los valores ingresados
* @param izq =Posición incial de la lista/der= posición length-1 del array
*/
public void quickSort(int izq, int der) {
    int indice = partida(izq, der);
    if (izq < indice - 1){
          quickSort(izq, indice-1);
    }
    if (indice < der){
          quickSort(indice, der);
    }
    for (int i=0; i<arreglo.length;i++){
    System.out.print(" "+arreglo[i]); 
    }
    System.out.println();
}
/**
* Se realizan las pruebas del Sorting
*/
public static void main(String[] args){
	particion pruebaSort= new particion();
	pruebaSort.quickSort(0,9);
	
	
}

}
