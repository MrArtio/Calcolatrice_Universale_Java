package Calcolatrice_Classica;

public class Moltiplicazione {
    int numero1;
    int numero2;

    public Moltiplicazione(int numero1, int numero2) {
        this.numero1 = numero1;
        this.numero2 = numero2;
    }

    public void moltiplicazioneTotale() {
        if (this.numero1 != 0 && this.numero2 != 0) {
            int som = this.numero1 * this.numero2;
            System.out.print("\nMoltiplicazione totale: " + som);
        } else {
            System.out.print("\nMoltiplicazione non eseguita, Riprova!");
        }
    }
}

