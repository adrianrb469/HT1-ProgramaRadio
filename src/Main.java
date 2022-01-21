import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		boolean running = true;
		int option = 0;
		Radio radio = new Radio();
		int slot;
		int freqAM;
		float freqFM;

		while (running == true) {
			System.out.println(
					"1.Prender/Apagar radio\n2.Cambiar tipo de frecuencia\n3.Avanzar en el dial de emisoras\n4.Guardar emisora\n5.Seleccionar emisora");
			option = Integer.parseInt(input.nextLine());
			switch (option) {
			case 1:
				radio.switchButton();
				System.out.println(radio.getStatus());
				break;
			case 2:
				radio.changeMode();
				System.out.println(radio.getActualMode());
				break;
			case 3:
				radio.moveForward();
				if (radio.getActualMode() == 0) {
					System.out.println(radio.getActualFreqAM());
				} else {
					System.out.println(radio.getActualFreqFM());
				}
				break;
			case 4:
				System.out.println("Ingrese el espacio donde desea guardar la emisora (1-12)");
				slot = Integer.parseInt(input.nextLine());
				if (radio.getActualMode() == 0) {

					System.out.println("Ingrese la frequencia AM");
					freqAM = Integer.parseInt(input.nextLine());
					radio.saveInAM(slot, freqAM);

				} else {

					System.out.println("Ingrese la frequencia FM");
					freqFM = Float.parseFloat(input.nextLine());
					radio.saveInFM(slot, freqFM);
				}
				break;
			case 5:
				System.out.println("Ingrese el espacio donde se encuentra su emisora de eleccion (1-12)");
				slot = Integer.parseInt(input.nextLine());
				if (radio.getActualMode() == 0) {
					System.out.println(radio.getSavedFreqAM(slot));
				} else {
					System.out.println(radio.getSavedFreqFM(slot));
				}
				break;
			}
		}
	}
}
