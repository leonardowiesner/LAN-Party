import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		int nfilas = 0;
		int ncolumnas = 0;

		System.out.println("LAN PARTY");

		System.out.println("Introduce cuantas filas deseas mostrar en pantalla (Debe ser mayor a 0)");
		nfilas = sc.nextInt();
		System.out.println("Introduce cuantas columnas deseas printar");
		ncolumnas = sc.nextInt();

		for (int i = 0; i <= (nfilas - 1); i++) {
			for (int x = 0; x <= (ncolumnas - 1); x++) {
				System.out.print(i + "" + x + " ");
			}
			System.out.println();
			}
		}
	}
