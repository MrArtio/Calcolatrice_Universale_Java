// Importazione delle classi necessarie per le operazioni della calcolatrice e del convertitore
import Calcolatrice_Classica.Divisione;
import Calcolatrice_Classica.Moltiplicazione;
import Calcolatrice_Classica.Somma;
import Calcolatrice_Classica.Sottrazine;
import Calcolatrice_Scientifica.Percentuale;
import Calcolatrice_Scientifica.Radice;
import Convertitore.ConvertitoreGrandezze;
import Convertitore.ConvertitoreInBinario;

import java.util.*;

public class Main {
    public static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        // Stampa il menu principale e ottieni la selezione dell'utente
        stampaMenuPrincipale();
        int sel = in.nextInt();

        // Gestione della selezione del menu principale tramite switch-case
        switch (sel) {
            case 1 -> calcolatriceClassica();
            case 2 -> calcolatriceScientifica();
            case 3 -> convertitoreUniversale();
            default -> System.out.println("\nSelezione non valida. Uscita dal programma.");
        }
    }

    public static void calcolatriceClassica() {
        int sel;
        do {
            // Mostra il menu per la calcolatrice classica
            stampaMenuCalcolatriceClassica();
            sel = in.nextInt();

            // Gestione delle operazioni disponibili nella calcolatrice classica
            switch (sel) {
                case 1 -> eseguiOperazioneClassica(new Somma(richiestaNumero(), richiestaNumero()));
                case 2 -> eseguiOperazioneClassica(new Sottrazine(richiestaNumero(), richiestaNumero()));
                case 3 -> eseguiOperazioneClassica(new Moltiplicazione(richiestaNumero(), richiestaNumero()));
                case 4 -> eseguiOperazioneClassica(new Divisione(richiestaNumero(), richiestaNumero()));
                case 5 -> System.out.println("\nUscita dalla calcolatrice classica.");
                default -> System.out.println("\nSelezione non valida. Riprova.");
            }
        } while (sel != 5); // Ripeti finché l'utente non seleziona "Esci"
    }

    public static void calcolatriceScientifica() {
        int sel;
        do {
            // Mostra il menu per la calcolatrice scientifica
            stampaMenuCalcolatriceScientifica();
            sel = in.nextInt();

            // Gestione delle operazioni disponibili nella calcolatrice scientifica
            switch (sel) {
                case 1 -> eseguiOperazioneScientifica(new Percentuale(richiestaNumero("Inserisci il totale"), richiestaNumero("Inserisci il valore")));
                case 2 -> eseguiOperazioneScientifica(new Radice(richiestaNumero("Inserisci il numero da calcolare")));
                case 3 -> System.out.println("\nUscita dalla calcolatrice scientifica.");
                default -> System.out.println("\nSelezione non valida. Riprova.");
            }
        } while (sel != 3); // Ripeti finché l'utente non seleziona "Esci"
    }

    public static void convertitoreUniversale() {
        int selConv;
        do {
            // Mostra il menu per il convertitore universale
            stampaMenuConvertitoreUniversale();
            selConv = in.nextInt();

            // Gestione delle operazioni disponibili nel convertitore universale
            switch (selConv) {
                case 1 -> eseguiConversioneBinaria();
                case 3 -> convertitoreGrandezze();
                case 4 -> System.out.println("\nUscita dal convertitore universale.");
                default -> System.out.println("\nSelezione non valida. Riprova.");
            }
        } while (selConv != 4); // Ripeti finché l'utente non seleziona "Esci"
    }

    public static void convertitoreGrandezze() {
        int sel;
        do {
            // Mostra il menu per il convertitore di grandezze
            stampaMenuConvertitoreGrandezze();
            sel = in.nextInt();

            // Gestione delle operazioni disponibili per le conversioni di grandezze
            switch (sel) {
                case 1 -> eseguiConversioneGrandezze("GB", "MB", ConvertitoreGrandezze::stampaConversioneGbaMb);
                case 2 -> eseguiConversioneGrandezze("GB", "KB", ConvertitoreGrandezze::stampaConversioneGbaKb);
                case 3 -> eseguiConversioneGrandezze("GB", "Byte", ConvertitoreGrandezze::stampaConversioneGbaByte);
                case 4 -> eseguiConversioneGrandezze("MB", "GB", ConvertitoreGrandezze::stampaConversioneDaMbaGb);
                case 5 -> eseguiConversioneGrandezze("MB", "KB", ConvertitoreGrandezze::stampaConversioneDaMbaKb);
                case 6 -> eseguiConversioneGrandezze("MB", "Byte", ConvertitoreGrandezze::stampaConversioneDaMbaByte);
                case 7 -> eseguiConversioneGrandezze("Byte", "GB", ConvertitoreGrandezze::stampaConversioneDaByteaGb);
                case 8 -> eseguiConversioneGrandezze("Byte", "MB", ConvertitoreGrandezze::stampaConversioneDaByteaMb);
                case 9 -> eseguiConversioneGrandezze("Byte", "KB", ConvertitoreGrandezze::stampaConversioneDaByteaKb);
                case 10 -> System.out.println("\nUscita dal convertitore grandezze.");
                default -> System.out.println("\nSelezione non valida. Riprova.");
            }
        } while (sel != 10); // Ripeti finché l'utente non seleziona "Esci"
    }

    private static void eseguiOperazioneClassica(Object operazione) {
        // Esegue l'operazione classica in base al tipo di classe istanziata
        if (operazione instanceof Somma somma) {
            somma.sommaTotale();
        } else if (operazione instanceof Sottrazine sottrazione) {
            sottrazione.sottrazioneTotale();
        } else if (operazione instanceof Moltiplicazione moltiplicazione) {
            moltiplicazione.moltiplicazioneTotale();
        } else if (operazione instanceof Divisione divisione) {
            divisione.divisioneTotale();
        }
    }

    private static void eseguiOperazioneScientifica(Object operazione) {
        // Esegue l'operazione scientifica in base al tipo di classe istanziata
        if (operazione instanceof Percentuale percentuale) {
            percentuale.percentualeTotale();
        } else if (operazione instanceof Radice radice) {
            radice.calcoloRadice();
        }
    }

    private static void eseguiConversioneBinaria() {
        // Richiede un numero e avvia la conversione in binario
        int decimale = richiestaNumero("Inserisci il numero da convertire in binario");
        ConvertitoreInBinario binario = new ConvertitoreInBinario(decimale);
        binario.stampaRisultato();
    }

    private static void eseguiConversioneGrandezze(String input, String output, Runnable metodoConversione) {
        // Richiede un valore e avvia la conversione tramite il metodo specificato
        System.out.printf("\nInserisci il numero da convertire da %s a %s: ", input, output);
        int valore = in.nextInt();
        ConvertitoreGrandezze cGrandezza = new ConvertitoreGrandezze();
        cGrandezza.setGb(valore); // Imposta il valore iniziale
        metodoConversione.run(); // Esegue il metodo di conversione
    }

    private static int richiestaNumero() {
        // Richiede un numero generico all'utente
        System.out.print("\nInserisci un numero: ");
        return in.nextInt();
    }

    private static int richiestaNumero(String messaggio) {
        // Richiede un numero con un messaggio personalizzato
        System.out.printf("%s: ", messaggio);
        return in.nextInt();
    }

    private static void stampaMenuPrincipale() {
        // Stampa il menu principale
        System.out.println("\n1) Calcolatrice Classica");
        System.out.println("2) Calcolatrice Scientifica");
        System.out.println("3) Convertitore");
        System.out.print("\nSeleziona: ");
    }

    private static void stampaMenuCalcolatriceClassica() {
        // Stampa il menu per la calcolatrice classica
        System.out.println("\nCalcolatrice Classica");
        System.out.println("1) Somma");
        System.out.println("2) Sottrazione");
        System.out.println("3) Moltiplicazione");
        System.out.println("4) Divisione");
        System.out.println("5) Esci");
        System.out.print("\nSelezione: ");
    }

    private static void stampaMenuCalcolatriceScientifica() {
        // Stampa il menu per la calcolatrice scientifica
        System.out.println("\nCalcolatrice Scientifica");
        System.out.println("1) Percentuale");
        System.out.println("2) Radice");
        System.out.println("3) Esci");
        System.out.print("\nSelezione: ");
    }

    private static void stampaMenuConvertitoreUniversale() {
        // Stampa il menu per il convertitore universale
        System.out.println("\nConvertitore Universale");
        System.out.println("1) Decimale -> Binario");
        System.out.println("2) Valute");
        System.out.println("3) Grandezze (Gb/Mb)");
        System.out.println("4) Esci");
        System.out.print("\nSelezione: ");
    }

    private static void stampaMenuConvertitoreGrandezze() {
        // Stampa il menu per il convertitore di grandezze
        System.out.println("\nConvertitore Grandezze");
        System.out.println("1) GB -> MB");
        System.out.println("2) GB -> KB");
        System.out.println("3) GB -> Byte");
        System.out.println("4) MB -> GB");
        System.out.println("5) MB -> KB");
        System.out.println("6) MB -> Byte");
        System.out.println("7) KB -> GB");
        System.out.println("8) KB -> MB");
        System.out.println("9) KB -> Byte");
        System.out.println("10) Esci");
        System.out.print("\nSelezione: ");
    }
}
