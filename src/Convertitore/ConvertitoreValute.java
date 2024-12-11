package Convertitore;

public class ConvertitoreValute {

    // Variabili per le valute
    private double euro;
    private double dollaro;
    private double sterlina;
    private double yen;
    private double francoSvizzero;

    // Costruttore
    public ConvertitoreValute(double euro, double dollaro, double sterlina, double yen, double francoSvizzero) {
        this.euro = euro;
        this.dollaro = dollaro;
        this.sterlina = sterlina;
        this.yen = yen;
        this.francoSvizzero = francoSvizzero;
    }

    // Funzioni di conversione tra le valute
    public double convertiEuroADollaro() {
        return this.euro * 1.06;  // Esempio di cambio (1 EUR = 1.06 USD)
    }

    public double convertiEuroAsterlina() {
        return this.euro * 0.86;  // Esempio di cambio (1 EUR = 0.86 GBP)
    }

    public double convertiEuroAYen() {
        return this.euro * 148.53;  // Esempio di cambio (1 EUR = 148.53 JPY)
    }

    public double convertiEuroAFrancoSvizzero() {
        return this.euro * 0.97;  // Esempio di cambio (1 EUR = 0.97 CHF)
    }

    public double convertiDollaroAEuro() {
        return this.dollaro / 1.06;  // Esempio di cambio (1 USD = 0.94 EUR)
    }

    public double convertiSterlinaAEuro() {
        return this.sterlina / 0.86;  // Esempio di cambio (1 GBP = 1.16 EUR)
    }

    public double convertiYenAEuro() {
        return this.yen / 148.53;  // Esempio di cambio (1 JPY = 0.0067 EUR)
    }

    public double convertiFrancoSvizzeroAEuro() {
        return this.francoSvizzero / 0.97;  // Esempio di cambio (1 CHF = 1.03 EUR)
    }

    // Metodo per stampare i risultati delle conversioni
    public void stampa() {
        System.out.println("Conversione da Euro:");
        System.out.println("Euro a Dollaro: " + convertiEuroADollaro());
        System.out.println("Euro a Sterlina: " + convertiEuroAsterlina());
        System.out.println("Euro a Yen: " + convertiEuroAYen());
        System.out.println("Euro a Franco Svizzero: " + convertiEuroAFrancoSvizzero());

        System.out.println("\nConversione da Dollaro:");
        System.out.println("Dollaro a Euro: " + convertiDollaroAEuro());

        System.out.println("\nConversione da Sterlina:");
        System.out.println("Sterlina a Euro: " + convertiSterlinaAEuro());

        System.out.println("\nConversione da Yen:");
        System.out.println("Yen a Euro: " + convertiYenAEuro());

        System.out.println("\nConversione da Franco Svizzero:");
        System.out.println("Franco Svizzero a Euro: " + convertiFrancoSvizzeroAEuro());
    }
}
