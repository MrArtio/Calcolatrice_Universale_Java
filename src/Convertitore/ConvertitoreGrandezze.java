package Convertitore;

public class ConvertitoreGrandezze {

    // Variabili per le grandezze
    private double gb;
    private double mb;
    private double kb;
    private double byteValue;

    // Costruttore
    public ConvertitoreGrandezze(double gb, double mb, double kb, double byteValue) {
        this.gb = gb;
        this.mb = mb;
        this.kb = kb;
        this.byteValue = byteValue;
    }

    // Funzioni di conversione tra le grandezze
    public double convertiGBaMB() {
        return this.gb * 1024;  // 1 GB = 1024 MB
    }

    public double convertiGBaKB() {
        return this.gb * 1024 * 1024;  // 1 GB = 1024 * 1024 KB
    }

    public double convertiGBaByte() {
        return this.gb * 1024 * 1024 * 1024;  // 1 GB = 1024 * 1024 * 1024 Byte
    }

    public double convertiMBaGB() {
        return this.mb / 1024;  // 1 MB = 1/1024 GB
    }

    public double convertiMBaKB() {
        return this.mb * 1024;  // 1 MB = 1024 KB
    }

    public double convertiMBaByte() {
        return this.mb * 1024 * 1024;  // 1 MB = 1024 * 1024 Byte
    }

    public double convertiKBaGB() {
        return this.kb / (1024 * 1024);  // 1 KB = 1/(1024 * 1024) GB
    }

    public double convertiKBaMB() {
        return this.kb / 1024;  // 1 KB = 1/1024 MB
    }

    public double convertiKBaByte() {
        return this.kb * 1024;  // 1 KB = 1024 Byte
    }

    public double convertiByteaGB() {
        return this.byteValue / (1024 * 1024 * 1024);  // 1 Byte = 1/(1024 * 1024 * 1024) GB
    }

    public double convertiByteaMB() {
        return this.byteValue / (1024 * 1024);  // 1 Byte = 1/(1024 * 1024) MB
    }

    public double convertiByteaKB() {
        return this.byteValue / 1024;  // 1 Byte = 1/1024 KB
    }

    // Metodo per stampare il risultato finale
    public void stampaRisultati() {
        System.out.println("Conversione da GB:");
        System.out.println("GB a MB: " + convertiGBaMB());
        System.out.println("GB a KB: " + convertiGBaKB());
        System.out.println("GB a Byte: " + convertiGBaByte());

        System.out.println("\nConversione da MB:");
        System.out.println("MB a GB: " + convertiMBaGB());
        System.out.println("MB a KB: " + convertiMBaKB());
        System.out.println("MB a Byte: " + convertiMBaByte());

        System.out.println("\nConversione da KB:");
        System.out.println("KB a GB: " + convertiKBaGB());
        System.out.println("KB a MB: " + convertiKBaMB());
        System.out.println("KB a Byte: " + convertiKBaByte());

        System.out.println("\nConversione da Byte:");
        System.out.println("Byte a GB: " + convertiByteaGB());
        System.out.println("Byte a MB: " + convertiByteaMB());
        System.out.println("Byte a KB: " + convertiByteaKB());
    }

    public static void main(String[] args) {
        // Creazione dell'oggetto ConvertitoreGrandezze con valori di esempio
        ConvertitoreGrandezze convertitore = new ConvertitoreGrandezze(5, 5120, 5242880, 5368709120L);

        // Stampa dei risultati di conversione
        convertitore.stampaRisultati();
    }
}

