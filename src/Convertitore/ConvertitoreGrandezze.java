package Convertitore;

public class ConvertitoreGrandezze {

    // Variabili per le grandezze
    private double gb;
    private double mb;
    private double kb;
    private double byteValue;

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
    public static double convertiGBaMB(double gb) {
        return gb * 1024;  // 1 GB = 1024 MB
    }

    public static double convertiGBaKB(double gb) {
        return gb * 1024 * 1024;  // 1 GB = 1024 * 1024 KB
    }

    public static double convertiGBaByte(double gb) {
        return gb * 1024 * 1024 * 1024;  // 1 GB = 1024 * 1024 * 1024 Byte
    }

    public static double convertiMBaGB(double mb) {
        return mb / 1024;  // 1 MB = 1/1024 GB
    }

    public static double convertiMBaKB(double mb) {
        return mb * 1024;  // 1 MB = 1024 KB
    }

    public static double convertiMBaByte(double mb) {
        return mb * 1024 * 1024;  // 1 MB = 1024 * 1024 Byte
    }

    public static double convertiKBaGB(double kb) {
        return kb / (1024 * 1024);  // 1 KB = 1/(1024 * 1024) GB
    }

    public static double convertiKBaMB(double kb) {
        return kb / 1024;  // 1 KB = 1/1024 MB
    }

    public static double convertiKBaByte(double kb) {
        return kb * 1024;  // 1 KB = 1024 Byte
    }

    public static double convertiByteaGB(double byteValue) {
        return byteValue / (1024 * 1024 * 1024);  // 1 Byte = 1/(1024 * 1024 * 1024) GB
    }

    public static double convertiByteaMB(double byteValue) {
        return byteValue / (1024 * 1024);  // 1 Byte = 1/(1024 * 1024) MB
    }

    public static double convertiByteaKB(double byteValue) {
        return byteValue / 1024;  // 1 Byte = 1/1024 KB
    }

    // Metodi per stampare i risultati delle conversioni
    public static void stampaConversioneDaByteaGb(double byteValue) {
        System.out.printf("\nConversione da Byte a GB: %.2f", convertiByteaGB(byteValue));
    }

    public static void stampaConversioneDaByteaMb(double byteValue) {
        System.out.printf("\nConversione da Byte a MB: %.2f", convertiByteaMB(byteValue));
    }

    public static void stampaConversioneDaByteaKb(double byteValue) {
        System.out.printf("\nConversione da Byte a KB: %.2f", convertiByteaKB(byteValue));
    }

    public static void stampaConversioneDaMbaByte(double mb) {
        System.out.printf("\nConversione da MB a Byte: %.2f", convertiMBaByte(mb));
    }

    public static void stampaConversioneDaMbaKb(double mb) {
        System.out.printf("\nConversione da MB a KB: %.2f", convertiMBaKB(mb));
    }

    public static void stampaConversioneDaMbaGb(double mb) {
        System.out.printf("\nConversione da MB a GB: %.2f", convertiMBaGB(mb));
    }

    public static void stampaConversioneGbaByte(double gb) {
        System.out.printf("\nConversione da GB a Byte: %.2f", convertiGBaByte(gb));
    }

    public static void stampaConversioneGbaKb(double gb) {
        System.out.printf("\nConversione da GB a KB: %.2f", convertiGBaKB(gb));
    }

    public static void stampaConversioneGbaMb(double gb) {
        System.out.printf("\nConversione da GB a MB: %.2f", convertiGBaMB(gb));
    }
}
