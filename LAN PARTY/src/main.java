import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		int nfilas = 0; //Variable que define el numero de filas que ingresa el usuario 
		int ncolumnas = 0; //Variable que define el numero de columnas que ingresa el usuario

		System.out.println("LAN PARTY");

		System.out.println("Introduce cuantas filas deseas mostrar en pantalla (Debe ser mayor a 0)");
		nfilas = sc.nextInt(); //Lectura de el numero de filas que desea ingresar el usuario
		
		System.out.println("Introduce cuantas columnas deseas printar");
		ncolumnas = sc.nextInt();//Lectura de el numero de columnas que desea ingresar el usuario
		
		//Ciclo que valida el valor ingresado (FILAS)en caso de que fuera mayor a 10 o un numero negativo
		while (nfilas > 10 || nfilas < 0) {
			System.out.println("Vuelve a introducir un valor de fila ");//Mensaje solicitando el numero nuevamente
			nfilas = sc.nextInt();//Lectura del nuevo numero
		}
		
		//Ciclo que valida el valor ingresado (COLUMNAS)en caso de que fuera mayor a 10 o un numero negativo
		while (ncolumnas > 10 || ncolumnas < 0) {
			System.out.println("Vuelve a introducir un valor de columna ");//Mensaje solicitando nuevamente
			ncolumnas = sc.nextInt();
		}
	//Condicional en caso tal de que los valores ingresados sean 0 y la ejecuciòn muestre en pantalla la posiciòn 00
		if (ncolumnas == 0 || nfilas == 0) { 
			System.out.println("00");
		} else {//Si ingresa un valor diferente a 0 ejecutariamos los ciclos for
			for (int i = 0; i <= (nfilas - 1); i++) {//Ciclo que printa el numero de filas iniciando en 0 hasta el vaor ingresado restandole 1 al rango con paso 1
				System.out.println();//Espacio para que haga un salto de linea
				for (int x = 0; x <= (ncolumnas - 1); x++) {//Ciclo que printa las columnas desde 0 hasta el numero introducido de columnas -1 con un incremento
					System.out.print(i + "" + x + " ");//Finalmente imprimimos el index mas un espacio y el x (Filas,columnas)
				}

			}
		}

	}
}
