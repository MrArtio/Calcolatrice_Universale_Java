public class Percentuale {
    int totale;
    int valore;

    public Percentuale(int totale, int valore) {
        this.totale = totale;
        this.valore = valore;
    }

    public void percentualeTotale() {
        if (this.totale != 0 && this.valore != 0) {
            float percentuale = (float) (this.valore * 100 / this.totale);
            System.out.print("\npercentuale totale: " + percentuale + "%");
        } else {
            System.out.print("\nPercentuale non calcolata, Riprova!");
        }
    }
}
