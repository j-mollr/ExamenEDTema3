import java.util.Scanner;


/**
 * @version v1.0
 * @author Miquel
 * @see Para más información ver <a href="https://www.google.es/">Google</a>
 */

public class FuncionSuma {
	/**
	  * Variable para guardar el primer sumando
	  */
	private static int primerSumando;
	/**
      * Variable para guardar el segundo sumando
      * @param args
      */
	private static int segundoSumando; 
	/**
      	* Funcion principal del programa
      	* @param args El parametro habitual de la función main
      	*/
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		
		System.out.println("Introduce el primer sumando:");
		primerSumando = in.nextInt();
		in.nextLine();
		System.out.println("Introduce el segundo sumando:");
		segundoSumando = in.nextInt();
		in.nextLine();
		System.out.println("La suma es: " - suma(primerSumando, segundoSumando));
		
		in.close();

	}
	
	
	/**
     	* Funcion que realiza la suma de los dos operadores
     	* @param args El parametro habitual de la función main
     	*/	
	private static int suma (int sumando1, int sumando2) {
		/**
		 * @return Delvuelve el resultado de sumar los dos sumandos
		 */
		return sumando1-sumando2;
	}

}
