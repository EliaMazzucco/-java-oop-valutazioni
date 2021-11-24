package it.corso.valutazioni;

import java.util.Random;

public class Main {

	public static void main(String[] args) {
		
		/*/
		 * Classe Main con metodo main in cui create un array di 20 CalcolaValutazione, lo popolate con id studente progressivo (da 1 a 20), percentuale assenze e media voti generati random. 
		 * Per ogni elemento dell’array stampate a video l’id studente e se è promosso o bocciato
		 * 
		 */
		
		CalcolaValutazione [] calcolaValutazione = new CalcolaValutazione[20];
		Random randomGenerator = new Random();
		
		int idStudente = 1;
		int percAssenze;
		double mediaVoti;
	
		for (int i = 0; i < calcolaValutazione.length; i++) {
			
			
			
			percAssenze  = randomGenerator.nextInt(100);
			mediaVoti = randomGenerator.nextInt(5);	
			
			calcolaValutazione[i] = new CalcolaValutazione(idStudente, percAssenze, mediaVoti);			
			
			System.out.println("Lo studente: " + calcolaValutazione[i].idStudente + 
								"\nHa una percentuale assenze del: " + calcolaValutazione[i].percAssenze +"%" +
								"\nLa sua media dei voti è: " + calcolaValutazione[i].mediaVoti );
			calcolaValutazione[i].calcolo();		
			
			idStudente++;
		}
		
		
		
		
		
	}

}