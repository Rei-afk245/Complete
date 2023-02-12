public class Kilometers {
    private int kilometers;

    public Kilometers(int kilometers) {
        this.kilometers = kilometers;
    }

    public int getKiloM() {
        return this.kilometers;
    }

    public double solve() {
        return (double) 1 / 2 * (getKiloM());
    }

    public void display() {
        System.out.printf("It takes %.1f hrs to run at %d km", solve(), getKiloM());

    }

}
