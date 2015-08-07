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
public class InsertionSort {
	
	/**
	 *Se declaran los atributos
	 */
	private int[] arreglo={9,8,7,6,5,4,3,2,1,0};
	private int numerosYaOrdenados;
	private int index;
	private int longitud;
	
	/**
	 * Constructor de la Clase
	 * @param largo
	 */
	public InsertionSort(){
		//arreglo = [arreglo.length];
		longitud=arreglo.length;
		numerosYaOrdenados=1;
		index=0;
	}
	
	public void Ordenamiento(){
		while(numerosYaOrdenados<longitud){
			int datotemporal=arreglo[numerosYaOrdenados];
			for (index=numerosYaOrdenados; index>0; index--){
				if(datotemporal<arreglo[index-1]){
					int temp=arreglo[index-1];
					arreglo[index-1]=arreglo[index];
					arreglo[index]=temp;
				}
			}
			numerosYaOrdenados++;
		}
		for(int i=0;i<arreglo.length;i++){
			System.out.println(arreglo[i]);
		}
	}
	
	public static void main(String[] args){
		InsertionSort ordenamiento= new InsertionSort();
		ordenamiento.Ordenamiento();
	}
}
