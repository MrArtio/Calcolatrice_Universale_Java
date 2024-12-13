package Convertitore;

public class ConvertitoreGrandezze {

    // Variabili per le grandezze
    private double gb;
    private double mb;
    private double kb;
    private double byteValue;

    // Costruttore vuoto
    public ConvertitoreGrandezze() {
        // Costruttore senza parametri, i valori verranno impostati tramite setter
    }

    // Getter e Setter per GB
    public double getGb() {
        return gb;
    }

    public void setGb(double gb) {
        this.gb = gb;
    }

    // Getter e Setter per MB
    public double getMb() {
        return mb;
    }

    public void setMb(double mb) {
        this.mb = mb;
    }

    // Getter e Setter per KB
    public double getKb() {
        return kb;
    }

    public void setKb(double kb) {
        this.kb = kb;
    }

    // Getter e Setter per Byte
    public double getByteValue() {
        return byteValue;
    }

    public void setByteValue(double byteValue) {
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

    // Metodi per stampare i risultati delle conversioni

    public void stampaConversioneDaByteaGb() {
        // Conversione da Byte a Gb
        System.out.print("\nConversione da Byte a Gb: " + convertiByteaGB());
    }

    public void stampaConversioneDaByteaMb() {
        // Conversione da Byte a Mb
        System.out.print("\nConversione da Byte a Mb: " + convertiByteaMB());
    }

    public void stampaConversioneDaByteaKb() {
        // Conversione da Byte a Kb
        System.out.print("\nConversione da Byte a Kb: " + convertiByteaKB());
    }

    public void stampaConversioneDaMbaByte() {
        // Conversione da Mb a Byte
        System.out.print("\nConversione da Mb a Byte: " + convertiMBaByte());
    }

    public void stampaConversioneDaMbaKb() {
        // Conversione da Mb a Kb
        System.out.print("\nConversione da Mb a Kb: " + convertiMBaKB());
    }

    public void stampaConversioneDaMbaGb() {
        // Conversione da Mb a Gb
        System.out.print("\nConversione da Mb a Gb: " + convertiMBaGB());
    }

    public void stampaConversioneGbaByte() {
        // Conversione da Gb a Byte
        System.out.print("\nConversione da Gb a Byte: " + convertiGBaByte());
    }

    public void stampaConversioneGbaKb() {
        // Conversione da Gb a Kb
        System.out.print("\nConversione da Gb a Kb: " + convertiGBaKB());
    }

    public void stampaConversioneGbaMb() {
        // Conversione da Gb a Mb
        System.out.print("\nConversione da Gb a Mb: " + convertiGBaMB());
    }
}
