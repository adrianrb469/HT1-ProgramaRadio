
public class Radio implements IRadio {
	private boolean turnedOn = false;
	private int radioMode = 0; // 0 = AM 1 = FM
	private int[] savedAM = new int[12]; // sube en multiplos de 10
	private double[] savedFM = new double[12]; // sube en multiplos de 0.2
	private int actualFreqAM = 530;
	private double actualFreqFM = 87.9;

	@Override
	public boolean getStatus() {

		return turnedOn;
	}

	@Override
	public void switchButton() {
		if (getStatus() == false) {
			turnedOn = true;
		} else {
			turnedOn = false;
		}

	}

	@Override
	public void changeMode() {
		if (getActualMode() == 0) {
			radioMode = 1;
		} else {
			radioMode = 0;
		}

	}

	@Override
	public int getActualMode() {

		return radioMode;
	}

	@Override
	public void saveInAM(int slot, int freq) {
		savedAM[slot - 1] = freq;

	}

	@Override
	public int getSavedFreqAM(int slot) {
		actualFreqAM = savedAM[slot - 1];
		return savedAM[slot - 1];
	}

	@Override
	public void saveInFM(int slot, double freq) {
		savedFM[slot - 1] = freq;

	}

	@Override
	public double getSavedFreqFM(int slot) {
		actualFreqFM = savedFM[slot - 1];
		return savedFM[slot - 1];
	}

	@Override
	public int getActualFreqAM() {

		return actualFreqAM;
	}

	@Override
	public double getActualFreqFM() {

		return actualFreqFM;
	}

	@Override
	public void moveForward() {

		if (getActualMode() == 0) {

			if (actualFreqAM >= 1610) {
				actualFreqAM = 530;
			} else {
				actualFreqAM += 10;
			}
		} else {
			if (actualFreqFM >= 107.9) {
				actualFreqFM = 87.9;
			} else {
				actualFreqFM += 0.2;
			}
		}
	}

	@Override
	public void moveBackward() {
		// TODO Auto-generated method stub

	}

	@Override
	public void seek() {
		// TODO Auto-generated method stub

	}
}
