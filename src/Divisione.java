public class Divisione {
    int numero1;
    int numero2;

    public Divisione(int numero1, int numero2) {
        this.numero1 = numero1;
        this.numero2 = numero2;
    }

    public void divisioneTotale() {
        if (this.numero1 != 0 && this.numero2 != 0) {
            int som = this.numero1 * this.numero2;
            System.out.print("\nDivisione totale: " + som);
        } else {
            System.out.print("\nDivisione non eseguita, Riprova!");
        }
    }
}

