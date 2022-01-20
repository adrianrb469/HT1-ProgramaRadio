import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		boolean salir = false;
		int opcion = 0;
		Radio radio = new Radio();
		
		while (salir == false) {
			System.out.println(
					"1.Prender radio\n2.Cambiar tipo de frecuencia\n3.Avanzar en el dial de emisoras\n4.Guardar emisora\n5.Seleccionar emisora\n6.Apagar radio");
			opcion = Integer.parseInt(input.nextLine());
			switch (opcion) {
			case 1:
				
				break;
			case 2:

				break;
			case 3:

				break;
			case 4:

				break;
			case 5:

				break;
			case 6:

				break;
			}
		}
	}
}
