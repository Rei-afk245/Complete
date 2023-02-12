public class Millimeters {
    private int mm;

    public Millimeters(int mm) {
        this.mm = mm;
    }

    public int getMM() {
        return this.mm;
    }

    public double solve() {
        return (double) this.mm / 25.4;
    }

    public void display() {
        System.out.printf("%d to inches is %.2f", getMM(), solve());
    }

}
