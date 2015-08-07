
/**
 * @author Christopher Chiroy
 *
 */
public class SelectionSort {
	
	private int[] ordenados={1,2,3,4,5,6,7,8,9};
	private int recorridos;
	private int posicion;
	private int largo;
	private int n1, n2, n3, n4;
	
	public SelectionSort(){
		recorridos = 0;
		largo = ordenados.length;
		posicion=0;
	}
	
	
	public void ordenar(){
		for(int i=0; i<(largo); i++){
			System.out.print(ordenados[i]+",");
		}
		System.out.println();
		System.out.println();
		while(recorridos<(largo)){
			n1=ordenados[recorridos];
			n4=n1;
			n3=recorridos;
			for(posicion=recorridos; posicion<largo-1; posicion++){
				n2=ordenados[posicion+1];
				
				if(n1>=n2){
					n1=n2;
					n3 = posicion+1;
				}
			}
			ordenados[recorridos]=n1;
			ordenados[n3]=n4;
			recorridos++;
			
			for(int i=0; i<(largo); i++){
				System.out.print(ordenados[i]+",");
			}
			System.out.println();
		}
  		System.out.println("El arreglo ordenado es asi:");
	  	for(int i=0; i<(largo); i++){
			System.out.print(ordenados[i]+",");
		}
	}
	
	public static void main(String args[]){
		SelectionSort seleccion = new SelectionSort();
		seleccion.ordenar();
	}
	
	

}
