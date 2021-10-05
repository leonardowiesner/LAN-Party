import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		int nfilas = 0;
		int x = 0;
		int ncolumnas = 0;

		System.out.println("LAN PARTY");

		System.out.println("Introduce cuaantas filas deseas printar");
		nfilas = sc.nextInt();

		System.out.println("Introduce cuantas columnas deseas printar");
		ncolumnas = sc.nextInt();

		for (int i = 1; i <= nfilas; i++) {
			for (x = 1; x <= ncolumnas; x++) {
				System.out.print(x + " ");

			}
			System.out.println("");
			x++;
		}

	}

}
