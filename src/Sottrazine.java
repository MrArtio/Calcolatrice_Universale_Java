public class Sottrazine {
        int numero1;
        int numero2;

        public Sottrazine(int numero1, int numero2) {
            this.numero1 = numero1;
            this.numero2 = numero2;
        }

        public void sottrazioneTotale() {
            if (this.numero1 != 0 && this.numero2 != 0) {
                int som = this.numero1 - this.numero2;
                System.out.print("\nSottrazione totale: " + som);
            } else {
                System.out.print("\nSottrazione non eseguita, Riprova!");
            }
        }
    }

