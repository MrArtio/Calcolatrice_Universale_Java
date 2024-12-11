package Convertitore;

public class ConvertitoreInBinario {
    // Variabile per memorizzare il numero decimale da convertire
    private int numeroDecimale;

    // Costruttore che inizializza la variabile
    public ConvertitoreInBinario(int numeroDecimale) {
        this.numeroDecimale = numeroDecimale;
    }

    // Metodo per convertire un numero decimale in binario
    private String convertiInBinario() {
        if (numeroDecimale == 0) {
            return "0";
        } else {
            StringBuilder binario = new StringBuilder();
            while (numeroDecimale > 0) {
                binario.insert(0, numeroDecimale % 2);
                numeroDecimale /= 2;
            }
            return binario.toString();
        }
    }

    // Metodo per stampare il risultato
    public void stampaRisultato() {
        String risultatoBinario = convertiInBinario();
        System.out.print("\nConvertito in binario: " + risultatoBinario);
    }
}
