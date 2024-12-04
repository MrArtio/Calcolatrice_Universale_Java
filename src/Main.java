//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;

public class Main {
    public static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("\n1) Calcolatrice Classica");
        System.out.print("\n2) Calcolatrice Scientifica");
        System.out.print("\n");
        System.out.print("\nSeleziona: ");

        int sel = in.nextInt();

        switch (sel){
            case 1:
                calcolatriceClassica();
                break;
            case 2:
                calcolatriceScientifica();
                break;
        }
    }

    public static void calcolatriceClassica() {
        System.out.print("\nCalcolatrice Classica");
        System.out.print("\n");
        System.out.print("\n1) Somma: ");
        System.out.print("\n2) Sottrazione: ");
        System.out.print("\n3) Moltiplicazione: ");
        System.out.print("\n4) Divisione: ");
        System.out.print("\n5) Esci: ");
        System.out.print("\n");
        System.out.print("\nSelezione: ");

        int sel = in.nextInt();

        do {
            if (sel == 1) {
                System.out.print("\nInserisci primo numero: ");
                int n1 = in.nextInt();
                System.out.print("\nInserisci secondo numero: ");
                int n2 = in.nextInt();
                Somma somma = new Somma(n1, n2);
                somma.sommaTotale();
            } else if (sel == 2) {
                System.out.print("\nInserisci primo numero: ");
                int n1 = in.nextInt();
                System.out.print("\nInserisci secondo numero: ");
                int n2 = in.nextInt();
                Sottrazine sottrazine = new Sottrazine(n1,n2);
                sottrazine.sottrazioneTotale();
            } else if (sel == 3) {
                System.out.print("\nInserisci primo numero: ");
                int n1 = in.nextInt();
                System.out.print("\nInserisci secondo numero: ");
                int n2 = in.nextInt();
                Divisione divisione = new Divisione(n1, n2);
                divisione.divisioneTotale();
            } else if (sel == 4) {
                System.out.print("\nInserisci primo numero: ");
                int n1 = in.nextInt();
                System.out.print("\nInserisci secondo numero: ");
                int n2 = in.nextInt();
                Moltiplicazione moltiplicazione = new Moltiplicazione(n1, n2);
                moltiplicazione.moltiplicazioneTotale();
            }
        } while (sel == 5);
        System.out.print("\nProgramma chiuso con successo!");
    }

    public static void calcolatriceScientifica() {
        System.out.print("\nCalcolatrice Scientifica");
        System.out.print("\n");
        System.out.print("\n1) Percentuale");
        System.out.print("\n2) Radice");
        System.out.print("\n3) Esci");
        System.out.print("\n");
        System.out.print("\nSelezione: ");

        int sel = in.nextInt();

        do {
            if (sel == 1) {
                System.out.print("\nInserisci il totale: ");
                int totale = in.nextInt();
                System.out.print("\nInserisci il valore: ");
                int valore = in.nextInt();
                Percentuale percentuale = new Percentuale(totale, valore);
                percentuale.percentualeTotale();
            } else if (sel == 2) {
                System.out.print("\nInserisci il numero da calcolare: ");
                int n1 = in.nextInt();
                Radice radice = new Radice(n1);
                radice.calcoloRadice();
            }
        } while (sel == 3);
        System.out.print("\nProgramma chiuso con successo!");
    }

    public static void convertitoreUniversale() {
        System.out.print("\nConvertitore Universale");
        System.out.print("\n");
        System.out.print("\n1) Decimale/Binario");
        System.out.print("\n2) Valute");
        System.out.print("\n3) Grandezze(Gb/Mb)");
        System.out.print("\n) Esci");
        System.out.print("\n");
        System.out.print("\nSelezione: ");
    }
}