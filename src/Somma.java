public class Somma {
    int numero1;
    int numero2;

    public Somma(int numero1, int numero2) {
        this.numero1 = numero1;
        this.numero2 = numero2;
    }

    public void sommaTotale() {
        if (this.numero1 != 0 && this.numero2 != 0) {
            int som = this.numero1 + this.numero2;
            System.out.print("\nSomma totale: " + som);
        } else {
            System.out.print("\nSomma non eseguita, Riprova!");
        }
    }
}
