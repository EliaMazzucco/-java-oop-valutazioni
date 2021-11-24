package it.corso.valutazioni;

public class CalcolaValutazione {
	
	
	/*/Classe CalcolaValutazione con tre attributi: id dello studente (intero), percentuale assenze (intero), media voti (numero decimale). 
	 * La classe deve avere anche un metodo che calcola, in base a percentuale assenze e media voti, se lo studente � promosso o bocciato
	 * 
	 * 
	 */

	//propriet�
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
	 void calcolo () {
		 if(percAssenze > 50 ) {
			 System.out.println("Sei bocciato\n");			 	 
		 }else if (percAssenze >= 25 && percAssenze <= 50 && mediaVoti > 2) {
			 System.out.println("Promosso\n");			 
		 }else if(percAssenze < 25 && mediaVoti >= 2) {
			 System.out.println("Promosso\n");			 
		 }else {
			 System.out.println("Sei bocciato\n");
		 }
		 
	 }
	
	//Calcolo promosos o bocciato
	
	/*/
	 * se lo studente ha fatto pi� del 50% di assenze � bocciato
	   se ha fatto tra il 25% e il 50% di assenze � promosso solo se la media dei voti � superiore a 2
	   se ha fatto meno del 25% di assenze � promosso se la media dei voti � superiore o uguale a 2
	 * 
	 */
	
	
	
	
	
	
	
}