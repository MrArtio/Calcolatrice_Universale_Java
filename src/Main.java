// Importazione delle classi necessarie per le operazioni della calcolatrice e del convertitore
import Calcolatrice_Classica.Divisione;
import Calcolatrice_Classica.Moltiplicazione;
import Calcolatrice_Classica.Somma;
import Calcolatrice_Classica.Sottrazine;
import Calcolatrice_Scientifica.Percentuale;
import Calcolatrice_Scientifica.Radice;
import Convertitore.ConvertitoreInBinario;

import java.util.*;

public class Main {
    // Creazione di uno scanner per leggere l'input dell'utente
    public static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        // Stampa del menu principale
        System.out.print("\n1) Calcolatrice Classica");
        System.out.print("\n2) Calcolatrice Scientifica");
        System.out.print("\n3) Convertitore");
        System.out.print("\n");
        System.out.print("\nSeleziona: ");

        // Lettura della scelta dell'utente
        int sel = in.nextInt();

        // In base alla scelta dell'utente, viene eseguita la funzione appropriata
        switch (sel){
            case 1:
                calcolatriceClassica(); // Chiamata alla calcolatrice classica
                break;
            case 2:
                calcolatriceScientifica(); // Chiamata alla calcolatrice scientifica
                break;
            case 3:
                convertitoreUniversale(); // Chiamata al convertitore universale
                break;
        }
    }

    // Funzione per gestire la calcolatrice classica
    public static void calcolatriceClassica() {
        // Menu delle operazioni della calcolatrice classica
        System.out.print("\nCalcolatrice Classica");
        System.out.print("\n");
        System.out.print("\n1) Somma: ");
        System.out.print("\n2) Sottrazione: ");
        System.out.print("\n3) Moltiplicazione: ");
        System.out.print("\n4) Divisione: ");
        System.out.print("\n5) Esci: ");
        System.out.print("\n");
        System.out.print("\nSelezione: ");

        // Lettura della scelta dell'utente
        int sel = in.nextInt();

        // Ciclo che continua fino a quando l'utente non seleziona l'uscita
        do {
            if (sel == 1) {
                // Somma: richiede i due numeri e calcola la somma
                System.out.print("\nInserisci primo numero: ");
                int n1 = in.nextInt();
                System.out.print("\nInserisci secondo numero: ");
                int n2 = in.nextInt();
                Somma somma = new Somma(n1, n2);
                somma.sommaTotale(); // Calcola e stampa il risultato della somma
            } else if (sel == 2) {
                // Sottrazione: richiede i due numeri e calcola la sottrazione
                System.out.print("\nInserisci primo numero: ");
                int n1 = in.nextInt();
                System.out.print("\nInserisci secondo numero: ");
                int n2 = in.nextInt();
                Sottrazine sottrazine = new Sottrazine(n1, n2);
                sottrazine.sottrazioneTotale(); // Calcola e stampa il risultato della sottrazione
            } else if (sel == 3) {
                // Moltiplicazione: richiede i due numeri e calcola la moltiplicazione
                System.out.print("\nInserisci primo numero: ");
                int n1 = in.nextInt();
                System.out.print("\nInserisci secondo numero: ");
                int n2 = in.nextInt();
                Moltiplicazione moltiplicazione = new Moltiplicazione(n1, n2);
                moltiplicazione.moltiplicazioneTotale(); // Calcola e stampa il risultato della moltiplicazione
            } else if (sel == 4) {
                // Divisione: richiede i due numeri e calcola la divisione
                System.out.print("\nInserisci primo numero: ");
                int n1 = in.nextInt();
                System.out.print("\nInserisci secondo numero: ");
                int n2 = in.nextInt();
                Divisione divisione = new Divisione(n1, n2);
                divisione.divisioneTotale(); // Calcola e stampa il risultato della divisione
            }
        } while (sel != 5); // Continua il ciclo finché l'utente non sceglie di uscire
        System.out.print("\nProgramma chiuso con successo!"); // Messaggio di uscita
    }

    // Funzione per gestire la calcolatrice scientifica
    public static void calcolatriceScientifica() {
        System.out.print("\nCalcolatrice Scientifica");
        System.out.print("\n");
        // Menu delle operazioni scientifiche disponibili
        System.out.print("\n1) Percentuale");
        System.out.print("\n2) Radice");
        System.out.print("\n3) Esci");
        System.out.print("\n");
        System.out.print("\nSelezione: ");

        // Lettura della scelta dell'utente
        int sel = in.nextInt();

        // Ciclo che continua fino a quando l'utente non seleziona l'uscita
        do {
            if (sel == 1) {
                // Calcolo della percentuale: richiede il totale e il valore
                System.out.print("\nInserisci il totale: ");
                int totale = in.nextInt();
                System.out.print("\nInserisci il valore: ");
                int valore = in.nextInt();
                Percentuale percentuale = new Percentuale(totale, valore);
                percentuale.percentualeTotale(); // Calcola e stampa il risultato della percentuale
            } else if (sel == 2) {
                // Calcolo della radice quadrata: richiede un numero
                System.out.print("\nInserisci il numero da calcolare: ");
                int n1 = in.nextInt();
                Radice radice = new Radice(n1);
                radice.calcoloRadice(); // Calcola e stampa il risultato della radice quadrata
            }
        } while (sel != 3); // Continua il ciclo finché l'utente non sceglie di uscire
        System.out.print("\nProgramma chiuso con successo!"); // Messaggio di uscita
    }

    // Funzione per gestire il convertitore universale
    public static void convertitoreUniversale() {
        System.out.print("\nConvertitore Universale");
        System.out.print("\n");
        // Menu delle opzioni del convertitore
        System.out.print("\n1) Decimale -> Binario");
        System.out.print("\n2) Valute");
        System.out.print("\n3) Grandezze(Gb/Mb)");
        System.out.print("\n4) Esci");
        System.out.print("\n");
        System.out.print("\nSelezione: ");

        // Lettura della scelta dell'utente
        int sel = in.nextInt();

        // Ciclo che continua fino a quando l'utente non seleziona l'uscita
        do {
            if (sel == 1) {
                // Conversione decimale -> binario: richiede un numero decimale
                System.out.print("\nInserisci il numero da convertire in binario: ");
                int decimale = in.nextInt();
                ConvertitoreInBinario binario = new ConvertitoreInBinario(decimale);
                binario.stampaRisultato(); // Stampa il risultato della conversione in binario
            } else if (sel == 2) {
                // Opzione non implementata: Conversione valute
                System.out.print("\nInserisci il numero da calcolare: ");
                int n1 = in.nextInt();

            } else if (sel == 3) {
                // Opzione non implementata: Conversione grandezze (es. GB a MB)
                System.out.print("\nInserisci il numero da calcolare: ");
                int n1 = in.nextInt();
                // Questo codice è non implementato, ma potrebbe essere usato per la conversione tra grandezze
            }
        } while (sel != 4); // Continua il ciclo finché l'utente non sceglie di uscire
        System.out.print("\nProgramma chiuso con successo!"); // Messaggio di uscita
    }
}
