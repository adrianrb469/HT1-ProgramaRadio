
public interface IRadio {
	
	/***
	 * Obtiene el estado del radio
	 * @return Devuelve true si esta encendido y false si esta apagado
	 */
	boolean getStatus();
	
	/***
	 * Apaga o enciende el radio
	 */
	void switchButton();
	
	/***
	 * Cambia de el modo del radio de FM a AM o viceversa
	 */
	void changeMode();
	
	/***
	 * Obtiene el modo del radio.
	 * @return Devuelve 0 si es AM y 1 si es FM
	 */
	int getActualMode();
	
	/*** 
	 * Guarda una emisora AM en el slot indicado
	 * @param slot es un numero del 1 al 12 en donde se guardara la emisora 
	 * @param freq es la emisora que se desea guardar 
	 */
	void saveInAM(int slot, int freq);
	
	/*** 
	 * Guarda una emisora FM en el slot indicado
	 * @param slot es un numero del 1 al 12 en donde se guardara la emisora 
	 * @param freq es la emisora que se desea guardar 
	 */
	void saveInFM(int slot, double freq);
	
	/***
	 * 
	 * @param slot
	 * @return la frequencia de la emisora guardada
	 */
	double getSavedFreqFM(int slot);
	
}
