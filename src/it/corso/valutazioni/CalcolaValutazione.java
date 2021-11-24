package it.corso.valutazioni;

public class CalcolaValutazione {
	
	
	/*/Classe CalcolaValutazione con tre attributi: id dello studente (intero), percentuale assenze (intero), media voti (numero decimale). 
	 * La classe deve avere anche un metodo che calcola, in base a percentuale assenze e media voti, se lo studente è promosso o bocciato
	 * 
	 * 
	 */

	//proprietà
	int idStudente;
	int percAssenze;
	double mediaVoti;
	
	//Costruttore
	
	CalcolaValutazione (int idStudente, int percAssenze, double mediaVoti) {
		this.idStudente = idStudente;
		this.percAssenze =percAssenze;
		this.mediaVoti = mediaVoti;
		
	}
	
	//Metodi
	
	
	//Calcolo promosos o bocciato
	
	/*/
	 * se lo studente ha fatto più del 50% di assenze è bocciato
	   se ha fatto tra il 25% e il 50% di assenze è promosso solo se la media dei voti è superiore a 2
	   se ha fatto meno del 25% di assenze è promosso se la media dei voti è superiore o uguale a 2
	 * 
	 */
	
	
	
	
	
	
	
}