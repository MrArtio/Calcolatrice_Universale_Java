public class Radice {
    double n1;

    public Radice(double n1) {
        this.n1 = n1;
    }

    public void calcoloRadice() {
        double calcRad = Math.sqrt(this.n1);
        System.out.print("\nLa radice è: " + calcRad);
    }
}
